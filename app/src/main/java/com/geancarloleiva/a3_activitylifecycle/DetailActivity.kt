package com.geancarloleiva.a3_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

    var type = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        type = intent.getStringExtra(EXTRA_TYPE).toString()
        println("El valor es: $type")
    }
}