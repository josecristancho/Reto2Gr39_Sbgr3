package com.example.fest;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentSucursales extends Fragment {

    View view;
    Button botonEmpresa;
    Button botonInicio;
    Button botonServicios;
    Button botonProductos;
    FragmentEmpresa fragmentEmpresa;
    FragmentInicio fragmentInicio;
    FragmentServicios fragmentServicios;
    FragmentProductos fragmentProductos;
    FragmentTransaction intercambio;

    public FragmentSucursales() {
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
        view = inflater.inflate(R.layout.fragment_sucursales, container, false);
        botonEmpresa = view.findViewById(R.id.btnemp5);
        botonInicio = view.findViewById(R.id.btninicio5);
        botonServicios = view.findViewById(R.id.btnserv5);
        botonProductos = view.findViewById(R.id.btnprod5);
        intercambio = requireActivity().getSupportFragmentManager().beginTransaction();

        botonEmpresa.setOnClickListener(v -> {
            fragmentEmpresa = new FragmentEmpresa();
            intercambio.replace(R.id.contenedor_fragments, fragmentEmpresa).commit();
        });

        botonInicio.setOnClickListener(v -> {
            fragmentInicio = new FragmentInicio();
            intercambio.replace(R.id.contenedor_fragments, fragmentInicio).commit();
        });

        botonServicios.setOnClickListener(v -> {
            fragmentServicios = new FragmentServicios();
            intercambio.replace(R.id.contenedor_fragments, fragmentServicios).commit();
        });

        botonProductos.setOnClickListener(v -> {
            fragmentProductos = new FragmentProductos();
            intercambio.replace(R.id.contenedor_fragments, fragmentProductos).commit();
        });
        return view;
    }
}