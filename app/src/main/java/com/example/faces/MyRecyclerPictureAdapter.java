package com.example.faces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerPictureAdapter extends RecyclerView.Adapter<MyRecyclerPictureAdapter.MyViewHolder> {
    Context con;
    ArrayList<String> data;

    public MyRecyclerPictureAdapter(Context con, ArrayList<String> data) {
        this.con = con;
        this.data = data;
    }

    @NonNull
    @Override
    public MyRecyclerPictureAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layInf = LayoutInflater.from(con);
        View v = layInf.inflate(R.layout.picture_view, null);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerPictureAdapter.MyViewHolder holder, int position) {
        holder.tvnome.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvnome, tvprenom, tvnum;
        ImageButton callBtn, editBtn, delBtn;
        public MyViewHolder(@NonNull View v) {
            super(v);

            // recup des vue holders
            tvnome = v.findViewById(R.id.tvnome);
            /*prenom = v.findViewById(R.id.tv_prenom_contact);
            tvnum = v.findViewById(R.id.tv_num_contact);

            // recup des boutons
            callBtn = v.findViewById(R.id.callBtn_aff);
            editBtn = v.findViewById(R.id.editBtn_aff);
            delBtn = v.findViewById(R.id.delBtn_aff);
*/
            /*delBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int indice = getAdapterPosition(); // retourne la pos de l'elem selectionné
                    data.remove(indice);
                    MyRecyclerPictureAdapter.this.notifyDataSetChanged();
                }
            });*/

           /* editBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(con);
                    builder.setTitle("Edition");
                    builder.setMessage("choisir une action:");

                    // inflater etc
                    // builder.setView(dialog_view);
                    
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            });*/

        }
    }
}
