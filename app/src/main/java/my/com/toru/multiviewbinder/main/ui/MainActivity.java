package my.com.toru.multiviewbinder.main.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainBannerData;
import my.com.toru.multiviewbinder.main.data.MainHorizontalData;
import my.com.toru.multiviewbinder.main.data.MainHorizontalDataDetail;
import my.com.toru.multiviewbinder.main.data.MainListData;
import my.com.toru.multiviewbinder.main.data.MainProductData;
import my.com.toru.multiviewbinder.uicomponent.ListItemType;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        adapter = new MainAdapter(new ArrayList<ListItemType>());
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        MainBannerRender bannerRender = new MainBannerRender(MainBannerData.ITEM);
        bannerRender.setContext(this);
        adapter.registerRenderer(bannerRender);

        MainProductRender productRender = new MainProductRender(MainProductData.TYPE);
        productRender.setContext(this);
        adapter.registerRenderer(productRender);

        MainListRender listRender = new MainListRender(MainListData.TYPE);
        listRender.setContext(this);
        adapter.registerRenderer(listRender);

        MainHorizontalRenderer horizontalRenderer = new MainHorizontalRenderer(MainHorizontalData.TYPE);
        horizontalRenderer.setContext(this);
        adapter.registerRenderer(horizontalRenderer);

        initRender();
    }

    private void initRender(){
        ArrayList<ListItemType> items = new ArrayList<>();
        ArrayList<ListItemType> items2 = new ArrayList<>();
        ArrayList<ListItemType> item3 = new ArrayList<>();

        ArrayList<ListItemType> item4 = new ArrayList<>();

        items.add(new MainBannerData("Google", "www.google.com"));
        items.add(new MainBannerData("Apple", "www.apple.com"));
        items.add(new MainBannerData("Baidu", "www.baidu.com"));
        items.add(new MainBannerData("Didi Chuxing", "www.didi.com"));
        items.add(new MainBannerData("Grab", "www.grab.com"));
        items.add(new MainBannerData("Uber", "www.uber.com"));

        items.add(new MainBannerData("Google", "www.google.com"));
        items.add(new MainBannerData("Apple", "www.apple.com"));
        items.add(new MainBannerData("Baidu", "www.baidu.com"));
        items.add(new MainBannerData("Didi Chuxing", "www.didi.com"));
        items.add(new MainBannerData("Grab", "www.grab.com"));
        items.add(new MainBannerData("Uber", "www.uber.com"));

        items.add(new MainBannerData("Google", "www.google.com"));
        items.add(new MainBannerData("Apple", "www.apple.com"));
        items.add(new MainBannerData("Baidu", "www.baidu.com"));
        items.add(new MainBannerData("Didi Chuxing", "www.didi.com"));
        items.add(new MainBannerData("Grab", "www.grab.com"));
        items.add(new MainBannerData("Uber", "www.uber.com"));

        items.add(new MainBannerData("Google", "www.google.com"));
        items.add(new MainBannerData("Apple", "www.apple.com"));
        items.add(new MainBannerData("Baidu", "www.baidu.com"));
        items.add(new MainBannerData("Didi Chuxing", "www.didi.com"));
        items.add(new MainBannerData("Grab", "www.grab.com"));
        items.add(new MainBannerData("Uber", "www.uber.com"));

        items2.add(new MainProductData("Product1", 10));
        items2.add(new MainProductData("Product2", 20));
        items2.add(new MainProductData("Product3", 30));
        items2.add(new MainProductData("Product4", 40));
        items2.add(new MainProductData("Product5", 50));

        items2.add(new MainProductData("Product6", 60));
        items2.add(new MainProductData("Product7", 70));
        items2.add(new MainProductData("Product8", 80));

        item3.add(new MainListData("Toru", "Male", "KLCC"));
        item3.add(new MainListData("Kar Heng", "Male", "Glenmarie"));
        item3.add(new MainListData("JT", "Male", "Ampang"));
        item3.add(new MainListData("Christine", "Female", "Kepong"));
        item3.add(new MainListData("Henry", "Male", "Sunway"));


        ArrayList<MainHorizontalDataDetail> details = new ArrayList<>();
        details.add(new MainHorizontalDataDetail("NU SENTRAL", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("SEPHORA", "1,000", "5PS"));
        details.add(new MainHorizontalDataDetail("11STREET", "5,000", "20PS"));
        details.add(new MainHorizontalDataDetail("LAZADA", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("QOO10", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("JD.COM", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("ALI EXPRESS", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("GUARDIAN", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("XIAOMI", "10,000", "20PS"));
        details.add(new MainHorizontalDataDetail("OPPO", "10,000", "20PS"));

        item4.add(new MainHorizontalData(details));

        adapter.setItems(items, false);
        adapter.notifyItemInserted(items.size());

        adapter.setItems(item3);
        adapter.notifyItemInserted(item3.size());

        adapter.setItems(item4);
        adapter.notifyItemInserted(item4.size());

        adapter.setItems(items2,false);
        adapter.notifyItemInserted(items2.size());
    }
}