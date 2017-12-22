package com.initfusion.jenkinsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Main2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        if (v == btnPrintToast) {
            var str = editText?.text.toString()
            if (str.trim().isEmpty()) {
                str = "Please enter some value to editText and then try"
            }
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        } else if (v == btnRunTimeException) {
            var str = editText?.text.toString()
            if (str.trim().isEmpty()) {
                str = "Please enter some value to editText and then try to throw exception"
            }
//            throw RuntimeException(str)
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
            //From throw exception your app will be crashed with error message.
        }
    }

    var btnPrintToast: Button? = null
    var btnRunTimeException: Button? = null
    var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<EditText>(R.id.editText)
        btnPrintToast = findViewById<Button>(R.id.btnToast)
        btnRunTimeException = findViewById<Button>(R.id.btnRunTimeException)

        btnPrintToast?.setOnClickListener(this)
        btnRunTimeException?.setOnClickListener(this)
    }

}
