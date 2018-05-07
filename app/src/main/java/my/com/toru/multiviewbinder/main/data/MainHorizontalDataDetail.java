package my.com.toru.multiviewbinder.main.data;

import java.util.Objects;

public class MainHorizontalDataDetail {
    private String shopName;
    private String shopDealPrice;
    private String discountRate;

    public MainHorizontalDataDetail(String shopName, String shopDealPrice, String discountRate) {
        this.shopName = shopName;
        this.shopDealPrice = shopDealPrice;
        this.discountRate = discountRate;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDealPrice() {
        return shopDealPrice;
    }

    public void setShopDealPrice(String shopDealPrice) {
        this.shopDealPrice = shopDealPrice;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }
}