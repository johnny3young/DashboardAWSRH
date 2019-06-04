package com.example.dashboardawsrh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bank_card.setOnClickListener({this})
        ideas_card.setOnClickListener({this})
        add_card.setOnClickListener({this})
        link_card.setOnClickListener({this})
        wifi_card.setOnClickListener({this})
    }

    override fun onClick(v: View) {
        val i: Intent
                when(v.id){
                    R.id.bank_card -> { i = Intent(this, BankActivity::class.java)
                    startActivity(i)}

                    R.id.ideas_card -> { i = Intent(this, IdeasActivity::class.java)
                    startActivity(i)}

                    R.id.add_card -> { i = Intent(this, AddActivity::class.java)
                    startActivity(i)}

                    R.id.link_card -> { i = Intent(this, LinksActivity::class.java)
                    startActivity(i)}

                    R.id.wifi_card -> { i = Intent(this, WiFiActivity::class.java)
                    startActivity(i)}

                    else -> {

                    }
                }
    }

}
