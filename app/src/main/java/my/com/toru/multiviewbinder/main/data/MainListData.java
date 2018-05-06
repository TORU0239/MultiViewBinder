package my.com.toru.multiviewbinder.main.data;

import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public final class MainListData implements ListItemType{
    public static final int TYPE = 2;

    private String name;
    private String gender;
    private String address;

    public MainListData(String name, String gender, String address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getListItemType() {
        return ListItemType.TYPE_LIST;
    }
}