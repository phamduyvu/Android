package com.PhamDuyVu.listviewcustomadapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<SinhVien> {

    public ListAdapter(Context context, int resource, List<SinhVien> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.dong_sinh_vien, null);
        }
        
        SinhVien p = getItem(position);
        
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txthoten = (TextView) view.findViewById(R.id.textViewHoTen);
            txthoten.setText(p.HoTen);
            
            TextView txtnamsinh = (TextView) view.findViewById(R.id.textViewNamSinh);
            txtnamsinh.setText(String.valueOf(p.NamSinh));

        }
        return view;
    }

}
