package com.PhamDuyVu.listviewcustomadapter;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listViewSinhVien);
        
        ArrayList<SinhVien> mangsinhvien = new ArrayList<SinhVien>();
        mangsinhvien.add(new SinhVien("SV A", 1990));
        mangsinhvien.add(new SinhVien("SV B", 1911));
        mangsinhvien.add(new SinhVien("SV C", 1924));
        mangsinhvien.add(new SinhVien("SV D", 1945));
        mangsinhvien.add(new SinhVien("SV E", 1920));
        
        ListAdapter adapter = new ListAdapter
						        		(MainActivity.this, 
						        		 R.layout.dong_sinh_vien, 
						        		 mangsinhvien);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
