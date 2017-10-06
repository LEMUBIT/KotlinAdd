package com.example.charl.kotlinadd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        addBtn.setOnClickListener {
            val A = Integer.parseInt(firstDigitEdit_Txt.text.toString())
            val B = Integer.parseInt(secondDigitEdit_Txt.text.toString())
            val C=A+B

            answerTxt.setText(C.toString())
        }
    }
}
