package com.akro.social_distancer_shop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Tag;

import java.util.ArrayList;

public class Customer_Shop extends AppCompatActivity {
    public TextView SHOPNAME,SHOPADDRESS,PRODUCT1,PRODUCT2,PRODUCT3,PRODUCT4,PRODUCT5,PRODUCT6;
    public  TextView STOCK1,STOCK2,STOCK3,STOCK4,STOCK5,STOCK6;

    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_shop_interface);
        reff = FirebaseDatabase.getInstance().getReference();
        SHOPNAME = (TextView) findViewById(R.id.SHOPNAME);
        SHOPADDRESS = (TextView) findViewById(R.id.SHOPADDRESS);
        PRODUCT1 = (TextView) findViewById(R.id.PRODUCT1);
        STOCK1 = (TextView) findViewById(R.id.STOCK1);
        PRODUCT2 = (TextView) findViewById(R.id.PRODUCT2);
        STOCK2 = (TextView) findViewById(R.id.STOCK2);
        PRODUCT3 = (TextView) findViewById(R.id.PRODUCT3);
        STOCK3 = (TextView) findViewById(R.id.STOCK3);
        PRODUCT4 = (TextView) findViewById(R.id.PRODUCT4);
        STOCK4 = (TextView) findViewById(R.id.STOCK4);
        PRODUCT5 = (TextView) findViewById(R.id.PRODUCT5);
        STOCK5 = (TextView) findViewById(R.id.STOCK5);
        PRODUCT6 = (TextView) findViewById(R.id.PRODUCT6);
        STOCK6 = (TextView) findViewById(R.id.STOCK6);

        reff = FirebaseDatabase.getInstance().getReference().child("Product Details");
        reff = FirebaseDatabase.getInstance().getReference().child("Shop Details");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String sname = dataSnapshot.getValue(String.class);
                String saddress = dataSnapshot.getValue(String.class);
                String p1 = dataSnapshot.getValue(String.class);
                String p2 = dataSnapshot.getValue(String.class);
                String p3 = dataSnapshot.getValue(String.class);
                String p4 = dataSnapshot.getValue(String.class);
                String p5 = dataSnapshot.getValue(String.class);
                String p6 = dataSnapshot.getValue(String.class);
                String s1 = dataSnapshot.getValue(String.class);
                String s2 = dataSnapshot.getValue(String.class);
                String s3 = dataSnapshot.getValue(String.class);
                String s4 = dataSnapshot.getValue(String.class);
                String s5 = dataSnapshot.getValue(String.class);
                String s6 = dataSnapshot.getValue(String.class);
                SHOPNAME.setText(sname);
                SHOPADDRESS.setText(saddress);
                PRODUCT1.setText(p1);
                PRODUCT2.setText(p2);
                PRODUCT3.setText(p3);
                PRODUCT4.setText(p4);
                PRODUCT5.setText(p5);
                PRODUCT6.setText(p6);
                STOCK1.setText(s1);
                STOCK2.setText(s2);
                STOCK3.setText(s3);
                STOCK4.setText(s4);
                STOCK5.setText(s5);
                STOCK6.setText(s6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
