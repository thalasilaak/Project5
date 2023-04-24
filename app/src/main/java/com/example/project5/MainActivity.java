package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**String welcomeText = "Rutgers Cafe";
     ImageButton CoffeeButton;
     */
    public static Order currentOrder = new Order();
    private static StoreOrder storeOrder = new StoreOrder();

    public static Order getOrder() {
        return currentOrder;
    }

    public static void setOrder(Order order) {
        currentOrder = order;
    }

    public static StoreOrder getStoreOrder() {
        return storeOrder;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         *
         CoffeeButton = (ImageButton) findViewById(R.id.CoffeeButton);
         CoffeeButton.setOnClickListener(new View.OnClickListener(){
         public void onClick(View v){
         System.out.println("wowzers in my trowzers");
         }
         });

         */
    }

    public void clickDonut(View view) {
        Intent intent = new Intent(MainActivity.this, DonutView.class);
        Toast.makeText(MainActivity.this, "Select Donut Flavor", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void clickCoffee(View view) {
        Intent intent = new Intent(MainActivity.this, CoffeeView.class);
        Toast.makeText(MainActivity.this, "Order Coffee", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void clickOrder(View view) {
        Intent intent = new Intent(MainActivity.this, Order.class);
        Toast.makeText(MainActivity.this, "View Your Order", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void clickStoreOrder(View view) {
        Intent intent = new Intent(MainActivity.this, StoreOrder.class);
        Toast.makeText(MainActivity.this, "View Store Orders", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

}