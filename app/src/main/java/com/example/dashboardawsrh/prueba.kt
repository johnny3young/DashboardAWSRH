package com.example.dashboardawsrh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View

class prueba : AppCompatActivity(), View.OnClickListener {


    override fun onClick(v: View) {
        val i: Intent

        when (v.id) {
            R.id.bank_card -> {
                i = Intent(this, BankActivity::class.java)
                startActivity(i)
            }
            else -> {
            }
        }
    }
}
