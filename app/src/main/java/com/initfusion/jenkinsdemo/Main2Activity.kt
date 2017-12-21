package com.initfusion.jenkinsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val btnPrintToast = findViewById<Button>(R.id.btnToast)
        val btnRunTimeException = findViewById<Button>(R.id.btnRunTimeException)

        btnPrintToast.setOnClickListener {
            var str = editText.text.toString()
            if (str.trim().isEmpty()) {
                str = "Please enter some value to editText and then try"
            }
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        }

        btnRunTimeException.setOnClickListener {
            var str = editText.text.toString()
            if (str.trim().isEmpty()) {
                str = "Please enter some value to editText and then try to throw exception"
            }

            this will be your build error

            throw RuntimeException(str)
//            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
            //From throw exception your app will be crashed with error message.
        }
    }

}
