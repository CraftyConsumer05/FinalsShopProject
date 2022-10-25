package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class productlistform extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productlist);
    }

    public void toHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }

    public void toProductView(View v){
            String text = (String) v.getContentDescription();
            Toast.makeText(productlistform.this, "Value is "+text, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, productview.class);
        startActivity(intent);
    }
}
