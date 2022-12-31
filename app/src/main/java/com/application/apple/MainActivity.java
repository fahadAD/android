package com.application.apple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

ListView list;
ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
HashMap<String,String>hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
list=findViewById(R.id.list);

//.................................
        hashMap=new HashMap<>();
        hashMap.put("name","mr fahad");
        hashMap.put("mobile_number","1111111111111111111");
        arrayList.add(hashMap);
//.................................

//.................................
        hashMap=new HashMap<>();
        hashMap.put("name","mr sad");
        hashMap.put("mobile_number","22222222222222222");
        arrayList.add(hashMap);
//.................................

//.................................
        hashMap=new HashMap<>();
        hashMap.put("name","mr fahim");
        hashMap.put("mobile_number","3333333333333333");
        arrayList.add(hashMap);
//.................................






        My_adapter adapter=new My_adapter();

   list.setAdapter(adapter);


        }

       public class My_adapter extends BaseAdapter{

           @Override
           public int getCount() {
               return arrayList.size();
           }

           @Override
           public Object getItem(int position) {
               return null;
           }

           @Override
           public long getItemId(int position) {
               return 0;
           }

           @Override
           public View getView(int position, View convertView, ViewGroup parent) {



               LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
              View my_view=layoutInflater.inflate(R.layout.first_layout,parent,false);

               ImageView imageView=my_view.findViewById(R.id.imageView);
               TextView textView=my_view.findViewById(R.id.textView);
               TextView textView1=my_view.findViewById(R.id.textView1);

               HashMap<String,String>hashMap=arrayList.get(position);
               String my_name=hashMap.get("name");
               String ny_num=hashMap.get("mobile_number");
               textView.setText(my_name);
               textView1.setText(ny_num);



               imageView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(), "image fahad\nsi no:"+position, Toast.LENGTH_SHORT).show();
                   }
               });


               textView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(), "\nmy name is: "+my_name, Toast.LENGTH_SHORT).show();
                   }
               });

               textView1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(), "\nmy mobile no is: "+ny_num, Toast.LENGTH_SHORT).show();
                   }
               });
               return my_view;
           }
       }




    }





