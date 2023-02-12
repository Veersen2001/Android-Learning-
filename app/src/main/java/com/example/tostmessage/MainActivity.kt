package com.example.tostmessage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload=findViewById<Button>(R.id.BtnUpload)

        val buttonDownload=findViewById<Button>(R.id.BtnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }

        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
        }




    }
}