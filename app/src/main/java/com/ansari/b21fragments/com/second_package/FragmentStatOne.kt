package com.ansari.b21fragments.com.second_package

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ansari.b21fragments.R
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_stat_one.view.*

class FragmentStatOne : Fragment() {

    var  myInterface :MyInterface? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        myInterface = activity as StaticFragAct
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        var view = inflater.inflate(R.layout.fragment_stat_one,container,false)
        view.buttonStatData.setOnClickListener(View.OnClickListener {

            myInterface!!.myMethod("Hi Ansari")
        })


        return view
    }
}