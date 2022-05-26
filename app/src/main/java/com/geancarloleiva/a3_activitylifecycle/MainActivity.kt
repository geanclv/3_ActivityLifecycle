package com.geancarloleiva.a3_activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btnStart)
        btnStart.setOnClickListener{
            val typeIntent = Intent(this, TypeActivity::class.java)
            startActivity(typeIntent)
        }
    }
}