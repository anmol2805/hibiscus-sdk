package com.canopydevelopers.hibiscussdklib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.canopydevelopers.hibiscusauth.HibiscusLogin

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val hib = HibiscusLogin()
        hib.logInWithUserCredentials("student_id","password",this, {response ->
            val result = response.getString("result")
            System.out.println("response:$result")
        }, {error ->
            System.out.println("response:$error")
        })
    }
}
