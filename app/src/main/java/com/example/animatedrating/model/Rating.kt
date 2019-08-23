package com.example.animatedrating.model


class Rating(var name: String,var rating: Int){

    companion object{
        const val STRING_KEY = "THE_KEY"
        const val RATING_KEY = "RATING"
        var ratingsArray = mutableListOf<Rating>()
    }
}