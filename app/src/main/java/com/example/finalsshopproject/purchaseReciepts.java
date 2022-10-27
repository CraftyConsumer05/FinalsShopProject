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

    TextView buyername, buyeradress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_history);

        buyername = findViewById(R.id.buyername);
        buyeradress = findViewById(R.id.buyeradress);







    }
    public void toHome(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void toCart(View v){
        Intent intent = new Intent(this, cartForm.class);
        startActivity(intent);
    }

    public void nextreceipt(View v){

    }
}
