package my.com.toru.multiviewbinder.main.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainBannerData;

public class MainBannerViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTxt;
    private TextView urlTxt;

    public MainBannerViewHolder(View itemView) {
        super(itemView);

        nameTxt = itemView.findViewById(R.id.banner_name);
        urlTxt = itemView.findViewById(R.id.banner_url);
    }

    protected void bindDataToView(MainBannerData data){
        nameTxt.setText(data.getName());
        urlTxt.setText(data.getUrl());
    }
}