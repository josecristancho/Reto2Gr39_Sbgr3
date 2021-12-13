package com.example.fest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Fragment subPantallaInicio;
    Fragment subPantallaProductos;
    Fragment subPantallaServicios;
    Fragment subPantallaEmpresa;
    Fragment subPantallaSucursal;
    Fragment subPantallaFavoritos;
    FragmentTransaction intercambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*---------------------------------------------------------------------------------------------*/
        subPantallaInicio = new FragmentInicio();
        subPantallaProductos = new FragmentProductos();
        subPantallaServicios = new FragmentServicios();
        subPantallaEmpresa = new FragmentEmpresa();
        subPantallaSucursal = new FragmentSucursales();
        subPantallaFavoritos = new FragmentFavoritos();
        intercambio = getSupportFragmentManager().beginTransaction();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio).commit();
/*---------------------------------------------------------------------------------------------*/
    }
/*----------------------------------------------------------------*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menufest, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        intercambio = getSupportFragmentManager().beginTransaction();
        if(id == R.id.itemempresa){
            intercambio.replace(R.id.contenedor_fragments, subPantallaEmpresa).commit();
        }
        if(id == R.id.itemprod){
            intercambio.replace(R.id.contenedor_fragments, subPantallaProductos).commit();
        }
        if(id == R.id.itemserv){
            intercambio.replace(R.id.contenedor_fragments, subPantallaServicios).commit();
        }
        if(id == R.id.itemsuc){
            intercambio.replace(R.id.contenedor_fragments, subPantallaSucursal).commit();
        }
        if(id == R.id.itemfav){
            intercambio.replace(R.id.contenedor_fragments, subPantallaSucursal).commit();
        }
        return super.onOptionsItemSelected(item);
    }

}