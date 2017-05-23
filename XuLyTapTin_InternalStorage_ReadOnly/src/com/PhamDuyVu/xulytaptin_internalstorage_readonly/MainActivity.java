package com.PhamDuyVu.xulytaptin_internalstorage_readonly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.message.BufferedHeader;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText editdata;
	Button readdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editdata = (EditText)findViewById(R.id.editdata);
        
        readdata = (Button)findViewById(R.id.btnreaddata);
        readdata.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				readData();
			}
		});
    }

    public void readData(){
    	String data;
    	InputStream in = getResources().openRawResource(R.drawable.myfile);
    	InputStreamReader inreader = new InputStreamReader(in);
    	BufferedReader bufreader = new BufferedReader(inreader);
    	StringBuilder builder = new StringBuilder();
    	if(in != null)
    	{
    		try{
    			while((data = bufreader.readLine()) != null)
    			{
    				builder.append(data);
    				builder.append("\n");
    			}
    			in.close();
    			editdata.setText(builder.toString());
    		}catch(IOException ex){
    			Log.e("ERROR", ex.getMessage());
    		}
    	}
    			
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
