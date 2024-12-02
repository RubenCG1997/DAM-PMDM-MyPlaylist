package com.iescamas.myplaylist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorMusica extends RecyclerView.Adapter<AdaptadorMusica.ViewHolder> {
    Context context;
    private List<Cancion> dataSet;

    public AdaptadorMusica(List<Cancion> listaCancion) {
        this.dataSet = listaCancion;
    }

    @NonNull
    @Override
    public AdaptadorMusica.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorMusica.ViewHolder holder, int position) {

        Cancion cancion = dataSet.get(position);

        holder.imageView.setImageResource(cancion.getMusica());
        holder.autor.setText(cancion.getNombreAutor());
        holder.titulo.setText(cancion.getTitulo());
        holder.play.setImageResource(R.drawable.play);
        holder.pause.setImageResource(R.drawable.pause);
        holder.stop.setImageResource(R.drawable.stop);


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView,play,pause,stop;
        TextView titulo,autor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titulo = itemView.findViewById(R.id.lbl_titulo);
            autor = itemView.findViewById(R.id.lbl_autor);
            play = itemView.findViewById(R.id.imgPlay);
            pause = itemView.findViewById(R.id.imgPause);
            stop = itemView.findViewById(R.id.imgStop);
        }
    }
}
