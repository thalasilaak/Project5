package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class OrderView extends AppCompatActivity {
    EditText total = findViewById(R.id.totalYourOrder);
    EditText salestax = findViewById(R.id.salestaxYourOrder);
    EditText subtotal = findViewById(R.id.subtotalYourOrder);
    ListView listOfItems = findViewById(R.id.listOfItems);
    Button placeOrder = findViewById(R.id.placeYourOrder);
    Button removeSelectedItem = findViewById(R.id.removeSelectedItem);

    protected final double sales = .06625;

    public void calcTotals(){
        double totals = 0;
        double subtotals = 0;
        double taxes = 0;
        for(int i = 0; i < MainActivity.currentOrder.size; i++){
            subtotals += MainActivity.currentOrder.menu[i].itemPrice();
        }
        subtotals = Math.round(subtotals*100.0)/100.0;
        taxes = subtotals * sales;
        taxes = Math.round(taxes*100.0)/100.0;
        totals = taxes + subtotals;
        totals = Math.round(totals*100.0)/100.0;
        salestax.setText(String.valueOf(taxes));
        subtotal.setText(String.valueOf(subtotals));
        total.setText(String.valueOf(totals));
        MainActivity.currentOrder.setPrice(totals);
    }

    // private TextView orderSubtotal, orderSalesTax, orderPayment;
    ArrayAdapter<MenuItem> adapter;
    ArrayList<MenuItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_view);

        Order currentOrder = MainActivity.getOrder();

        adapter = new ArrayAdapter<MenuItem>(OrderView.this, android.R.layout.simple_list_item_1, items);
        listOfItems.setAdapter(adapter);
        int size = currentOrder.getNumItemsInList();

        double totals = 0;
        double subtotals = 0;
        double taxes = 0;
        for(int i = 0; i < MainActivity.currentOrder.size; i++){
            subtotals += MainActivity.currentOrder.menu[i].itemPrice();
        }
        subtotals = Math.round(subtotals*100.0)/100.0;
        taxes = subtotals * sales;
        taxes = Math.round(taxes*100.0)/100.0;
        totals = taxes + subtotals;
        totals = Math.round(totals*100.0)/100.0;
        salestax.setText(String.valueOf(taxes));
        subtotal.setText(String.valueOf(subtotals));
        total.setText(String.valueOf(totals));
        MainActivity.currentOrder.setPrice(totals);


        placeOrder = findViewById(R.id.placeYourOrder);
        placeOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(adapter.isEmpty()) {
                    Toast.makeText(OrderView.this, "Error! There are no items in your order", Toast.LENGTH_SHORT).show();
                }
            }
        });

        listOfItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Order currOrder = MainActivity.getOrder();
                final int selectedItem = position;
                new AlertDialog.Builder(OrderView.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want to remove this item from your order?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                int pos = listOfItems.getSelectedItemPosition();
                                adapter.notifyDataSetChanged();

                                subtotal = findViewById(R.id.subtotalYourOrder);
                                salestax = findViewById(R.id.salestaxYourOrder);
                                total = findViewById(R.id.totalYourOrder);

                                double totals = 0;
                                double subtotals = 0;
                                double taxes = 0;
                                for(int i = 0; i < MainActivity.currentOrder.size; i++){
                                    subtotals += MainActivity.currentOrder.menu[i].itemPrice();
                                }
                                subtotals = Math.round(subtotals*100.0)/100.0;
                                taxes = subtotals * sales;
                                taxes = Math.round(taxes*100.0)/100.0;
                                totals = taxes + subtotals;
                                totals = Math.round(totals*100.0)/100.0;
                                salestax.setText(String.valueOf(taxes));
                                subtotal.setText(String.valueOf(subtotals));
                                total.setText(String.valueOf(totals));
                                MainActivity.currentOrder.setPrice(totals);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }
}