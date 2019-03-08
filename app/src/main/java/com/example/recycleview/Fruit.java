package com.example.recycleview;

/**
 * author: Qianfei
 * desc:水果类
 * created at: 2019/1/18
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}