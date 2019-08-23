package com.example.animatedrating.model

import java.io.Serializable

class Rating(var name: String,var rating: Int): Serializable{

    var ratingsArray = mutableListOf<Rating>()
}