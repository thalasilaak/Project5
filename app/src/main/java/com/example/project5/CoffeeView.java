package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CoffeeView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final double SET_TO_ZERO = 0;

    private CheckBox sweetCream, caramel, frenchVanilla, mocha, irishCream;
    private Spinner numCups;
    private TextView subtotalCoffee;
    private Spinner cupSize;
    private Button addCoffee;

    private Coffee newCof;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_view);

        sweetCream = findViewById(R.id.sweetCream);
        caramel = findViewById(R.id.caramel);
        frenchVanilla = findViewById(R.id.vanilla);
        mocha = findViewById(R.id.mocha);
        irishCream = findViewById(R.id.irishCream);

        addCoffee = (Button) findViewById(R.id.addCoffee);
        subtotalCoffee = findViewById(R.id.coffeeSubtotal);
        numCups = findViewById(R.id.numCups);
        cupSize = findViewById(R.id.cupSize);

        int[] adds = new int[]{0, 0, 0, 0, 0};
        newCof = new Coffee(0, adds);

        sweetCream.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(sweetCream.isChecked()) {
                    adds[0] = 1;
                }
                else {
                    adds[0] = 0;
                }
            }
        });

        caramel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(caramel.isChecked()) {
                    adds[1] = 1;
                }
                else {
                    adds[1] = 0;
                }
            }
        });

        frenchVanilla.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(frenchVanilla.isChecked()) {
                    adds[2] = 1;
                }
                else {
                    adds[2] = 0;
                }
            }
        });

        mocha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(mocha.isChecked()) {
                    adds[3] = 1;
                }
                else {
                    adds[3] = 0;
                }
            }
        });

        irishCream.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(irishCream.isChecked()) {
                    adds[4] = 1;
                }
                else {
                    adds[4] = 0;
                }
            }
        });
        newCof.setAddIns(adds);




        addCoffee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Order currOrder = MainActivity.getOrder();
                currOrder.add(newCof);

                Intent intent = new Intent(CoffeeView.this, CoffeeView.class);
                startActivity(intent);
                Toast.makeText(CoffeeView.this, "Coffee added to order", Toast.LENGTH_SHORT).show();
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.coffee_quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numCups.setAdapter(adapter);
        numCups.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String quantity = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "Quantity: " + quantity, Toast.LENGTH_SHORT).show();

        num = Integer.parseInt(parent.getItemAtPosition(position).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}