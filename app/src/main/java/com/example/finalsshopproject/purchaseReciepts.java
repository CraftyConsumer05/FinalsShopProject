package com.example.finalsshopproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class purchaseReciepts extends Activity {

    TextView buyername, buyeradress, buyerContact, buyerCash, Productname1,Productname2,prodprice1,prodprice2,prodquan1,prodquan2,prodtotal, recChange;
    int transcode= MainActivity.transcode;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_history);


        buyername = findViewById(R.id.buyername);
        buyeradress = findViewById(R.id.buyeradress);
        buyerContact = findViewById(R.id.buyerContact);
        buyerCash = findViewById(R.id.buyerCash);
        Productname1= findViewById(R.id.recprodname1);
        Productname2 = findViewById(R.id.recprodname2);
        prodprice1 = findViewById(R.id.prodprice1);
        prodprice2 = findViewById(R.id.prodprice2);
        prodquan1 = findViewById(R.id.prodquan1);
        prodquan2 = findViewById(R.id.prodquan2);
        prodtotal = findViewById(R.id.prodtotal);
        recChange = findViewById(R.id.recChange);

        DatabaseReference ref= FirebaseDatabase.getInstance().getReference("receipts");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(transcode==1000){
                    transcode++;
                }
                buyername.setText(dataSnapshot.child("transaction"+transcode).child("buyerName").getValue(String.class));
                buyeradress.setText(dataSnapshot.child("transaction"+transcode).child("buyerAddress").getValue(String.class));
                buyerContact.setText(dataSnapshot.child("transaction"+transcode).child("buyerContact").getValue(String.class));
                buyerCash.setText("₱"+dataSnapshot.child("transaction"+transcode).child("buyerCash").getValue(String.class));
                Productname1.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem1").getValue(String.class));
                Productname2.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem2").getValue(String.class));
                prodprice1.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem1").getValue(String.class));
                prodprice2.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem2").getValue(String.class));
                prodquan1.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem1").getValue(String.class));
                prodquan2.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem2").getValue(String.class));
                prodtotal.setText("₱"+dataSnapshot.child("transaction"+transcode).child("TotalPrice").getValue(Integer.class));
                recChange.setText("₱"+dataSnapshot.child("transaction"+transcode).child("UserChange").getValue(Integer.class));


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





    }
    public void toHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }

    public void previousreceipt(View v){

        if(transcode>=1002){
            transcode--;

            DatabaseReference ref= FirebaseDatabase.getInstance().getReference("receipts");
            ref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                    buyername.setText(dataSnapshot.child("transaction"+transcode).child("buyerName").getValue(String.class));
                    buyeradress.setText(dataSnapshot.child("transaction"+transcode).child("buyerAddress").getValue(String.class));
                    buyerContact.setText(dataSnapshot.child("transaction"+transcode).child("buyerContact").getValue(String.class));
                    buyerCash.setText("₱"+dataSnapshot.child("transaction"+transcode).child("buyerCash").getValue(String.class));
                    Productname1.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem1").getValue(String.class));
                    Productname2.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem2").getValue(String.class));
                    prodprice1.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem1").getValue(String.class));
                    prodprice2.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem2").getValue(String.class));
                    prodquan1.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem1").getValue(String.class));
                    prodquan2.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem2").getValue(String.class));
                    prodtotal.setText("₱"+dataSnapshot.child("transaction"+transcode).child("TotalPrice").getValue(Integer.class));
                    recChange.setText("₱"+dataSnapshot.child("transaction"+transcode).child("UserChange").getValue(Integer.class));


                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


        }else{
            Toast.makeText(purchaseReciepts.this, "This is the Last Recorded Receipt", Toast.LENGTH_SHORT).show();
        }

    }

    public void nextreceipt(View v){
        transcode++;

        DatabaseReference ref= FirebaseDatabase.getInstance().getReference("receipts");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.child("transaction"+transcode).child("TotalPrice").getValue(Integer.class)!=null){

                    buyername.setText(dataSnapshot.child("transaction"+transcode).child("buyerName").getValue(String.class));
                    buyeradress.setText(dataSnapshot.child("transaction"+transcode).child("buyerAddress").getValue(String.class));
                    buyerContact.setText(dataSnapshot.child("transaction"+transcode).child("buyerContact").getValue(String.class));
                    buyerCash.setText("₱"+dataSnapshot.child("transaction"+transcode).child("buyerCash").getValue(String.class));
                    Productname1.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem1").getValue(String.class));
                    Productname2.setText(dataSnapshot.child("transaction"+transcode).child("purchasedItem2").getValue(String.class));
                    prodprice1.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem1").getValue(String.class));
                    prodprice2.setText(dataSnapshot.child("transaction"+transcode).child("priceofItem2").getValue(String.class));
                    prodquan1.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem1").getValue(String.class));
                    prodquan2.setText(dataSnapshot.child("transaction"+transcode).child("quantityofItem2").getValue(String.class));
                    prodtotal.setText("₱"+dataSnapshot.child("transaction"+transcode).child("TotalPrice").getValue(Integer.class));
                    recChange.setText("₱"+dataSnapshot.child("transaction"+transcode).child("UserChange").getValue(Integer.class));
                }else{
                    transcode--;
                    Toast.makeText(purchaseReciepts.this, "This is the Latest Recorded Receipt", Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(purchaseReciepts.this, "This is the Latest Recorded Receipt", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
