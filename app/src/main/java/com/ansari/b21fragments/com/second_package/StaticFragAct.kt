package com.ansari.b21fragments.com.second_package

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ansari.b21fragments.R

class StaticFragAct : AppCompatActivity(), MyInterface {
    override fun myMethod(data: String) {
        var fragStatTwo = FragmentStatTwo()
        fragStatTwo = supportFragmentManager.findFragmentById(R.id.fragmentStatTwo)as FragmentStatTwo
            fragStatTwo.displayData(data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_frag)
    }
}
