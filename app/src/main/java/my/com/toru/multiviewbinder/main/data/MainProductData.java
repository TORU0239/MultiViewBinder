package my.com.toru.multiviewbinder.main.data;

import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public final class MainProductData implements ListItemType{
    public static final int TYPE = 1;

    private String name;
    private int count;

    public MainProductData(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getListItemType() {
        return ListItemType.TYPE_PRODUCT;
    }
}