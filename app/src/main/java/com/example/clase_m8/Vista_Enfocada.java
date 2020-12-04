package com.example.clase_m8;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Vista_Enfocada extends Fragment {
    String titulo,prioridad,descripcion,fecha,estado;

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V=inflater.inflate(R.layout.fragment_vista__enfocada, container, false);

        titulo=getArguments().getString("ITEM_TITLE");
        prioridad=getArguments().getString("ITEM_PRIO");
        descripcion=getArguments().getString("ITEM_DESC");
        fecha=getArguments().getString("ITEM_DATE");
        estado=getArguments().getString("ITEM_STATE");

        TextView titulo_1=V.findViewById(R.id.tx_titulo);
        TextView prioridad_1=V.findViewById(R.id.tx_prioridad);
        TextView descripcion_1=V.findViewById(R.id.tx_descripcion);
        TextView fecha_1=V.findViewById(R.id.tx_fecha);
        Button estado_1=V.findViewById(R.id.im_estado);

        titulo_1.setText(titulo);
        prioridad_1.setText(prioridad);
        descripcion_1.setText(descripcion);
        fecha_1.setText(fecha);
        estado_1.setText(estado);



        return V;
    }
}