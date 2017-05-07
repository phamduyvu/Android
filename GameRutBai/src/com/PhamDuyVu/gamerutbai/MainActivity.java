package com.PhamDuyVu.gamerutbai;

import java.util.ArrayList;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView  imgLaBai;
	Button btnRutBai;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgLaBai = (ImageView)findViewById(R.id.imageViewLaBai);
        btnRutBai = (Button)findViewById(R.id.buttonRutBai);
        
        //tạo sự kiện rút bài
        btnRutBai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//tạo mảng lá bài
				ArrayList<Integer> mangLaBai = new ArrayList<Integer>();
				
				//add lá bài
				mangLaBai.add(R.drawable.c1);
				mangLaBai.add(R.drawable.c2);
				mangLaBai.add(R.drawable.c3);
				mangLaBai.add(R.drawable.c4);
				mangLaBai.add(R.drawable.c5);
				mangLaBai.add(R.drawable.c6);
				mangLaBai.add(R.drawable.c7);
				mangLaBai.add(R.drawable.c8);
				mangLaBai.add(R.drawable.c9);
				mangLaBai.add(R.drawable.c10);
				
				//tạo số Random từ số phần tử mảng
				Random r = new Random();
				int bk = r.nextInt(mangLaBai.size());
				
				//lấy bài
				imgLaBai.setImageResource(mangLaBai.get(bk));
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
