package com.example.fest;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentEmpresa extends Fragment {
    View view;
    Button botonInicio;
    Button botonProductos;
    Button botonServicios;
    Button botonSucursales;
    FragmentInicio fragmentInicio;
    FragmentProductos fragmentProductos;
    FragmentServicios fragmentServicios;
    FragmentSucursales fragmentSucursales;
    FragmentTransaction intercambio;

    public FragmentEmpresa() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_empresa, container, false);

        botonInicio = view.findViewById(R.id.btninicio2);
        botonProductos = view.findViewById(R.id.btnprod2);
        botonServicios = view.findViewById(R.id.btnserv2);
        botonSucursales = view.findViewById(R.id.btnsuc2);
        intercambio = requireActivity().getSupportFragmentManager().beginTransaction();

        botonInicio.setOnClickListener(v -> {
            fragmentInicio = new FragmentInicio();
            intercambio.replace(R.id.contenedor_fragments, fragmentInicio).commit();
        });

        botonProductos.setOnClickListener(v -> {
            fragmentProductos = new FragmentProductos();
            intercambio.replace(R.id.contenedor_fragments, fragmentProductos).commit();
        });

        botonServicios.setOnClickListener(v -> {
            fragmentServicios = new FragmentServicios();
            intercambio.replace(R.id.contenedor_fragments, fragmentServicios).commit();
        });

        botonSucursales.setOnClickListener(v -> {
            fragmentSucursales = new FragmentSucursales();
            intercambio.replace(R.id.contenedor_fragments, fragmentSucursales).commit();
        });
        return view;
    }
}