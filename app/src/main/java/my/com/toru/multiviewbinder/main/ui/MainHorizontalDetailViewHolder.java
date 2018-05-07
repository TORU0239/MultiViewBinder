package my.com.toru.multiviewbinder.main.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainHorizontalDataDetail;

public class MainHorizontalDetailViewHolder extends RecyclerView.ViewHolder {

    private TextView shopNameTxt;
    private TextView priceTxt;
    private TextView discountTxt;

    public MainHorizontalDetailViewHolder(View itemView) {
        super(itemView);
        shopNameTxt = itemView.findViewById(R.id.horizontal_detail_shop_name);
        priceTxt    = itemView.findViewById(R.id.horizontal_detail_price);
        discountTxt = itemView.findViewById(R.id.horizontal_detail_percentage);
    }

    protected void bindDetailData(MainHorizontalDataDetail detailData){
        shopNameTxt.setText(detailData.getShopName());
        priceTxt.setText(detailData.getShopDealPrice());
        discountTxt.setText(detailData.getDiscountRate());
    }
}