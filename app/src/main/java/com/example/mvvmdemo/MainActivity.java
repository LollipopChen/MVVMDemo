package com.example.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmdemo.databinding.ActivityMainBinding;

import viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        MainViewModel viewModel = new MainViewModel();
//        viewModel.setAge(20);
//        viewModel.setNickname("张三");
//        viewModel.setUserName("zhangsan");
        MainViewModel viewModel = new MainViewModel("zhangsan", "张三", 30);
        viewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked BUTTON ", Toast.LENGTH_SHORT).show();
            }
        });

        activityMainBinding.setViewmain(viewModel);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(MainActivity.this,"增",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove:
                Toast.makeText(MainActivity.this,"删",Toast.LENGTH_SHORT).show();
                break;
            case R.id.changed:
                Toast.makeText(MainActivity.this,"改",Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(MainActivity.this,"查",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
