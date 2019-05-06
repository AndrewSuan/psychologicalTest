package com.baoyun.psychologicalTest;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Test> mlist = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adddataTolist();
        RecyclerView recyclerView = findViewById(R.id.home_othertests);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TestAdapter adapter =new TestAdapter(mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
    private void adddataTolist(){
        Test test1 =new Test(R.drawable.otherimg1,R.string.test_title1,R.string.test_introduction1);
        Test test2 =new Test(R.drawable.otherimg2,R.string.test_title2,R.string.test_introduction2);
        mlist.add(test1);
        mlist.add(test2);
        mlist.add(test1);
        mlist.add(test2);
    }
}
