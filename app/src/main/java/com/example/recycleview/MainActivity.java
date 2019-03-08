package com.example.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); // 初始化水果数据
        initFruits2(); // 初始化水果数据《瀑布流：名字长度不一样，更好展示不对齐》
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        
        //线性布局
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //不写默认垂直布局
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //水平布局
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //表格布局
//        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        //瀑布流（垂直方向）
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //添加分割线
//        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
//        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));

        fruitAdapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);

        //谷歌提供了一个默认的item删除添加的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }

    private void initFruits2() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(
                    getRandomLengthName("Apple"), R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(
                    getRandomLengthName("Banana"), R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit(
                    getRandomLengthName("Orange"), R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(
                    getRandomLengthName("Watermelon"), R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(
                    getRandomLengthName("Pear"), R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit(
                    getRandomLengthName("Grape"), R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(
                    getRandomLengthName("Pineapple"), R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(
                    getRandomLengthName("Strawberry"), R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(
                    getRandomLengthName("Cherry"), R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit(
                    getRandomLengthName("Mango"), R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
