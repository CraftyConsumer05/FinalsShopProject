package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DecimalFormat;
import java.util.HashMap;

public class cartForm extends Activity {

    TextView cartitem1, cartitem2, priceitem1,priceitem2, totalpricelabel;
    EditText itemquantity1, itemquantity2, nameinput, addressinput,contactinput, cashinput;
    float cash, totalprice, userchange;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);


        cartitem1 = findViewById(R.id.cartitem1);
        cartitem2 = findViewById(R.id.cartitem2);
        priceitem1 = findViewById(R.id.priceitem1);
        priceitem2 = findViewById(R.id.priceitem2);
        totalpricelabel = findViewById(R.id.totalprice);
        itemquantity1 = findViewById(R.id.itemquantity1);
        itemquantity2 = findViewById(R.id.itemquantity2);
        nameinput = findViewById(R.id.nameinput);
        addressinput = findViewById(R.id.adressinput);
        contactinput = findViewById(R.id.contactinput);
        cashinput = findViewById(R.id.cashinput);

        if(productview.cartitem!=0) {
            cartitem1.setText(productview.sendname1);
            priceitem1.setText(productview.pricedisplay1);
            if (productview.cartitem == 2) {
                priceitem2.setText(productview.pricedisplay2);
                cartitem2.setText(productview.sendname2);
            }
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

    public void gettingtotal(View v){
        DecimalFormat form = new DecimalFormat("0.00");
        if(productview.cartitem!=0){
            if(productview.cartitem==1){
                totalprice = ((Float.parseFloat((itemquantity1.getText().toString().trim())))*productview.sendprice1);
            }else if(productview.cartitem==2){
                totalprice = ((Float.parseFloat((itemquantity1.getText().toString().trim())))*productview.sendprice1)+((Float.parseFloat((itemquantity2.getText().toString().trim())))*productview.sendprice2);
            }
            totalpricelabel.setText("₱"+form.format(totalprice));
        }else{
            Toast.makeText(cartForm.this, "Please Pick an Item to Buy First", Toast.LENGTH_SHORT).show();
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

        if(!totalpricelabel.getText().toString().isEmpty()){
            if((Float.parseFloat((cashinput.getText().toString().trim())))>totalprice){
                if(!nameinput.getText().toString().isEmpty()&&!addressinput.getText().toString().isEmpty()&&!contactinput.getText().toString().isEmpty()){
                    userchange = (Float.parseFloat((cashinput.getText().toString().trim())))-totalprice;
                    MainActivity.transcode=MainActivity.transcode+1;
                    HashMap<String, Object>map = new HashMap<>();

                    map.put("purchasedItem1",cartitem1.getText().toString());
                    map.put("priceofItem1",priceitem1.getText().toString());
                    map.put("quantityofItem1",itemquantity1.getText().toString());
                    map.put("purchasedItem2",cartitem2.getText().toString());
                    map.put("priceofItem2",priceitem2.getText().toString());
                    map.put("quantityofItem2",itemquantity2.getText().toString());
                    map.put("TotalPrice",totalprice);

                    map.put("buyerName",nameinput.getText().toString());
                    map.put("buyerAddress",addressinput.getText().toString());
                    map.put("buyerContact",contactinput.getText().toString());
                    map.put("buyerCash",cashinput.getText().toString());
                    map.put("UserChange",userchange);
                    map.put("transcode",MainActivity.transcode);

                    FirebaseDatabase.getInstance().getReference("receipts").child("transaction"+MainActivity.transcode).updateChildren(map);

                    Toast.makeText(cartForm.this, "Thank you for your Purchase", Toast.LENGTH_SHORT).show();
                    productview.cartitem=0;
                    Intent intent = new Intent(this, purchaseReciepts.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(cartForm.this, "Please Enter Data First", Toast.LENGTH_SHORT).show();
                }

            }else {
                Toast.makeText(cartForm.this, "Please Enter Valid Amount of Cash", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(cartForm.this, "Please Get Total Price First", Toast.LENGTH_SHORT).show();
        }


    }
}
