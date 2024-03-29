package com.ansari.b21fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_two,container,false)
        var res :String = arguments!!.getString("key")

        Toast.makeText(activity,"data received : " + res,Toast.LENGTH_LONG).show()
        view.textView.text = res
        return view
    }
}