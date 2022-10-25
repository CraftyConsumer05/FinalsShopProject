package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class cartForm extends Activity {

    TextView cartitem1, cartitem2, priceitem1,priceitem2, totalprice;
    EditText itemquantity1, itemquantity2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        cartitem1 = findViewById(R.id.cartitem1);
        cartitem2 = findViewById(R.id.cartitem2);
        priceitem1 = findViewById(R.id.priceitem1);
        priceitem2 = findViewById(R.id.priceitem2);
        totalprice = findViewById(R.id.totalprice);
        itemquantity1 = findViewById(R.id.itemquantity1);
        itemquantity2 = findViewById(R.id.itemquantity2);

        cartitem1.setText(productview.sendname1);
        cartitem2.setText(productview.sendname2);
        priceitem1.setText(productview.pricedisplay1);
        priceitem2.setText(productview.pricedisplay2);



        if(cartitem1.getText().toString().isEmpty()){
            itemquantity1.setBackgroundResource(android.R.color.transparent);
        }
        if(cartitem2.getText().toString().isEmpty()){
            itemquantity2.setBackgroundResource(android.R.color.transparent);
        }

    }
    public void toHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }

    public void checkOut(View v){
        Intent intent = new Intent(this, purchaseReciepts.class);
        startActivity(intent);
    }
}
