package com.example.fest;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentServicios extends Fragment {

    View view;
    Button botonEmpresa;
    Button botonProductos;
    Button botonInicio;
    Button botonSucursales;
    FragmentEmpresa fragmentEmpresa;
    FragmentProductos fragmentProductos;
    FragmentInicio fragmentInicio;
    FragmentSucursales fragmentSucursales;
    FragmentTransaction intercambio;

    public FragmentServicios() {
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
        view = inflater.inflate(R.layout.fragment_servicios, container, false);

        botonEmpresa = view.findViewById(R.id.btnEmp4);
        botonProductos = view.findViewById(R.id.btnprod4);
        botonInicio = view.findViewById(R.id.btninicio4);
        botonSucursales = view.findViewById(R.id.btnsuc4);
        intercambio = requireActivity().getSupportFragmentManager().beginTransaction();

        botonEmpresa.setOnClickListener(v -> {
            fragmentEmpresa = new FragmentEmpresa();
            intercambio.replace(R.id.contenedor_fragments, fragmentEmpresa).commit();
        });

        botonProductos.setOnClickListener(v -> {
            fragmentProductos = new FragmentProductos();
            intercambio.replace(R.id.contenedor_fragments, fragmentProductos).commit();
        });

        botonInicio.setOnClickListener(v -> {
            fragmentInicio = new FragmentInicio();
            intercambio.replace(R.id.contenedor_fragments, fragmentInicio).commit();
        });

        botonSucursales.setOnClickListener(v -> {
            fragmentSucursales = new FragmentSucursales();
            intercambio.replace(R.id.contenedor_fragments, fragmentSucursales).commit();
        });
        return view;
    }
}