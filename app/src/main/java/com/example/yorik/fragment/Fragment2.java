package com.example.yorik.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment implements View.OnClickListener {
    private TextView txtView;
    private Button f2button;
    private EditText f1EditText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment2,null);
        return v;
    }

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
        txtView.setText("Довжина стрічки "+s);
    }
}
