package com.stock.sync.slide;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.stock.sync.sync_slide_lib.HSRecyclerView;
import com.stock.sync.sync_slide_lib.ObserverHScrollView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.scroll_title_container)
    LinearLayout mScrollTitleContainer;
    @BindView(R.id.head_title_scroll_view)
    ObserverHScrollView mHeadTitleScrollView;
    @BindView(R.id.content_rlv)
    HSRecyclerView mContentRlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String[] titles = new String[]{"股价撬动力", "最大资金", "最高回报率", "平均涨跌(30)", "上涨15比例(30)", "平均涨跌(60)", "上涨15比例(60)", "平均涨跌(90)",
                "上涨15比例(90)", "年化收益率", "逃顶成功率", "操作股票数", "盈利股票数", "盈利股票占比", "持股最长时间", "平均持股时间", "最近上榜日"};

        for (int i = 0; i < titles.length; i++) {
            View singleTitleLayout = View.inflate(this, R.layout.item_scroll_title, null);
            ((TextView) singleTitleLayout.findViewById(R.id.title_tv)).setText(titles[i]);
            mScrollTitleContainer.addView(singleTitleLayout);
        }

        mContentRlv.setHasFixedSize(true);
        mContentRlv.setLayoutManager(new LinearLayoutManager(this));
        //rlv和header关联
        StockAdapter stockAdapter = new StockAdapter(mHeadTitleScrollView);
        mContentRlv.setAdapter(stockAdapter);


        List<String> equiteEntities = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            equiteEntities.add("test");
        }
        stockAdapter.setData(equiteEntities);
        //rlv和header关联，rlv滑動時讓header跟隨
        mContentRlv.setHorizontalScrollView(mHeadTitleScrollView);
    }
}
