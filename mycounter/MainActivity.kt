package com.example.mycounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast message
        val t = Toast.makeText(this, "Button is not clicked yet!",
            Toast.LENGTH_LONG)
        t.show()
    }


    //function that increase the number of count by clicking the button
    fun increaseNumber(view: View) {
        handleCounter(1)
    }



    private fun handleCounter(sum: Int) {
        val myCount: TextView = findViewById(R.id.count);
        myCount.text = (sum + myCount.text.toString().toInt()).toString()
        Log.d("count:", (myCount.text as? String).toString())
    }


}
