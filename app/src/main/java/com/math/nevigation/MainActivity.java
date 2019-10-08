package com.math.nevigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replace(new HomeFragment());

        BottomNavigationView bottomNavigationView=findViewById(R.id.nev);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.homeIc:
                        replace(new HomeFragment());
                        return true;

                    case R.id.cartIc:
                        replace(new CartFragment());
                        return true;
                    case R.id.moreIc:
                        replace(new MoreFragment());
                        return true;



                }

                return false;
            }
        });
    }

    public void replace(Fragment fragment){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.load,fragment);
        ft.commit();




    }
}
