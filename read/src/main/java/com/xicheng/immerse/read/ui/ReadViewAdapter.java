package com.xicheng.immerse.read.ui;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xicheng.immerse.foundation.uilib.widget.read.TextPaperView;
import com.xicheng.immerse.foundation.uilib.viewdata.TextPaperViewData;
import com.xicheng.immerse.read.R;

import java.util.List;

/**
 *
 */
public class ReadViewAdapter extends RecyclerView.Adapter<ReadViewAdapter.ReadViewHolder> {

    private final List<TextPaperViewData> list;

    TextPaint paint = new TextPaint();

    /**
     * 阅读RecyclerView使用的适配器
     */
    ReadViewAdapter(@NonNull List<TextPaperViewData> list){
        this.list = list;
        paint.setTextSize(90);
    }

    @NonNull
    @Override
    public ReadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextPaperView view = (TextPaperView) LayoutInflater.from(parent.getContext()).inflate(R.layout.read_item_paper, parent, false);
        return new ReadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReadViewHolder holder, int position) {
        holder.setPaperViewData(list.get(position));
        holder.setPaint(paint);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ReadViewHolder extends RecyclerView.ViewHolder {

        private final TextPaperView paperView;

        public ReadViewHolder(@NonNull TextPaperView itemView) {
            super(itemView);
            paperView = itemView;
        }

        public void setPaperViewData(@NonNull TextPaperViewData viewData) {
            paperView.setViewData(viewData);
        }

        public void setPaint(TextPaint paint){
            paperView.setTextPaint(paint);
        }
    }

}
