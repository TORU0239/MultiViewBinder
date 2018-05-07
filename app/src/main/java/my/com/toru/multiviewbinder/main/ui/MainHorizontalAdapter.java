package my.com.toru.multiviewbinder.main.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import my.com.toru.multiviewbinder.R;

// Initializing Data in nested RecyclerView
public class MainHorizontalAdapter extends RecyclerView.Adapter<MainHorizontalViewHolder> {
    private static final String TAG = MainHorizontalAdapter.class.getSimpleName();

    private Context context;

    public MainHorizontalAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MainHorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_horizontal, parent, false);
        return new MainHorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHorizontalViewHolder holder, int position) {
        holder.bindItem();
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}