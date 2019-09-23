package com.ansari.b21fragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFrag1.setOnClickListener(View.OnClickListener {
            val fragmentOne = FragmentOne()
            var manager = supportFragmentManager.beginTransaction()
            manager.replace(R.id.fragmentStatfrag,fragmentOne)
            manager.commit()
        })

        buttonFrag2.setOnClickListener(View.OnClickListener {
            val fragmentTwo = FragmentTwo()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentStatfrag,fragmentTwo).commit()

        })
    }
}
