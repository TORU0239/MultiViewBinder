package my.com.toru.multiviewbinder.main.ui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainListData;
import my.com.toru.multiviewbinder.main.data.MainProductData;

public class MainListViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTxt;
    private TextView genderTxt;
    private TextView addressTxt;

    public MainListViewHolder(View itemView) {
        super(itemView);

        nameTxt  = itemView.findViewById(R.id.list_name);
        genderTxt = itemView.findViewById(R.id.list_gender);
        addressTxt = itemView.findViewById(R.id.list_address);
    }

    public void bindDataToView(MainListData data){
        nameTxt.setText(data.getName());
        genderTxt.setText(data.getGender());
        addressTxt.setText(data.getAddress());
    }
}