package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class OrderView extends AppCompatActivity {
    EditText total = (EditText)findViewById(R.id.total);
    EditText salextax = (EditText)findViewById(R.id.salextax);
    EditText subtotal = (EditText)findViewById(R.id.subtotal);
    ListView listOfItems = (ListView)findViewById(R.id.listOfItems);
    Button placeOrder = (Button)findViewById(R.id.placeOrder);
    Button removeSelectedItem = (Button)findViewById(R.id.removeSelectedItem);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_view);
    }
}