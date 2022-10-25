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
    public static String sendname1,sendname2;
    public static float sendprice1,sendprice2;
    public static int pricedisplay1,pricedisplay2,cartitem=0;

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

    public void toHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }

    public void addtoCart(View v){

        if(wattod.equals("Itemcont1")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 48990;
                pricedisplay1=(R.string.price1);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 48990;
                pricedisplay2=(R.string.price1);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont2")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 46990;
                pricedisplay1=(R.string.price2);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 46990;
                pricedisplay2=(R.string.price2);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont3")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 74990;
                pricedisplay1=(R.string.price3);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 74990;
                pricedisplay2=(R.string.price3);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont4")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 62990;
                pricedisplay1=(R.string.price4);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 62990;
                pricedisplay2=(R.string.price4);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont5")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 86990;
                pricedisplay1=(R.string.price5);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 86990;
                pricedisplay2=(R.string.price5);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont6")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 89990;
                pricedisplay1=(R.string.price6);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 89990;
                pricedisplay2=(R.string.price6);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont7")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 49990;
                pricedisplay1=(R.string.price7);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 49990;
                pricedisplay2=(R.string.price7);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont8")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 38990;
                pricedisplay1=(R.string.price8);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 38990;
                pricedisplay2=(R.string.price8);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont9")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 37990;
                pricedisplay1=(R.string.price9);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 37990;
                pricedisplay2=(R.string.price9);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont10")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 44990;
                pricedisplay1=(R.string.price10);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 44990;
                pricedisplay2=(R.string.price10);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont11")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 50990;
                pricedisplay1=(R.string.price11);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 50990;
                pricedisplay2=(R.string.price11);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }else if(wattod.equals("Itemcont12")){
            if(cartitem==0){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname1 = (String) productName.getText();
                sendprice1 = 84990;
                pricedisplay1=(R.string.price12);
                cartitem++;
            }else if(cartitem==1){
                Toast.makeText(productview.this, productName.getText()+" Has Been Added to Cart", Toast.LENGTH_SHORT).show();
                sendname2 = (String) productName.getText();
                sendprice2 = 84990;
                pricedisplay2=(R.string.price12);
                cartitem++;
            }else{
                Toast.makeText(productview.this, "CART IS FULL! PLEASE CHECKOUT FIRST", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
