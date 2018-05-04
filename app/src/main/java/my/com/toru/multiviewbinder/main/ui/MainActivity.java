package my.com.toru.multiviewbinder.main.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import my.com.toru.multiviewbinder.R;
import my.com.toru.multiviewbinder.main.data.MainBannerData;
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
        recyclerView.addItemDecoration(new DividerItemDecoration(this, RecyclerView.VERTICAL));

        MainBannerRender bannerRender = new MainBannerRender(MainBannerData.ITEM);
        bannerRender.setContext(this);
        adapter.registerRenderer(bannerRender);

        MainProductRender productRender = new MainProductRender(MainProductData.TYPE);
        productRender.setContext(this);
        adapter.registerRenderer(productRender);

        ArrayList<ListItemType> items = new ArrayList<>();
        items.add(new MainBannerData("Google", "www.google.com"));
        items.add(new MainBannerData("Apple", "www.apple.com"));
        items.add(new MainBannerData("Baidu", "www.baidu.com"));
        items.add(new MainBannerData("Didi Chuxing", "www.didi.com"));
        items.add(new MainBannerData("Grab", "www.grab.com"));
        items.add(new MainBannerData("Uber", "www.uber.com"));

        items.add(new MainProductData("Product1", 10));
        items.add(new MainProductData("Product2", 20));
        items.add(new MainProductData("Product3", 30));
        items.add(new MainProductData("Product4", 40));
        items.add(new MainProductData("Product5", 50));

        items.add(new MainProductData("Product6", 60));
        items.add(new MainProductData("Product7", 70));
        items.add(new MainProductData("Product8", 80));

        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }
}