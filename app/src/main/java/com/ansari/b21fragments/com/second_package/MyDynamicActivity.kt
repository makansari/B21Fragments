package com.ansari.b21fragments.com.second_package

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ansari.b21fragments.FragmentOne
import com.ansari.b21fragments.R

class MyDynamicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_dynamic)
        var fragOne = FragmentOne()
        supportFragmentManager.beginTransaction().add(R.id.mylayout,fragOne).commit()
    }
}
