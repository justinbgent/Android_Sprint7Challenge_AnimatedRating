package com.example.animatedrating.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.animatedrating.R
import com.example.animatedrating.model.Rating
import com.example.animatedrating.model.Rating.Companion.STRING_KEY
import com.example.animatedrating.model.Rating.Companion.ratingsArray
import com.example.animatedrating.model.Rating.Companion.startRatingValue
import com.example.animatedrating.model.Rating.Companion.theRating
import com.example.animatedrating.model.Rating.Companion.vectorIsClicked
import kotlinx.android.synthetic.main.rate_activity.*

class RateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rate_activity)

        btn_save_rate.setOnClickListener {
                val name = intent.getStringExtra(STRING_KEY)

                var ratingToAdd: Int
                if (vectorIsClicked){
                    ratingToAdd = theRating
                    vectorIsClicked = false
                }else{
                    ratingToAdd = startRatingValue
                }

                ratingsArray.add(Rating(name, ratingToAdd))
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
        }
    }


}
