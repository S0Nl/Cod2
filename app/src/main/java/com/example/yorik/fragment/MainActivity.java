package com.example.yorik.fragment;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private TextView txtView;
    private Button f2button;
    private EditText f1EditText;
    
    @Override
    public void onStart() {
        super.onStart();
        
        txtView=(TextView)getActivity().findViewById(R.id.txtView);
        f1EditText=(EditText)getActivity().findViewById(R.id.f1EditText);
        f2button=(Button)getActivity().findViewById(R.id.f2button);
        f2button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int s=f1EditText.getText().toString().length();
        String.valueOf(s);
        txtView.setText("Кількість символів " +s);

    }

    public Activity getActivity() {
        return this;
    }
}
