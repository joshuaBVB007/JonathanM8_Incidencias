package com.example.clase_m8;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clase_m8.db.IncidenciaBDHelper;

public class Eliminar_Incidencias extends Fragment {
    public Eliminar_Incidencias() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V=inflater.inflate(R.layout.fragment_eliminar__incidencias, container, false);

        IncidenciaBDHelper dbhelper=((Menu_principal)getActivity()).dbhelper;
        SQLiteDatabase db=((Menu_principal)getActivity()).db;

        dbhelper.eliminarIncidencias(db,dbhelper);


        return V;
    }
}