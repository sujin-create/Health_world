package com.course.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        String name = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");
        String url = getIntent().getStringExtra("url");

        byte[] arr = getIntent().getByteArrayExtra("image1");
        Bitmap image1 = BitmapFactory.decodeByteArray(arr, 0, arr.length);

        byte[] arr2 = getIntent().getByteArrayExtra("image2");
        Bitmap image2 = BitmapFactory.decodeByteArray(arr2, 0, arr2.length);

        setData(name, url,price, image1, image2);
       // setData(name, url, price);
    }

    private void setData(String name, String url, String price, Bitmap img1, Bitmap img2){
        //, Bitmap img1, Bitmap img2

        TextView pro_name = findViewById(R.id.textView);
        TextView pro_url = findViewById(R.id.textView3);
        TextView pro_price = findViewById(R.id.textView2);
        Button another = findViewById(R.id.button4);

        ImageView pro_img1 = findViewById(R.id.imageView2);
        ImageView pro_img2 = findViewById(R.id.imageView3);

        pro_name.setText(name);
        pro_price.setText(price);
        pro_url.setText(url);
        pro_img1.setImageBitmap(img1);
        pro_img2.setImageBitmap(img2);

        pro_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:///www.google.com/search?q="+name));
                startActivity(intent);
            }
        });

    }
}