package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.activity.ItemRegistrationActivity;

public class ItemsFragment extends Fragment {
    private Button btnItemRegister;
    private View myView;
    
    public ItemsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_items, container, false);
        
        btnItemRegister = myView.findViewById(R.id.btnItemRegister);
        btnItemRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ItemRegistrationActivity.class);
                startActivity(intent);
            }
        });
        
        return myView;
    }
}
