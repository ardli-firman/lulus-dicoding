package com.ardli.submissiondicoding.framework;

import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ardli.submissiondicoding.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListFrameworkAdapter extends RecyclerView.Adapter<ListFrameworkAdapter.ListViewHolder> {
    private ArrayList<Framework> listFramework;
    private OnFrameworkListener mOnFrameworkListener;

    public ListFrameworkAdapter(ArrayList<Framework> listFramework, OnFrameworkListener onFrameworkListener) {
        this.listFramework = listFramework;
        this.mOnFrameworkListener = onFrameworkListener;
    }

    @NonNull
    @Override
    public ListFrameworkAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_frameworks, parent, false);
        return new ListViewHolder(view, mOnFrameworkListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ListFrameworkAdapter.ListViewHolder holder, int position) {
        Framework framework = listFramework.get(position);
        Glide.with(holder.itemView.getContext())
                .load(framework.getImage())
                .apply(new RequestOptions().override(70, 70))
                .into(holder.imgFramework);
        holder.tvNama.setText(framework.getNama());
        holder.tvDetail.setText(framework.getDetail());
        if (framework.getBahasa().contains("Javascript")) {
            holder.bhsFw.setBackgroundColor(Color.parseColor("#FFFDD835"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        if (framework.getBahasa().contains("PHP")) {
            holder.bhsFw.setBackgroundColor(Color.parseColor("#FF8E24AA"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        if (framework.getBahasa() == "Java"){
            holder.bhsFw.setBackgroundColor(Color.parseColor("#FF0091EA"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        if (framework.getBahasa().contains("Typescript")){
            holder.bhsFw.setBackgroundColor(Color.parseColor("#FF304FFE"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        if (framework.getBahasa().contains("Python")){
            holder.bhsFw.setBackgroundColor(Color.parseColor("#FF00C853"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        if (framework.getBahasa().contains("Ruby")){
            holder.bhsFw.setBackgroundColor(Color.parseColor("#D50000"));
            holder.bhsFw.setTextColor(Color.WHITE);
        }
        holder.bhsFw.setText(framework.getBahasa());
    }

    @Override
    public int getItemCount() {
        return listFramework.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgFramework;
        TextView tvNama, tvDetail;
        Button jnsFw, bhsFw;
        OnFrameworkListener onFrameworkListener;

        public ListViewHolder(@NonNull View itemView, OnFrameworkListener onFrameworkListener) {
            super(itemView);
            imgFramework = itemView.findViewById(R.id.img_fw);
            tvNama = itemView.findViewById(R.id.tv_nama_fw);
            tvDetail = itemView.findViewById(R.id.tv_detail_fw);
            bhsFw = itemView.findViewById(R.id.btn_bhs_program);
            this.onFrameworkListener = onFrameworkListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onFrameworkListener.onFrameworkClick(getAdapterPosition());
        }
    }

    public interface OnFrameworkListener {
        void onFrameworkClick(int position);
    }
}
