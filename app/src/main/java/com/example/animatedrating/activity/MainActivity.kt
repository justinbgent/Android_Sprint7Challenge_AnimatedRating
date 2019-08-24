package com.example.animatedrating.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animatedrating.R
import com.example.animatedrating.fragment.RatingsListFragment
import com.example.animatedrating.model.Rating
import com.example.animatedrating.model.Rating.Companion.RATING_KEY
import com.example.animatedrating.model.Rating.Companion.STRING_KEY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RatingsListFragment.OnListFragmentInteractionListener {

    override fun onListFragmentInteraction(rating: Rating){

        val intent = Intent(this, RateActivity::class.java)

        intent.putExtra(STRING_KEY, rating.name)
        intent.putExtra(RATING_KEY, rating.rating)

        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_rate.setOnClickListener {
            val intent = Intent(this, RateActivity::class.java)
            startActivity(intent)
        }


//        supportFragmentManager.beginTransaction()
//            .replace(R.id.custom_view_holder, RatingsListFragment())
//            .addToBackStack(null)
//            .commit()
    }
}
