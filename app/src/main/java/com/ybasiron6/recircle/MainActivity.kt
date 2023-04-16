package com.ybasiron6.recircle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        val ghgl = findViewById<TextView>(R.id.monthValue)
        val powerl = findViewById<TextView>(R.id.monthValue1)
        val fuell = findViewById<TextView>(R.id.monthValue2)

        val intent = intent
        val ghg = intent.getStringExtra("ghg")
        val power = intent.getStringExtra("power")
        val fuel = intent.getStringExtra("fuel")

        if (ghg != null) {
            ghgl.setText(ghg + " kgCO₂e")
            powerl.setText(power + " kWh")
            fuell.setText(fuel + " ℓ")
        }

        val plastic = findViewById<Button>(R.id.plasticButton)
        plastic.setOnClickListener {
            val intent = Intent(this, recycle_plastic::class.java)
            startActivity(intent)
        }

        val paper = findViewById<Button>(R.id.paperButton)
        paper.setOnClickListener {
            val intent = Intent(this, recycle_paper::class.java)
            startActivity(intent)
        }


    val metal = findViewById<Button>(R.id.metalButton)
    metal.setOnClickListener {
        val intent = Intent(this, recycle_metal::class.java)
        startActivity(intent)
    }

    val elect = findViewById<Button>(R.id.electronicsButton)
    elect.setOnClickListener {
        val intent = Intent(this, recycle_electronic::class.java)
        startActivity(intent)
    }

    val catr = findViewById<Button>(R.id.catridgeButton)
    catr.setOnClickListener {
        val intent = Intent(this, recycle_catridges::class.java)
        startActivity(intent)
    }

    val oil = findViewById<Button>(R.id.oilButton)
    oil.setOnClickListener {
        val intent = Intent(this, recycle_oil::class.java)
        startActivity(intent)
    }

    val bag = findViewById<Button>(R.id.bagButton)
    bag.setOnClickListener {
        val intent = Intent(this, recycle_bag::class.java)
        startActivity(intent)
    }

    val cloth = findViewById<Button>(R.id.clothButton)
    cloth.setOnClickListener {
        val intent = Intent(this, recycle_clothes::class.java)
        startActivity(intent)
    }

    val tyre = findViewById<Button>(R.id.tyreButton)
    tyre.setOnClickListener {
        val intent = Intent(this, recycle_tyres::class.java)
        startActivity(intent)
    }
}


}