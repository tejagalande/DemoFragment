package com.example.demofragment

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class Fragment_one : Fragment()  {

    lateinit var comm : Communicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

     val inflat = inflater.inflate(R.layout.fragment_one,container,false)
       // comm = activity as Communicator

        inflat.btn_send_fragment.setOnClickListener{
            val fragment2 = Fragment_two()
            var transaction = activity
            transaction?.supportFragmentManager!!.beginTransaction().replace(R.id.main_activity,fragment2)
                .addToBackStack(null).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit()
        }

        return inflat
    }
}