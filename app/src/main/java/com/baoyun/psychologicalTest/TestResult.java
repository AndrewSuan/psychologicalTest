package com.baoyun.psychologicalTest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class TestResult extends AppCompatActivity {

    private Context mcontext=this;
    private List<Test> mlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        adddataTolist();
        RecyclerView recyclerView = findViewById(R.id.home_othertests);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TestAdapter adapter =new TestAdapter(mlist,mcontext);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        ImageView button =findViewById(R.id.home_sharebt);
    }





    private void adddataTolist(){
        Test test1 =new Test(R.drawable.otherimg1,R.string.test_title1,R.string.test_introduction1);
        Test test2 =new Test(R.drawable.otherimg2,R.string.test_title2,R.string.test_introduction2);
        mlist.add(test1);
        mlist.add(test2);
        mlist.add(test1);
        mlist.add(test2);
    }

    public void onsharebuttonClicked(View view){
        Intent intent = new Intent(this,ShareActivity.class);
        startActivity(intent);
    }
}
