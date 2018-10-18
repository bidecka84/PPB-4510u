package com.example.d2a.movie;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelViewHolder> {

    private ArrayList<Model> dataList;

    public ModelAdapter(ArrayList<Model> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_view, parent, false);
        return new ModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, int position) {
        holder.txt_title.setText(dataList.get(position).getTitle());
        holder.txt_rating.setText(dataList.get(position).getRating());
        holder.txt_status.setText(dataList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ModelViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_title, txt_rating, txt_status;

        public ModelViewHolder(View itemView) {
            super(itemView);
            txt_title = (TextView) itemView.findViewById(R.id.txttitle);
            txt_rating = (TextView) itemView.findViewById(R.id.txtrating);
            txt_status = (TextView) itemView.findViewById(R.id.txtstatus);
        }
    }

}
