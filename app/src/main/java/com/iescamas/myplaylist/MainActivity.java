package com.iescamas.myplaylist;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    boolean primeraVez = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
            ((RecyclerView)findViewById(R.id.recyclerView)).setLayoutManager(linearLayoutManager);
        }
        else {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
            ((RecyclerView)findViewById(R.id.recyclerView)).setLayoutManager(gridLayoutManager);
        }

        if (savedInstanceState!=null){
            primeraVez = savedInstanceState.getBoolean("primeraVez");
        }


    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if (primeraVez){
            ControladorMusica.initMusica();
            primeraVez=false;
        }
        ((RecyclerView)findViewById(R.id.recyclerView)).setAdapter(new AdaptadorMusica(ControladorMusica.listaCancion));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("primeraVez",primeraVez);
    }
}