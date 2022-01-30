package io.github.svejnohatomas.courses.android.basics.kotlin.diceroller

import android.os.Bundle
import android.view.View
import android.widget.ImageView
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
        val resultImageView = findViewById<ImageView>(R.id.imageView_dice)

        when (dice.roll()) {
            1 -> resultImageView.setImageResource(R.drawable.dice_1)
            2 -> resultImageView.setImageResource(R.drawable.dice_2)
            3 -> resultImageView.setImageResource(R.drawable.dice_3)
            4 -> resultImageView.setImageResource(R.drawable.dice_4)
            5 -> resultImageView.setImageResource(R.drawable.dice_5)
            6 -> resultImageView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val numSides: Int = 6) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}