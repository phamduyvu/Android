package com.example.vidu_chuyendoifc_listenerinvariable;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private Button btnfar, btncel, btnclear;
	private EditText txtfar, txtcel;

	private OnClickListener myVarListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			EditText editf = (EditText)findViewById(R.id.txtFar);
			Double f = Double.parseDouble(editf.getText()+"");
			
			EditText editc = (EditText)findViewById(R.id.txtCel);
			Double c = Double.parseDouble(editc.getText()+"");
			
			if(arg0 == btnfar)
			{
				//c = (f - 32) * 5/9;
				DecimalFormat dcf = new DecimalFormat("#.0");
				txtcel.setText((dcf.format((f - 32) * 5/9)) + "");
			}
			else if(arg0 == btncel)
			{
				//f = c * 9/5 + 32;
				DecimalFormat dcf = new DecimalFormat("#.0");
				txtfar.setText(dcf.format((c * 9/5 + 32)) + "");
			}
			else if(arg0 == btnclear)
			{
				txtfar.setText("");
				txtcel.setText("");
				txtfar.requestFocus();
			}
			
		}
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfar = (Button)findViewById(R.id.btnFar);
        btncel = (Button)findViewById(R.id.btnCel);
        btnclear = (Button)findViewById(R.id.btnClear);
        txtfar = (EditText)findViewById(R.id.txtFar);
        txtcel = (EditText)findViewById(R.id.txtCel);
        btnfar.setOnClickListener(myVarListener);
        btncel.setOnClickListener(myVarListener);
        btnclear.setOnClickListener(myVarListener);
        	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
