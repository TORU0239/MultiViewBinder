package my.com.toru.multiviewbinder.main.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainListData;
import my.com.toru.multiviewbinder.main.data.MainProductData;
import my.com.toru.multiviewbinder.uicomponent.AbsViewRenderer;

public class MainListRender extends AbsViewRenderer<MainListData, MainListViewHolder> {

    public MainListRender(int type) {
        super(type);
    }

    @Override
    public MainListViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.adapter_list, parent, false);
        return new MainListViewHolder(view);
    }

    @Override
    public void bindView(MainListData model, MainListViewHolder viewHolder) {
        viewHolder.bindDataToView(model);
    }
}