package com.example.animatedrating.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

import com.example.animatedrating.R
import com.example.animatedrating.view.AddRatingsList
import com.example.animatedrating.view.AddRatingsList.Companion.theRating
import kotlinx.android.synthetic.main.rate_activity.*

class RateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rate_activity)

        btn_save_rate.setOnClickListener {
            if (theRating != 0) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }


}
