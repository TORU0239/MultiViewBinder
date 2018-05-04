package my.com.toru.multiviewbinder.main.data;

import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public final class MainBannerData implements ListItemType{
    private String name;
    private String url;

    public MainBannerData(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int getListItemType() {
        return ListItemType.TYPE_BANNER;
    }
}