package com.example.animatedrating.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.animatedrating.R
import com.example.animatedrating.model.Rating
import com.example.animatedrating.model.Rating.Companion.STRING_KEY
import com.example.animatedrating.model.Rating.Companion.ratingsArray
import com.example.animatedrating.view.RatingHearts.Companion.theRating
import kotlinx.android.synthetic.main.rate_activity.*

class RateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rate_activity)

        btn_save_rate.setOnClickListener {
            if (theRating != 0) {
                val name = intent.getStringExtra(STRING_KEY)
                ratingsArray.add(Rating(name, theRating))
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }


}
