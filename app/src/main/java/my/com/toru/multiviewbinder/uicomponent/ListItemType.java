package my.com.toru.multiviewbinder.uicomponent;

public interface ListItemType {
    int TYPE_BANNER = 0;
    int TYPE_PRODUCT = 1;
    int TYPE_LIST = 2;
    int TYPE_HORIZONTAL = 3;

    int getListItemType();
}