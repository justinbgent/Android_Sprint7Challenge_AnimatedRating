package com.example.animatedrating.model

import java.io.Serializable

class Rating(var name: String,var rating: Int): Serializable{

    companion object{
        const val STRING_KEY = "THE_KEY"
        const val RATING_KEY = "RATING"
        var ratingsArray = mutableListOf<Rating>()
    }
}