package io.github.svejnohatomas.courses.android.basics.kotlin.diceroller

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn_roll_onClick(view: View?) {
        rollDice()
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
    }

    fun rollDice() {
        val dice = Dice()
        val resultTextView = findViewById<TextView>(R.id.textView_result)

        resultTextView.text = dice.roll().toString()
    }
}

class Dice(private val numSides: Int = 6) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}