package com.geancarloleiva.a3_activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TypeActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)

        //forma 1 de accionar un botón clicado
        /*val btnContinue: Button = findViewById(R.id.btnNext)
        btnContinue.setOnClickListener {
            val detailIntent = Intent(this, DetailActivity::class.java)
            startActivity(detailIntent)
        }*/
    }

    //forma 2 de accionar un botón clicado
    fun btnNextClicked(view: View){
        val detailIntent = Intent(this, DetailActivity::class.java)
        startActivity(detailIntent)
    }
}