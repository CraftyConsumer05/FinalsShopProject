package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Objects;

public class productview extends Activity {

    TextView productName, productPrice, productDescription;
    ImageView productImage;

    String wattod = productlistform.whichitemcontent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_checkout);

        productName =findViewById(R.id.productName);
        productPrice =findViewById(R.id.productPrice);
        productDescription =findViewById(R.id.productDescription);
        productImage =findViewById(R.id.productImage);

        if(wattod.equals("itemcont1")){
            productName.setText(R.string.ItemName1);
            Toast.makeText(productview.this, "wattod is "+wattod, Toast.LENGTH_SHORT).show();
        }else if(wattod.equals("itemcont2")){
            productName.setText(R.string.ItemName2);
        }

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
