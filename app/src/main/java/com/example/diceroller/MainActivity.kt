package com.example.diceroller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random


class MainActivity : AppCompatActivity() {
    private lateinit var  img: ImageView
    private lateinit var resultText :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener {
            rollDice()
        }
        img = findViewById(R.id.diceImg)
        resultText=findViewById(R.id.result_text)
    }

    private fun rollDice() {

        val num= (Random().nextInt(6)+1)
        val numberStr=num.toString()
        resultText.text="You have drawn the number $numberStr on the dice."
   val drawableResource = when(num)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        img.setImageResource(drawableResource)
    }
}