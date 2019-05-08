package com.baoyun.psychologicalTest;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<Test> mlist;
    private Context maincontext;

    public TestAdapter(List<Test> testList, Context mcontext) {
        mlist = testList;
        maincontext=mcontext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View testView;
        ImageView item_miniphotoview;
//        ImageView item_goview;
        TextView item_titleview;
        TextView item_introductionview;
        public ViewHolder( View itemView) {
            super(itemView);
            testView = itemView;
            item_miniphotoview=testView.findViewById(R.id.test_img);
//            item_goview=testView.findViewById(R.id.test_gobt);
            item_titleview=testView.findViewById(R.id.test_title);
            item_introductionview=testView.findViewById(R.id.test_introduction);
        }
    }




    @Override
    public TestAdapter.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.test_item,viewGroup,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.testView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(maincontext, TestDetailsActivity.class);
                maincontext.startActivity(intent);
//                int position =holder.getAdapterPosition();
//                Test test =mlist.get(position);//待写
//
//                Toast.makeText(v.getContext(),"click"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapter.ViewHolder viewHolder, int position) {
        Test test = mlist.get(position);
        viewHolder.item_miniphotoview.setImageResource(test.getTest_minphoto());
        viewHolder.item_titleview.setText(test.getTest_title());
        viewHolder.item_introductionview.setText(test.getTest_indroduction());
    }

    @Override
    public int getItemCount() {
        return  mlist.size();
    }


}
