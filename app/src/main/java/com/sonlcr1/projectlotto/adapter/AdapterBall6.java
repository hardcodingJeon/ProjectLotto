package com.sonlcr1.projectlotto.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sonlcr1.projectlotto.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdapterBall6 extends RecyclerView.Adapter {

    Context context;
    ArrayList<Integer> num;

    public AdapterBall6(Context context, ArrayList<Integer> num) {
        this.context = context;
        this.num = num;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.recycler_6,parent,false);
        VH holder = new VH(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh = (VH)holder;
        vh.tv.setText(num.get(position)+"");
    }

    @Override
    public int getItemCount() {
        return num.size();
    }

    class VH extends RecyclerView.ViewHolder{
        TextView tv;

        public VH(@NonNull View itemView) {
            super(itemView);
            this.tv = itemView.findViewById(R.id.tv);
        }
    }
}
