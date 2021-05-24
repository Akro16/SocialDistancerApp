package com.akro.social_distancer_shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText customer,email_id;
    public Button get_in;
    EditText Name, Address;
    public Button Submit;
    private DatabaseReference DatabaseShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseShop = FirebaseDatabase.getInstance().getReference();
        customer =(EditText) findViewById(R.id.customer);
        email_id = (EditText) findViewById(R.id.email_id);
        get_in = (Button) findViewById(R.id.get_in);
        Name = (EditText) findViewById(R.id.Name);
        Address = (EditText) findViewById(R.id.Address);
        Submit = (Button) findViewById(R.id.Submit);
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        get_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Customer_Shop.class);
                startActivity(intent1);
                Toast.makeText(MainActivity.this,"Got in successfully",Toast.LENGTH_LONG).show();
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Product_Details.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Get in Successfully",Toast.LENGTH_LONG).show();
                DatabaseReference Social_Distance = database.getReference("Shop Details :");
                Social_Distance.child("Name:").setValue(Name.getText().toString().trim());
                Social_Distance.child("Address:").setValue(Address.getText().toString().trim());
                Toast.makeText(MainActivity.this,"Submitted Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}