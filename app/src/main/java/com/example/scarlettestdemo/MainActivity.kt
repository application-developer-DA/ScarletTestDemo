package com.example.scarlettestdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testMessage = "My Test Message"
        val toast = Toast.makeText(this, testMessage, Toast.LENGTH_SHORT)
        toast.show()
    }
}
