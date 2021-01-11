package com.example.medidorfortaleza;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.example.medidorfortaleza.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IPresentador {
private ActivityMainBinding mainBinding;
private Presentador mPresentador;
private IPresentador mIPresentador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        mPresentador = new Presentador(mIPresentador);
        setContentView(mainBinding.getRoot());

        mainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = mainBinding.editTextTextPassword.getText().toString();
                mPresentador.levelSecurity(password);

               // showPassword(password);
                mainBinding.textView.setText(showColor());
                mainBinding.textView.setBackgroundColor(Color.parseColor(showSecurity()));
            }
        });
    }

    @Override
    public void showPassword(String textocolor) {
      mPresentador.levelSecurity(textocolor);
    }

    @Override
    public String showColor() {
        return mPresentador.colorSecurity();
    }

    @Override
    public String showSecurity() {
        return mPresentador.colorValidation();
    }

}