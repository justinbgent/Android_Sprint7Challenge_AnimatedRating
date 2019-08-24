package com.example.animatedrating.view

import android.content.Context
import android.graphics.drawable.Animatable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.animatedrating.R
import com.example.animatedrating.model.Rating.Companion.heartsToFill
import com.example.animatedrating.model.Rating.Companion.startRatingValue
import com.example.animatedrating.model.Rating.Companion.theRating
import com.example.animatedrating.model.Rating.Companion.vectorIsClicked


class RatingHearts(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.RatingHearts)
        val viewWeight = typedArray.getFloat(R.styleable.RatingHearts_view_weight, 0f)
        val viewWidth = typedArray.getInt(R.styleable.RatingHearts_view_width, LayoutParams.MATCH_PARENT)
        val viewHeight = typedArray.getInt(R.styleable.RatingHearts_view_height, LayoutParams.MATCH_PARENT)
        val maxRating = typedArray.getInt(R.styleable.RatingHearts_maxRating, 5)
        val startRating = typedArray.getInt(R.styleable.RatingHearts_startRating, 0)
        typedArray.recycle()

        val viewLayoutParam = LayoutParams(viewWidth, viewHeight, viewWeight)
        this.layoutParams = viewLayoutParam

        val imageLayoutParam = LayoutParams(70, 70)

        fun animateVector(id: Int, view: ImageView){
            val vectorDrawable = ContextCompat.getDrawable(context, id)
            view.setImageDrawable(vectorDrawable)
            (vectorDrawable as Animatable).start()
        }

        fun animateFill(image: ImageView){
            animateVector(R.drawable.avd_heart_fill, image)
        }

        fun animateEmpty(image: ImageView){
            animateVector(R.drawable.avd_heart_empty, image)
        }

        fun setBorderOrFill(image: ImageView, falseToFill: Boolean){
            if (falseToFill){
                image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.outline_favorite_border_black_18dp))
            }else{
                image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.filled_favorite_black_18dp))
            }

        }

//        fun heartsIWillFill(int: Int, heart: MutableList<Int>){
//            for (i in 0 until heart.size) {
//                if (int > i){
//                    animateFill(findViewById(heart[i]))
//                }else{
//                    animateEmpty(findViewById(heart[i]))
//                }
//            }
//        }

        //So user doesn't have to select a rating if they like the start rating.
        // Will default to start Rating.
        startRatingValue = startRating

        for (i in 1..maxRating){
            val image = ImageView(context)
            val rating = i
            image.layoutParams = imageLayoutParam
            image.scaleType = ImageView.ScaleType.CENTER
            image.id = i
            heartsToFill.add(image.id)

            if(startRating >= i){
                setBorderOrFill(image, false)
            }else{
                setBorderOrFill(image, true)
            }

            image.setOnClickListener {
                vectorIsClicked = true
                theRating = rating

                for (x in 0 until heartsToFill.size) {
                    if (rating > x){
                        animateFill(findViewById(heartsToFill[x]))
                    }else{
                        animateEmpty(findViewById(heartsToFill[x]))
                    }
                }
            }
            addView(image)
        }
    }
}