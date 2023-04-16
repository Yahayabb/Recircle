package com.ybasiron6.recircle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class recycle_paper : AppCompatActivity() {

    var ghgp: Double = 0.7;
    var fuelp: Double = 1.2;
    var powerp: Double = 4.5;

    var ghg: Double = 0.0;
    var fuel: Double = 0.0;
    var power: Double = 0.0;

    var weight: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_paper)

        supportActionBar?.hide()

        val weightt = findViewById<EditText>(R.id.amountEditText)
        val ghgt = findViewById<TextView>(R.id.GHGLabel)
        val fuelt = findViewById<TextView>(R.id.FuelLabel)
        val powert = findViewById<TextView>(R.id.PowerLabel)

        val back = findViewById<ImageButton>(R.id.backButton)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val myEdit = sharedPreferences.edit()



        val calculate = findViewById<Button>(R.id.calculateButton)
        calculate.setOnClickListener {
            weight = weightt.getText().toString().toDouble();
            ghg = ghgp*weight;
            fuel = fuelp*weight;
            power = powerp*weight;

            ghgt.setText("GHG: " + ghg + " kgCO2e");
            fuelt.setText("Fuel: " + fuel + " ℓ");
            powert.setText("Power: " + power + " kWh");
        }

        val save = findViewById<Button>(R.id.saveButton)
        save.setOnClickListener {
            weight = weightt.getText().toString().toDouble();
            ghg = ghgp*weight;
            fuel = fuelp*weight;
            power = powerp*weight;

            ghgt.setText("GHG: " + ghg + "kgCO2e");
            fuelt.setText("Fuel: " + fuel + "ℓ");
            powert.setText("Power: " + power + "kWh");

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("ghg", ghg.toString());
            intent.putExtra("fuel", fuel.toString());
            intent.putExtra("power", power.toString());
            startActivity(intent)
        }
    }
}