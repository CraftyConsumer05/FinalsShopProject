package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.text.DecimalFormat;

public class cartForm extends Activity {

    TextView cartitem1, cartitem2, priceitem1,priceitem2, totalpricelabel;
    EditText itemquantity1, itemquantity2;
    float totalprice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
        DecimalFormat form = new DecimalFormat("0.00");

        cartitem1 = findViewById(R.id.cartitem1);
        cartitem2 = findViewById(R.id.cartitem2);
        priceitem1 = findViewById(R.id.priceitem1);
        priceitem2 = findViewById(R.id.priceitem2);
        totalpricelabel = findViewById(R.id.totalprice);
        itemquantity1 = findViewById(R.id.itemquantity1);
        itemquantity2 = findViewById(R.id.itemquantity2);

        if(productview.cartitem!=0){
            cartitem1.setText(productview.sendname1);
            priceitem1.setText(productview.pricedisplay1);
            if(productview.cartitem==2){
                priceitem2.setText(productview.pricedisplay2);
                cartitem2.setText(productview.sendname2);
            }

            final Handler handler = new Handler();
            final int delay = 1000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    if(productview.cartitem==1){
                        totalprice = ((Float.parseFloat((itemquantity1.getText().toString().trim())))*productview.sendprice1);
                    }else if(productview.cartitem==2){
                        totalprice = ((Float.parseFloat((itemquantity1.getText().toString().trim())))*productview.sendprice1)+((Float.parseFloat((itemquantity2.getText().toString().trim())))*productview.sendprice2);
                    }
                    totalpricelabel.setText(form.format(totalprice));
                    handler.postDelayed(this, delay);
                }
            }, delay);
        }




        if(cartitem1.getText().toString().isEmpty()){
            itemquantity1.setBackgroundResource(android.R.color.transparent);
        }else{
            itemquantity1.setText("1");
        }
        if(cartitem2.getText().toString().isEmpty()){
            itemquantity2.setBackgroundResource(android.R.color.transparent);
        }else{
            itemquantity2.setText("1");
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
