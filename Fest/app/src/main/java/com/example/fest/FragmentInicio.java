package com.example.fest;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentInicio extends Fragment {

    View view;
    Button botonEmpresa;
    Button botonProductos;
    Button botonServicios;
    Button botonSucursales;
    FragmentEmpresa fragmentEmpresa;
    FragmentProductos fragmentProductos;
    FragmentServicios fragmentServicios;
    FragmentSucursales fragmentSucursales;
    FragmentTransaction intercambio;


    public FragmentInicio() {
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
        view = inflater.inflate(R.layout.fragment_inicio, container, false);

        botonEmpresa = view.findViewById(R.id.btnfest);
        botonProductos = view.findViewById(R.id.btnprod);
        botonServicios = view.findViewById(R.id.btnserv);
        botonSucursales = view.findViewById(R.id.btnsuc);
        intercambio = requireActivity().getSupportFragmentManager().beginTransaction();

        botonEmpresa.setOnClickListener(v -> {
            fragmentEmpresa = new FragmentEmpresa();
            intercambio.replace(R.id.contenedor_fragments, fragmentEmpresa).commit();
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