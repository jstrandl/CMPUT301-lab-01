package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat1 = new Cat("Inter-Continental Ballistic Missile");
        Dog dog1 = new Dog("spot");
        Scorpion scorpion1 = new Scorpion("annihilator");

        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(cat1);
        petList.add(dog1);
        petList.add(scorpion1);

        ArrayList<Pettable> pettablePetList = new ArrayList<Pettable>();
        pettablePetList.add(cat1);
        pettablePetList.add(dog1);
        pettablePetList.add(scorpion1);
    }
}