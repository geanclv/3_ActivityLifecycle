package com.geancarloleiva.a3_activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConfirmActivity : AppCompatActivity() {

    var finalMsj = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        finalMsj = intent.getStringExtra(EXTRA_DETAIL).toString()

        val lblOption: TextView = findViewById(R.id.lblOption)
        lblOption.setText(finalMsj)

        val btnRestart: Button = findViewById(R.id.btnRestart)
        btnRestart.setOnClickListener{
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }
    }
}