package my.com.toru.multiviewbinder.main.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainHorizontalDataDetail;

public class MainHorizontalViewHolder extends RecyclerView.ViewHolder {
    private RecyclerView recyclerView;

    private MainHorizontalDetailAdapter adapter;

    public MainHorizontalViewHolder(View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.horizontal_recyclerview);
        adapter = new MainHorizontalDetailAdapter(itemView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    protected void bindItem(List<MainHorizontalDataDetail> horizontalDataDetailList){
        adapter.setMainHorizontalDataDetailList(horizontalDataDetailList);
        adapter.notifyDataSetChanged();
    }
}