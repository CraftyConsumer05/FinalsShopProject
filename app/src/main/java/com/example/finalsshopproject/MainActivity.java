package com.example.finalsshopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toProduct(View v){
        Intent intent = new Intent(this, productlistform.class);
        startActivity(intent);
    }
    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }
    public void toReceipt(View v){
        Intent intent = new Intent(this, purchaseReciepts.class);
        startActivity(intent);
    }
}