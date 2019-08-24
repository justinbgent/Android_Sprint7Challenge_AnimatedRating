package com.example.animatedrating.view

import android.content.Context
import android.graphics.drawable.Animatable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.animatedrating.R



class AddRatingsList(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    companion object{
        var theRating = 0
    }

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AddRatingsList)
        val textSize = typedArray.getDimension(R.styleable.AddRatingsList_textSize, 16f)
        typedArray.recycle()
        val layoutParam = LayoutParams(70, 70)


        val imageView1 = ImageView(context)
        val imageView2 = ImageView(context)
        val imageView3 = ImageView(context)
        val imageView4 = ImageView(context)
        val imageView5 = ImageView(context)


        imageView1.layoutParams = layoutParam
        imageView1.scaleType = ImageView.ScaleType.CENTER
        imageView2.layoutParams = layoutParam
        imageView2.scaleType = ImageView.ScaleType.CENTER
        imageView3.layoutParams = layoutParam
        imageView3.scaleType = ImageView.ScaleType.CENTER
        imageView4.layoutParams = layoutParam
        imageView4.scaleType = ImageView.ScaleType.CENTER
        imageView5.layoutParams = layoutParam
        imageView5.scaleType = ImageView.ScaleType.CENTER

        fun animateVector(id: Int, view: ImageView){
            val vectorDrawable = ContextCompat.getDrawable(context, id)
            view.setImageDrawable(vectorDrawable)
            (vectorDrawable as Animatable).start()
        }

        fun setBorder(image: ImageView){
            image.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.outline_favorite_border_black_18dp))
        }

        fun animateFill(image: ImageView){
            animateVector(R.drawable.avd_heart_fill, image)
        }

        fun animateEmpty(image: ImageView){
            animateVector(R.drawable.avd_heart_empty, image)
        }

        imageView1.setOnClickListener {
            animateFill(imageView1)
            animateEmpty(imageView2)
            animateEmpty(imageView3)
            animateEmpty(imageView4)
            animateEmpty(imageView5)
            theRating = 1
        }

        imageView2.setOnClickListener {
            animateFill(imageView1)
            animateFill(imageView2)
            animateEmpty(imageView3)
            animateEmpty(imageView4)
            animateEmpty(imageView5)
            theRating = 2
        }

        imageView3.setOnClickListener {
            animateFill(imageView1)
            animateFill(imageView2)
            animateFill(imageView3)
            animateEmpty(imageView4)
            animateEmpty(imageView5)
            theRating = 3
        }

        imageView4.setOnClickListener {
            animateFill(imageView1)
            animateFill(imageView2)
            animateFill(imageView3)
            animateFill(imageView4)
            animateEmpty(imageView5)
            theRating = 4
        }

        imageView5.setOnClickListener {
            animateFill(imageView1)
            animateFill(imageView2)
            animateFill(imageView3)
            animateFill(imageView4)
            animateFill(imageView5)
            theRating = 5
        }

        setBorder(imageView1)
        addView(imageView1)
        setBorder(imageView2)
        addView(imageView2)
        setBorder(imageView3)
        addView(imageView3)
        setBorder(imageView4)
        addView(imageView4)
        setBorder(imageView5)
        addView(imageView5)

    }
}