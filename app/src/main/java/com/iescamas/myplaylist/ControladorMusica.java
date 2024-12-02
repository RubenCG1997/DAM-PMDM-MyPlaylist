package com.iescamas.myplaylist;

import java.util.ArrayList;
import java.util.List;

public class ControladorMusica {

    public static List<Cancion> listaCancion = new ArrayList<>();

    public static List<Cancion> getListaCancion() {
        return listaCancion;
    }

    public static void initMusica(){
        Cancion cancion;
        listaCancion.add(new Cancion("ESTOY PUTIAO","Feid",R.drawable.imgdisco1,R.raw.estoy_putiao));
        listaCancion.add(new Cancion("PPCP","Feid",R.drawable.imgdisco1,R.raw.pcpp));
        listaCancion.add(new Cancion("1XXXX RAXONES","Feid",R.drawable.imgdisco1,R.raw.unoxxx_razones));
        listaCancion.add(new Cancion("MONI","Feid",R.drawable.imgdisco1,R.raw.moni));
        listaCancion.add(new Cancion("DE REPENTE","Feid",R.drawable.imgdisco1,R.raw.de_repente));
        listaCancion.add(new Cancion("AGAIN","Feid",R.drawable.imgdisco1,R.raw.again));
        listaCancion.add(new Cancion("KLKHAY","Feid",R.drawable.imgdisco1,R.raw.klkhay));
        listaCancion.add(new Cancion("OLD NAVY","Feid",R.drawable.imgdisco1,R.raw.old_navy));
        listaCancion.add(new Cancion("11PM EN ST.REGIS","Feid",R.drawable.imgdisco1,R.raw.st_regis));
    }
}
