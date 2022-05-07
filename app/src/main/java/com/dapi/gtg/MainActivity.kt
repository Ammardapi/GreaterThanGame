package com.dapi.gtg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity()  {

    lateinit var ImageView: ImageView
    lateinit var ImageView1: ImageView
    lateinit var textView3 : TextView
    lateinit var textView4 : TextView

    lateinit var random: Random
    lateinit var button: Button

    var skorkiri = 0
    var skorkanan = 0

    var kartuImg = intArrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random

        ImageView = findViewById(R.id.ImageView);
        ImageView1 = findViewById(R.id.ImageView1);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);

        button.setOnClickListener{
            val kartukiri = random.nextInt(kartuImg.size)
            val kartukanan = random.nextInt(kartuImg.size)

            setCardImage(kartukiri, ImageView)
            setCardImage(kartukanan, ImageView1)

            if (kartukiri > kartukanan) {
                skorkiri++
                textView3.text = "$skorkiri"
            } else if (kartukanan > kartukiri)
                skorkanan++
            textView4.text = "$skorkanan"
        }
    }
    private fun setCardImage(number: Int, image: ImageView) {
        image.setImageResource(kartuImg[number])
    }

}
