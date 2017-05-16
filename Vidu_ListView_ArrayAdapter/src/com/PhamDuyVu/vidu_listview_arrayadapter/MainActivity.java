package com.PhamDuyVu.vidu_listview_arrayadapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listView = (ListView)findViewById(R.id.listView);
        
        UserAccount tom = new UserAccount("Tom", "admin");
        UserAccount jerry = new UserAccount("Jerry","user");
        UserAccount donald = new UserAccount("Donald","guest", false);
        
        UserAccount[] users = new UserAccount[]{tom,jerry,donald};
        
        ArrayAdapter<UserAccount> arrayAdapter 
        	= new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1, users);
        
        listView.setAdapter(arrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
