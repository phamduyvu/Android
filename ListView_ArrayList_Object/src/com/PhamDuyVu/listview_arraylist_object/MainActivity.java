package com.PhamDuyVu.listview_arraylist_object;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	EditText editId, editName;
	Button btnNhap;
	RadioGroup radgroup;
	ListView lvNhanvien;
	ArrayList<Employee>arrEmployee = new ArrayList<Employee>();
	ArrayAdapter<Employee>adapter = null;
	 
	Employee employee=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editId = (EditText)findViewById(R.id.editMa);
        editName = (EditText)findViewById(R.id.editTen);
        btnNhap = (Button)findViewById(R.id.btnnhap);
        radgroup = (RadioGroup)findViewById(R.id.radiogroud1);
        lvNhanvien = (ListView)findViewById(R.id.lvnhanvien);
        
        //��a Data Source l� c�c employee v�o Adapter
        adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1,arrEmployee);
        //��a adapter v�o ListView
        lvNhanvien.setAdapter(adapter);
        
        btnNhap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				processNhap();
			}
		});
    }

    public void processNhap()
    {
    	int radId = radgroup.getCheckedRadioButtonId();
    	String id = editId.getText()+"";
    	String name = editName.getText()+"";
    	if(radId == R.id.radChinhthuc)
    	{
    		employee = new EmployeeFullTime();
    	}
    	else
    	{
    		employee = new EmployeePartTime();
    	}
    	employee.setId(id);
    	employee.setName(name);
    	
    	//add employee vao ArrayList
    	arrEmployee.add(employee);
    	
    	//cap nhat giao dien
    	adapter.notifyDataSetChanged();
    }
    

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
