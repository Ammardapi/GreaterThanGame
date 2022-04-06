package com.dapi.gtg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity()  {

    lateinit var ImageView: ImageView
    lateinit var ImageView1: ImageView
    lateinit var button: Button

    val kartuImg = intArrayOf(
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

        ImageView = findViewById(R.id.ImageView);
        ImageView1 = findViewById(R.id.ImageView1);
        button = findViewById(R.id.button);

        button.setOnClickListener{
            val random = Random
            ImageView.setImageResource(kartuImg[random.nextInt(kartuImg.size)])
            ImageView1.setImageResource(kartuImg[random.nextInt(kartuImg.size)])
        }
        val ImageView=0;
        if (ImageView ==0){
            print("$ImageView+1")
        }else{
            print("$ImageView+1")
        }

    }
}