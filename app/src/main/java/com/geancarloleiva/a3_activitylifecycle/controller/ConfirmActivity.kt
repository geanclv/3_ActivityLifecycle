package com.geancarloleiva.a3_activitylifecycle.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.geancarloleiva.a3_activitylifecycle.R
import com.geancarloleiva.a3_activitylifecycle.model.PartyMarty
import com.geancarloleiva.a3_activitylifecycle.utils.EXTRA_PARTYMARTY

class ConfirmActivity : AppCompatActivity() {

    //Optimizando con Parcelable
    //var finalMsj = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        //Optimizando con Parcelable
        //finalMsj = intent.getStringExtra(EXTRA_DETAIL).toString()
        val partyMarty = intent.getParcelableExtra<PartyMarty>(EXTRA_PARTYMARTY)

        val lblOption: TextView = findViewById(R.id.lblOption)
        lblOption.setText("The type is ${partyMarty?.type} and the detail is ${partyMarty?.detail}")

        val btnRestart: Button = findViewById(R.id.btnRestart)
        btnRestart.setOnClickListener{
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }
    }
}