package com.ansari.b21fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_one,container,false)

        view.buttonData.setOnClickListener(View.OnClickListener {

            Toast.makeText(activity,"Fragment Button",Toast.LENGTH_LONG).show()
            var fragTwo = FragmentTwo()
            var bundle = Bundle()
            bundle.putString("key","Ansari")
            fragTwo.arguments = bundle


            fragmentManager!!.beginTransaction().replace(R.id.mylayout,fragTwo).addToBackStack(null).commit()


        })
        return view
    }
}