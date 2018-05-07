package my.com.toru.multiviewbinder.main.ui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainBannerData;
import my.com.toru.multiviewbinder.main.data.MainProductData;

public class MainProductViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTxt;
    private TextView countTxt;

    public MainProductViewHolder(View itemView) {
        super(itemView);

        nameTxt  = itemView.findViewById(R.id.product_name);
        countTxt = itemView.findViewById(R.id.product_count);
    }

    public void bindDataToView(MainProductData data){
        nameTxt.setText(data.getName());
        countTxt.setText(String.valueOf(data.getCount()));
    }
}