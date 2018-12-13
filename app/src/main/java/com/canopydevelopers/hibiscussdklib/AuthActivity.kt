package com.canopydevelopers.hibiscussdklib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.canopydevelopers.hibiscusauth.HibiscusLogin

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        HibiscusLogin.logInWithUserCredentials("b516008","anmol@2805",this)
    }
}
