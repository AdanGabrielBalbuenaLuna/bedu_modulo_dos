package com.example.sesion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var aceptButton : Button
    private lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aceptButton = findViewById(R.id.btn_btnAccept)
        text = findViewById(R.id.tv_text)

        aceptButton.setOnClickListener {
            text.text = getString(R.string.button_clicked)
            aceptButton.isEnabled = false
            text.visibility = View.INVISIBLE
        }
    }
}