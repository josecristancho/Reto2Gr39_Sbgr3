package com.example.fest;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentProductos extends Fragment {

    View view;
    Button botonEmpresa;
    Button botonInicio;
    Button botonServicios;
    Button botonSucursales;
    FragmentEmpresa fragmentEmpresa;
    FragmentInicio fragmentInicio;
    FragmentServicios fragmentServicios;
    FragmentSucursales fragmentSucursales;
    FragmentTransaction intercambio;

    public FragmentProductos() {
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
        view = inflater.inflate(R.layout.fragment_productos, container, false);

        botonEmpresa = view.findViewById(R.id.btnEmp3);
        botonInicio = view.findViewById(R.id.btninicio3);
        botonServicios = view.findViewById(R.id.btnserv3);
        botonSucursales = view.findViewById(R.id.btnsuc3);
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

        botonSucursales.setOnClickListener(v -> {
            fragmentSucursales = new FragmentSucursales();
            intercambio.replace(R.id.contenedor_fragments, fragmentSucursales).commit();
        });
        return view;
    }
}