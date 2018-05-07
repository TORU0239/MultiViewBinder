package my.com.toru.multiviewbinder.main.ui.renderer;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainHorizontalData;
import my.com.toru.multiviewbinder.main.ui.viewholder.MainHorizontalViewHolder;
import my.com.toru.multiviewbinder.uicomponent.AbsViewRenderer;

public class MainHorizontalRenderer extends AbsViewRenderer<MainHorizontalData, MainHorizontalViewHolder> {
    public MainHorizontalRenderer(@NonNull int type) {
        super(type);
    }

    @Override
    public MainHorizontalViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.adapter_horizontal, parent, false);
        return new MainHorizontalViewHolder(view);
    }

    @Override
    public void bindView(MainHorizontalData model, MainHorizontalViewHolder viewHolder) {
        viewHolder.bindItem(model.getHorizontalDetailDataList());
    }
}