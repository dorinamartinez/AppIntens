package com.example.appintens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EnviarMensaje (View view){

    }
    public void Llamar (View view){
        Intent llamar = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2311002011"));
        startActivity(llamar);
    }

    public void IniciarWhatsApp(View view){
        Intent iniciarWhatsApp = new Intent();
        startActivity(iniciarWhatsApp);
    }
}