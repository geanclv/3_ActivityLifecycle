package com.geancarloleiva.a3_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TypeActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)
    }
}