package com.example.clase_m8;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clase_m8.db.IncidenciaBDHelper;

public class ListarIncidencias extends Fragment {

    public ListarIncidencias() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View V=inflater.inflate(R.layout.fragment_listar_incidencias, container, false);

        IncidenciaBDHelper dbhelper=new IncidenciaBDHelper(getContext());
        SQLiteDatabase db=dbhelper.getWritableDatabase();

        RecyclerView recyclerView=(RecyclerView)V.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(V.getContext()));

        MyAdapter adapter=new MyAdapter(getContext(),IncidenciaBDHelper.getAllIncidencies(db));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return V;
    }
}