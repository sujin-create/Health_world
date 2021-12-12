package com.course.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

// activity_main 레이아웃의 RecyclerView 객체를 불러와서 이를 어댑테와 연결시키는 역할
public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리싸이클러뷰에 레이아웃을 설정해준다. 이 레이아웃은 xml으로 만들어준 내용을 사용한다.
        myRecyclerView = findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        //아이템들을 목록으로 만들어 준다. 목록은 Arraylist 객체를 사용한다.
        ArrayList<Product> schoolsInfo = new ArrayList<>();

        schoolsInfo.add(new Product(R.drawable.belt, R.drawable.belt2, "운동벨트", "https://ergobody.co.kr/product/detail.html?product_no=127&gclid=Cj0KCQiA2NaNBhDvARIsAEw55hjne0q5SSViCgnvWvfSRBvcsCBtjWn1n_n10gB9y8quyh7ZbF-k2lkaAg0AEALw_wcB", "35000"));
        schoolsInfo.add(new Product(R.drawable.bench_press, R.drawable.bench_press2, "벤치프레스", "https://www.naver.com/", "99000"));
        schoolsInfo.add(new Product(R.drawable.chicken_breast, R.drawable.chicken_breast2,"닭가슴살", "https://www.wizwid.com/CSW/handler/wizwid/kr/MallProduct-Start?AssortID=704642704&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2GgNBp-_lkMl-sn4N8r38p7XiBnAylELfmkRjW6u6Gmr-qBTsoQ1DkaAvLDEALw_wcB", "12000"));
        schoolsInfo.add(new Product(R.drawable.dumbbell, R.drawable.dumbbell2, "덤벨", "https://www.coupang.com/vp/products/16410122?itemId=66855569&vendorItemId=3106691997&src=1042503&spec=10304984&addtag=400&ctag=16410122&lptag=10304984I66855569&itime=20211201152110&pageType=PRODUCT&pageValue=16410122&wPcid=16383396706979294846928&wRef=&wTime=20211201152110&redirect=landing&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2Gzpe65qKk6qfMQjrVc7MtC1wncXZwVfIUMM3YbJB0BRBfFQMYFDOcaAgbsEALw_wcB&campaignid=12654692775&adgroupid=120203246637&isAddedCart=", "13000"));
        schoolsInfo.add(new Product(R.drawable.gimbal, R.drawable.gimbal2, "짐볼", "https://www.navimro.com/p/items/K40392847/?access_google_shopping&utm_source=google&utm_medium=shopping&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2EyWzDb5XrgW3gWHHJr8yPq4Og0dQclkWzEcnZZoNS_6A2M5Q4dqyMaAgJIEALw_wcB", "9000"));
        schoolsInfo.add(new Product(R.drawable.jump_rope, R.drawable.jump_rope2,"줄넘기", "https://www.coupang.com/vp/products/12883235?itemId=614606334&vendorItemId=4939611394&src=1042503&spec=10304984&addtag=400&ctag=12883235&lptag=10304984I614606334&itime=20211201152413&pageType=PRODUCT&pageValue=12883235&wPcid=16383396706979294846928&wRef=&wTime=20211201152413&redirect=landing&gclid=&campaignid=&adgroupid=&isAddedCart=", "20000"));
        schoolsInfo.add(new Product(R.drawable.metal_pole, R.drawable.metal_pole2,"철봉", "https://www.coupang.com/vp/products/5766451078?itemId=9783323951&vendorItemId=77067074984&src=1042503&spec=10304982&addtag=400&ctag=5766451078&lptag=10304982I9783323951&itime=20211212181401&pageType=PRODUCT&pageValue=5766451078&wPcid=16393004411907907340198&wRef=&wTime=20211212181401&redirect=landing&gclid=Cj0KCQiA2NaNBhDvARIsAEw55hjJdOpjldrX10_WAGGV4zH63OfgFMm8ax0fd4AUm4wU4tXWzTAcPz8aAvqxEALw_wcB&campaignid=12186872313&adgroupid=119970050071", "87000"));
        schoolsInfo.add(new Product(R.drawable.protein_shake, R.drawable.protein_shake2,"단백질쉐이크", "https://exxxtreme.co.kr/product/detail.html?product_no=25&cafe_mkt=google_dy&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2ER-yI-8spFeK2EBOsu_a3PmIzSAoB83IFTv2IRsUmSpJz6ET_0_REaAprNEALw_wcB", "15000"));
        schoolsInfo.add(new Product(R.drawable.sportswear, R.drawable.sportswear2,"스포츠웨어", "https://shop.adidas.co.kr/PF020401.action?PROD_CD=GL2188&_OC_=GDN_DY&source=http://www.GDN.com/&xdr=&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2FmvXqX9dvES1wqFt7dVZ0CwlPKxwn4AZo_8wkBkjlf9yqfvi34LCoaArt6EALw_wcB", "40000"));
        schoolsInfo.add(new Product(R.drawable.yoga_mat, R.drawable.yoga_mat2,"요가매트", "https://www.shopit.co.kr/goods/goods_view.php?goodsNo=1000000231&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2EWXzlkmh90DMJDTWZJEv6cI5m4WOzVccrvgTl0k9n1fHTcLMWC4TAaAu-VEALw_wcB", "9999"));

        // 목록을 어댑터에 연결해 준다.
        MyAdapter myAdapter = new MyAdapter(schoolsInfo);
        // 어댑터를 뷰에 연결해 준다.
        myRecyclerView.setAdapter(myAdapter);

        //전화, 이메일, 지도 버튼
        Button call = findViewById(R.id.button);
        Button email = findViewById(R.id.button2);
        Button map = findViewById(R.id.button3);

        //전화번호
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01087509331"));
                startActivity(intent);
            }
        });

        //이메일
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

        //구글 맵
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri=Uri.parse("http://maps.google.com/maps?q="+37.5582492+","+127.0001892);
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }

    protected void sendEmail() {
        String[] TO = {"qsoojinq@naver.com"};
        String[] CC = {"qsoojinq@naver.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);

        try{
            startActivity(Intent.createChooser(emailIntent, "이메일 보내기..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(MainActivity.this, "이메일 클라이언트가 없네요", Toast.LENGTH_SHORT).show();
        }
    }

}