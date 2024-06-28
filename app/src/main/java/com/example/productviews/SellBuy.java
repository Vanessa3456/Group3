package com.example.productviews;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

//import com.example.productviews.databinding.ActivitySellBuyBinding;

public class SellBuy extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
   // private ActivitySellBuyBinding binding;
    TextView addProduct;
    TextView editProduct;
    TextView viewProduct;
    TextView deleteProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_buy);
        addProduct=findViewById(R.id.addProduct);
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_SHORT).show();

            }
        });//targeting the view class
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AddProduct.class));//opens the addview window
            }
        });
        editProduct=findViewById(R.id.editProduct);
        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();

            }
        });//targeting the view class
        editProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EditProduct.class));//opens the addview window
            }
        });

        viewProduct=findViewById(R.id.viewProduct);
        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();

            }
        });//targeting the view class
        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ViewProduct.class));//opens the addview window
            }
        });
        deleteProduct=findViewById(R.id.deleteProduct);
        deleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I have been clicked",Toast.LENGTH_LONG).show();

            }
        });//targeting the view class
        deleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),DeleteProduct.class));//opens the deleteview window
            }
        });




    }
}