package com.example.animatedrating.view

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.animatedrating.R
import com.example.animatedrating.activity.MainActivity

class AddRatingsList(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    //        <ImageView
//        android:id="@+id/image_view1"
//        android:layout_margin="4dp"
//        android:layout_width="30dp"
//        android:layout_height="25dp"
//        android:scaleType="fitCenter"
//        app:layout_constraintTop_toTopOf="parent"
//        app:layout_constraintLeft_toRightOf="@+id/rating_text_view"/>
    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AddRatingsList)
        val textSize = typedArray.getDimension(R.styleable.AddRatingsList_textSize, 16f)
        typedArray.recycle()
        val layoutParam = LinearLayout.LayoutParams(70, 70)


        val imageView1 = ImageView(context)
        val imageView2 = ImageView(context)
        val imageView3 = ImageView(context)
        val imageView4 = ImageView(context)
        val imageView5 = ImageView(context)
        val btn = Button(context)

        btn.text = "Rate"


        imageView1.layoutParams = layoutParam
        imageView2.layoutParams = layoutParam
        imageView3.layoutParams = layoutParam
        imageView4.layoutParams = layoutParam
        imageView5.layoutParams = layoutParam



        imageView1.setOnClickListener {

        }

        imageView2.setOnClickListener {

        }

        imageView3.setOnClickListener {

        }

        imageView4.setOnClickListener {

        }

        imageView5.setOnClickListener {

        }

        btn.setOnClickListener {
            var intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }

        imageView1.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_heart_empty))
        addView(imageView1)
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_heart_empty))
        addView(imageView2)
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_heart_empty))
        addView(imageView3)
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_heart_empty))
        addView(imageView4)
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_heart_empty))
        addView(imageView5)

        addView(btn)
    }
}