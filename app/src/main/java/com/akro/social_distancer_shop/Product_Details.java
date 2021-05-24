package com.akro.social_distancer_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.jar.Attributes;

public class Product_Details extends AppCompatActivity {
    EditText product1, product2,product3, product4,product5, product6,product7;
    EditText stock1,stock2,stock3,stock4,stock5,stock6,stock7;
    public Button add1;
    private DatabaseReference DatabaseShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        DatabaseShop = FirebaseDatabase.getInstance().getReference();
        product1 = (EditText) findViewById(R.id.product1);
        stock1 = (EditText) findViewById(R.id.stock1);
        product2 = (EditText) findViewById(R.id.product2);
        stock2 = (EditText) findViewById(R.id.stock2);
        product3 = (EditText) findViewById(R.id.Product3);
        stock3 = (EditText) findViewById(R.id.stock3);
        product4 = (EditText) findViewById(R.id.product4);
        stock4 = (EditText) findViewById(R.id.stock4);
        product5 = (EditText) findViewById(R.id.product5);
        stock5 = (EditText) findViewById(R.id.stock5);
        product6 = (EditText) findViewById(R.id.product6);
        stock6 = (EditText) findViewById(R.id.stock6);
        add1 = (Button) findViewById(R.id.add1);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference product_detail = database.getReference("Product Details");

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_detail.child("Product 1:").setValue(product1.getText().toString().trim());
                product_detail.child("Stock 1:").setValue(stock1.getText().toString().trim());
                product_detail.child("Product 2:").setValue(product2.getText().toString().trim());
                product_detail.child("Stock 2:").setValue(stock2.getText().toString().trim());
                product_detail.child("Product 3:").setValue(product3.getText().toString().trim());
                product_detail.child("Stock 3:").setValue(stock3.getText().toString().trim());
                product_detail.child("Product 4:").setValue(product4.getText().toString().trim());
                product_detail.child("Stock 4:").setValue(stock4.getText().toString().trim());
                product_detail.child("Product 5:").setValue(product5.getText().toString().trim());
                product_detail.child("Stock 5:").setValue(stock5.getText().toString().trim());
                product_detail.child("Product 6:").setValue(product6.getText().toString().trim());
                product_detail.child("Stock 6:").setValue(stock6.getText().toString().trim());
                Toast.makeText(Product_Details.this, "Updated Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}


