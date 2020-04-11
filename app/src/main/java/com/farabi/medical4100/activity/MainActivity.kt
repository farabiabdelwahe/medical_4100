package com.farabi.medical4100.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.view.View
import com.farabi.medical4100.R

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    supportActionBar?.hide()


  }

  fun cardClicked(view: View) {
    Log.wtf(""+view.id ,"clicked");

    val intent = Intent(this, ResultsActivity::class.java)
    startActivity(intent)
    finish()

  }
}
