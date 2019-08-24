package com.example.animatedrating.model


class Rating(var name: String,var rating: Int){

    companion object{
        const val STRING_KEY = "THE_KEY"
//        const val RATING_KEY = "RATING"
        var vectorIsClicked = false
        var theRating = 0
        var startRatingValue = 0
        val heartsToFill = mutableListOf<Int>()
        var ratingsArray = mutableListOf<Rating>()
    }
}