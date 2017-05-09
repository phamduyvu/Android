package com.PhamDuyVu.maytinhdongian;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{

	Float kq1, kq2;
	
	Character dau = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtkq = (TextView)findViewById(R.id.txtKetQua);
        
    	Button so0 = (Button)findViewById(R.id.btnSo0);
    	so0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"0");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so1 = (Button)findViewById(R.id.btnSo1);
    	so1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"1");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so2 = (Button)findViewById(R.id.btnSo2);
    	so2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"2");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
       
    	Button so3 = (Button)findViewById(R.id.btnSo3);
    	so3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"3");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so4 = (Button)findViewById(R.id.btnSo4);
    	so4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"4");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so5 = (Button)findViewById(R.id.btnSo5);
    	so5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"5");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so6 = (Button)findViewById(R.id.btnSo6);
    	so6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"6");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so7 = (Button)findViewById(R.id.btnSo7);
    	so7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"7");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so8 = (Button)findViewById(R.id.btnSo8);
    	so8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"8");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button so9 = (Button)findViewById(R.id.btnSo9);
    	so9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtkq.setText(txtkq.getText().toString()+"9");
				if(dau == null)
				{
					kq1 = Float.parseFloat(txtkq.getText().toString());
				}
				else
				{
					kq2 = Float.parseFloat(txtkq.getText().toString());
				}
			}
		});
    	
    	Button cong = (Button)findViewById(R.id.btncong);
    	cong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dau = '+';
				txtkq.setText("");
			}
		});
    	
    	Button nhan = (Button)findViewById(R.id.btnnhan);
    	nhan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dau = '*';
				txtkq.setText("");
			}
		});
    	
    	Button tru = (Button)findViewById(R.id.btntru);
    	tru.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dau = '-';
				txtkq.setText("");
			}
		});
    	
    	Button chia = (Button)findViewById(R.id.btnchia);
    	chia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dau = '/';
				txtkq.setText("");
			}
		});
    	
    	Button phantram = (Button)findViewById(R.id.btnphantram);
    	phantram.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				dau = '%';
				txtkq.setText("");
			}
		});
    	
    	Button bang = (Button)findViewById(R.id.btnbang);
    	bang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(dau != null)
				{
					Float ketqua = (float) 0;
					
					switch (dau) {
					case '+': ketqua = kq1 + kq2; break;
					case '-': ketqua = kq1 - kq2; break;
					case '*': ketqua = kq1 * kq2; break;
					case '/': ketqua = kq1 / kq2; break;
					case '%': ketqua = kq1 % kq2; break;
					}
					
					txtkq.setText(ketqua.toString());
					kq1 = ketqua;
					dau = null;
				}
			}
		});
    	
    	Button xoa = (Button)findViewById(R.id.btnclear);
    	xoa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				kq1 = null;
				kq2 = null;
				dau = null;
				txtkq.setText("");
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

