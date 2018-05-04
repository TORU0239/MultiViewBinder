package my.com.toru.multiviewbinder.main.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainBannerData;
import my.com.toru.multiviewbinder.uicomponent.AbsViewRenderer;

public class MainBannerRender extends AbsViewRenderer<MainBannerData, MainBannerViewHolder> {

    public MainBannerRender(int type) {
        super(type);
    }

    @Override
    public MainBannerViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.adapter_banner, parent, false);
        return new MainBannerViewHolder(view);
    }

    @Override
    public void bindView(MainBannerData model, MainBannerViewHolder viewHolder) {
        viewHolder.bindDataToView(model);
    }
}