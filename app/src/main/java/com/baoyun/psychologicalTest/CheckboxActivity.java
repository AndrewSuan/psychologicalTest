package com.baoyun.psychologicalTest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkbox_a:
                if (checked){
                    Toast.makeText(this,"选中了A",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkbox_b:
                if (checked){
                    Toast.makeText(this,"选中了B",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkbox_c:
                if (checked){
                    Toast.makeText(this,"选中了C",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkbox_d:
                if (checked){
                    Toast.makeText(this,"选中了D",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkbox_e:
                if (checked){
                    Toast.makeText(this,"选中了E",Toast.LENGTH_SHORT).show();
                }
                break;



        }

    }

    public void enterRadioImg(View view){
        Intent intent = new Intent(this,RadioImgActivity.class);
        startActivity(intent);
    }

}
