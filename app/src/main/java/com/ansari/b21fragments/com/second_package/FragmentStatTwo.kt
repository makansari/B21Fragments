package com.ansari.b21fragments.com.second_package

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ansari.b21fragments.R
import kotlinx.android.synthetic.main.fragment_stat_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentStatTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_stat_two,container,false)

        return view
    }

    fun displayData(result : String){
        textViewStat.text = result
    }
}