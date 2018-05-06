package my.com.toru.multiviewbinder.main.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainProductData;
import my.com.toru.multiviewbinder.uicomponent.AbsViewRenderer;

public class MainProductRender extends AbsViewRenderer<MainProductData, MainProductViewHolder> {

    public MainProductRender(int type) {
        super(type);
    }

    @Override
    public MainProductViewHolder createViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.adapter_product, parent, false);
        return new MainProductViewHolder(view);
    }

    @Override
    public void bindView(MainProductData model, MainProductViewHolder viewHolder) {
        viewHolder.bindDataToView(model);
    }
}