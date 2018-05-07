package my.com.toru.multiviewbinder.main.data;

import java.util.ArrayList;

import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public class MainHorizontalData implements ListItemType {
    public static final int TYPE = ListItemType.TYPE_HORIZONTAL;

    private ArrayList<MainHorizontalDataDetail> horizontalDetailDataList;


    public MainHorizontalData(ArrayList<MainHorizontalDataDetail> horizontalDetailDataList) {
        this.horizontalDetailDataList = horizontalDetailDataList;
    }

    public ArrayList<MainHorizontalDataDetail> getHorizontalDetailDataList() {
        return horizontalDetailDataList;
    }

    public void setHorizontalDetailDataList(ArrayList<MainHorizontalDataDetail> horizontalDetailDataList) {
        this.horizontalDetailDataList = horizontalDetailDataList;
    }

    @Override
    public int getListItemType() {
        return ListItemType.TYPE_HORIZONTAL;
    }
}
