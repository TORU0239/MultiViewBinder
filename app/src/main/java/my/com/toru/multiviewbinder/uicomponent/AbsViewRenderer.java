package my.com.toru.multiviewbinder.uicomponent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public abstract class AbsViewRenderer<M extends ListItemType, VH extends RecyclerView.ViewHolder>{

    @NonNull
    private Context context;

    @NonNull
    private ListItemType type;

    public AbsViewRenderer(@NonNull Context ctx, @NonNull ListItemType type) {
        this.context = ctx;
        this.type = type;
    }

    public AbsViewRenderer(@NonNull ListItemType type) {
        this.type = type;
    }

    public void setContext(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    public Context getContext() {
        return context;
    }

    @NonNull
    public int getType() {
        return type.getListItemType();
    }

    // create viewholder
    public abstract VH createViewHolder(ViewGroup parent);

    // bind model to viewholder
    public abstract void bindView(M model, VH viewHolder);
}