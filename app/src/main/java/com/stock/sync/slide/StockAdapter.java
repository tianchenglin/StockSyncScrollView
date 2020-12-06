package com.stock.sync.slide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.stock.sync.sync_slide_lib.ObserverHScrollView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.ViewHolder> {
    private ObserverHScrollView mObserverHScrollView;

    private List<String> mEntities;

    public StockAdapter(ObserverHScrollView observerHScrollView) {
        mObserverHScrollView = observerHScrollView;
        mEntities = new ArrayList<>();
    }

    public void setData(List<String> entities) {
        this.mEntities.clear();
        mEntities.addAll(entities);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scroll_content, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        //header和lv关联,header滑動時item跟隨
        mObserverHScrollView.addOnScrollChangedListener(new ObserverHScrollView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int l, int t, int oldl, int oldt) {
                holder.mContentScrollView.smoothScrollTo(l, t);
            }
        });

        holder.mNameTv.setText("北京澤盈證券投資基金");
        holder.mTv1.setText("1");
        holder.mTv2.setText("2");
        holder.mTv3.setText("3");
        holder.mTv4.setText("4");
        holder.mTv5.setText("5");
        holder.mTv6.setText("6");
        holder.mTv7.setText("7");
        holder.mTv8.setText("8");
        holder.mTv9.setText("9");
        holder.mTv10.setText("10");
        holder.mTv11.setText("11");
        holder.mTv12.setText("12");
        holder.mTv13.setText("13");
        holder.mTv14.setText("14");
        holder.mTv15.setText("15");
        holder.mTv16.setText("16");
        holder.mTv17.setText("17");
    }

    @Override
    public int getItemCount() {
        return mEntities.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name_tv)
        TextView mNameTv;
        @BindView(R.id.tv_1)
        TextView mTv1;
        @BindView(R.id.tv_2)
        TextView mTv2;
        @BindView(R.id.tv_3)
        TextView mTv3;
        @BindView(R.id.tv_4)
        TextView mTv4;
        @BindView(R.id.tv_5)
        TextView mTv5;
        @BindView(R.id.tv_6)
        TextView mTv6;
        @BindView(R.id.tv_7)
        TextView mTv7;
        @BindView(R.id.tv_8)
        TextView mTv8;
        @BindView(R.id.tv_9)
        TextView mTv9;
        @BindView(R.id.tv_10)
        TextView mTv10;
        @BindView(R.id.tv_11)
        TextView mTv11;
        @BindView(R.id.tv_12)
        TextView mTv12;
        @BindView(R.id.tv_13)
        TextView mTv13;
        @BindView(R.id.tv_14)
        TextView mTv14;
        @BindView(R.id.tv_15)
        TextView mTv15;
        @BindView(R.id.tv_16)
        TextView mTv16;
        @BindView(R.id.tv_17)
        TextView mTv17;
        @BindView(R.id.content_scroll_view)
        ObserverHScrollView mContentScrollView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

