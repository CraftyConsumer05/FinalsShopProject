package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class productview extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_checkout);
    }
    public void toback(View v){
        Intent intent = new Intent(this, productlistform.class);
        startActivity(intent);
    }
    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }
}
