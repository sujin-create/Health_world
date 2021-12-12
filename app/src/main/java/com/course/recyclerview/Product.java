package com.course.recyclerview;

public class Product {

    String product_name;
    int image_id1;
    int image_id2;
    String product_url;
    String product_price;

    public Product(int id1, int id2, String name, String url, String price) {
        this.image_id1 = id1;
        this.image_id2 = id2;
        this.product_name = name;
        this.product_url = url;
        this.product_price = price;
    }

    public String getSchoolName() {
        return product_name;
    }

    public int getImageID1() {
        return image_id1;
    }

    public int getImageID2() {
        return image_id2;
    }

    public String getImagePrice() {
        return product_price;
    }

    public String getURL(){
        return product_url;
    }
}
