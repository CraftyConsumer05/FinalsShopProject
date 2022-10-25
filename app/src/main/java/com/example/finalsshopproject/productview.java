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
    String nameP;

    String wattod = productlistform.whichitemcontent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_checkout);

        productName =findViewById(R.id.productName);
        productPrice =findViewById(R.id.productPrice);
        productDescription =findViewById(R.id.productDescription);
        productImage =findViewById(R.id.productImage);


        if(wattod.equals("Itemcont1")){
            productImage.setImageResource(R.drawable.item1);
            productName.setText(R.string.ItemName1);
            productDescription.setText(R.string.item1specs);
            productPrice.setText(R.string.price1);
        }else if(wattod.equals("Itemcont2")){
            productImage.setImageResource(R.drawable.item2);
            productName.setText(R.string.ItemName2);
            productDescription.setText(R.string.item2specs);
            productPrice.setText(R.string.price2);
        }else if(wattod.equals("Itemcont3")){
            productImage.setImageResource(R.drawable.item3);
            productName.setText(R.string.ItemName3);
            productDescription.setText(R.string.item3specs);
            productPrice.setText(R.string.price3);
        }else if(wattod.equals("Itemcont4")){
            productImage.setImageResource(R.drawable.item4);
            productName.setText(R.string.ItemName4);
            productDescription.setText(R.string.item4specs);
            productPrice.setText(R.string.price4);
        }else if(wattod.equals("Itemcont5")){
            productImage.setImageResource(R.drawable.item5);
            productName.setText(R.string.ItemName5);
            productDescription.setText(R.string.item5specs);
            productPrice.setText(R.string.price5);
        }
        else if(wattod.equals("Itemcont6")){
            productImage.setImageResource(R.drawable.item6);
            productName.setText(R.string.ItemName6);
            productDescription.setText(R.string.item6specs);
            productPrice.setText(R.string.price6);
        }
        else if(wattod.equals("Itemcont7")){
            productImage.setImageResource(R.drawable.item7);
            productName.setText(R.string.ItemName7);
            productDescription.setText(R.string.item7specs);
            productPrice.setText(R.string.price7);
        }
        else if(wattod.equals("Itemcont8")){
            productImage.setImageResource(R.drawable.item8);
            productName.setText(R.string.ItemName8);
            productDescription.setText(R.string.item8specs);
            productPrice.setText(R.string.price8);
        }else if(wattod.equals("Itemcont9")){
            productImage.setImageResource(R.drawable.item9);
            productName.setText(R.string.ItemName9);
            productDescription.setText(R.string.item9specs);
            productPrice.setText(R.string.price9);
        }else if(wattod.equals("Itemcont10")){
            productImage.setImageResource(R.drawable.item10);
            productName.setText(R.string.ItemName10);
            productDescription.setText(R.string.item10specs);
            productPrice.setText(R.string.price10);
        }else if(wattod.equals("Itemcont11")){
            productImage.setImageResource(R.drawable.item11);
            productName.setText(R.string.ItemName11);
            productDescription.setText(R.string.item11specs);
            productPrice.setText(R.string.price11);
        }else if(wattod.equals("Itemcont12")){
            productImage.setImageResource(R.drawable.item12);
            productName.setText(R.string.ItemName12);
            productDescription.setText(R.string.item12specs);
            productPrice.setText(R.string.price12);
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
