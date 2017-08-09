package com.sky.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello.setOnClickListener {
            Toast.makeText(this, "kotlin toast test!!!", Toast.LENGTH_LONG).show()
            listTest()
        }
    }

    fun listTest(){
        val lists = listOf("1234", "4556", "54454");
        lists.forEach { println(it) }
    }
}
