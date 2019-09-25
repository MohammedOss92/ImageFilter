package com.example.myimageview

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorsArray = arrayOf(Color.BLACK,Color.CYAN,Color.BLUE,Color.DKGRAY,Color.LTGRAY,Color.MAGENTA)

        val mode = arrayOf(PorterDuff.Mode.ADD,PorterDuff.Mode.DARKEN,PorterDuff.Mode.DST,PorterDuff.Mode.DST_IN)


        Cat_Image.setOnClickListener {
            Cat_Image.setColorFilter(colorsArray[getRandom(colorsArray.size)],mode[getRandom(mode.size)])
        }

    }
    fun getRandom (arraysize:Int):Int{

        var randomNum = Random.nextInt(arraysize)
        return randomNum

    }

}
