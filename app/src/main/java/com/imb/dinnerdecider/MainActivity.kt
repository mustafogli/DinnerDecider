package com.imb.dinnerdecider

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val foods = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decideBtn.setOnClickListener {
            val index = Math.random().times(foods.size).toInt()
            foodTV.text = foods[index]
        }

        addBtn.setOnClickListener {
            val newFood = newFoodET.text.toString()
            if (newFood.isNotBlank()) {
                foods.add(newFood)
                foodTV.text = newFood
                newFoodET.setText("")
                Toast.makeText(this, "New Food is added", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Please type new food", Toast.LENGTH_SHORT).show()
        }

    }
}