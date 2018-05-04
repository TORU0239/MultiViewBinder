package my.com.toru.multiviewbinder.main.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;

import java.util.ArrayList;

import my.com.toru.multiviewbinder.uicomponent.AbsViewRenderer;
import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public class MainAdapter extends RecyclerView.Adapter {

    @NonNull
    private final SparseArray<AbsViewRenderer> rendersArray = new SparseArray<>();

    @NonNull
    private ArrayList<ListItemType> items;

    public MainAdapter(@NonNull ArrayList<ListItemType> items) {
        this.items = items;
    }

    public void setItems(@NonNull ArrayList<ListItemType> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AbsViewRenderer renderer = rendersArray.get(viewType);
        if(renderer != null){
            return renderer.createViewHolder(parent);
        }
        throw new IllegalStateException("Not supprted item view type: " + viewType);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ListItemType item = getItem(position);
        AbsViewRenderer renderer = rendersArray.get(item.getListItemType());
        if(renderer != null){
            renderer.bindView(item, holder);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getListItemType();
    }

    public void registerRenderer(@NonNull AbsViewRenderer renderer){
        int type = renderer.getType();
        if(rendersArray.get(type) == null){
            rendersArray.put(type, renderer);
        }
        else{
            Log.w("TAG", "ViewRenderer already exists");
        }
    }

    private ListItemType getItem(int position){
        return items.get(position);
    }
}
