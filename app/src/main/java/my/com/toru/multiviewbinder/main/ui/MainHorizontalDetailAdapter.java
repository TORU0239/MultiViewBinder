package my.com.toru.multiviewbinder.main.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainHorizontalDataDetail;

public class MainHorizontalDetailAdapter extends RecyclerView.Adapter<MainHorizontalDetailViewHolder> {
    private Context ctx;

    private List<MainHorizontalDataDetail> mainHorizontalDataDetailList;

    public MainHorizontalDetailAdapter(Context ctx) {
        this.ctx = ctx;
    }

    public MainHorizontalDetailAdapter(Context ctx, List<MainHorizontalDataDetail> mainHorizontalDataDetailList) {
        this.ctx = ctx;
        this.mainHorizontalDataDetailList = mainHorizontalDataDetailList;
    }

    public void setMainHorizontalDataDetailList(List<MainHorizontalDataDetail> mainHorizontalDataDetailList) {
        this.mainHorizontalDataDetailList = mainHorizontalDataDetailList;
    }

    @NonNull
    @Override
    public MainHorizontalDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.adapter_horizontal_detail, parent, false);
        return new MainHorizontalDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHorizontalDetailViewHolder holder, int position) {
        holder.bindDetailData(mainHorizontalDataDetailList.get(position));
    }

    @Override
    public int getItemCount() {
        if(mainHorizontalDataDetailList == null) return 0;
        return mainHorizontalDataDetailList.size();
    }
}
