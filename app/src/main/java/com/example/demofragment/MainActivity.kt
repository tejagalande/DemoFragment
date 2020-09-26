package com.example.demofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment




class MainActivity : AppCompatActivity() , Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment_one()
        supportFragmentManager.beginTransaction().replace(R.id.main_activity,fragment1).commit()
    }

    override fun passDataComm(v: View) {


        }

    }

interface Communicator {

    fun passDataComm(v : View)

}
