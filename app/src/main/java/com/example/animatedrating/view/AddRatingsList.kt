package com.example.animatedrating.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat.startActivity
import com.example.animatedrating.R
import com.example.animatedrating.activity.RateActivity

class AddRatingsList(context: Context, attributeSet: AttributeSet): ConstraintLayout(context, attributeSet) {


//    <fragment
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_margin="4dp"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toTopOf="parent">
//
//    </fragment>
//
//    <Button
//    android:id="@+id/button"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_margin="4dp"
//    android:text="Hello World!"
//    app:layout_constraintBottom_toBottomOf="parent"
//    app:layout_constraintLeft_toLeftOf="parent"
//    app:layout_constraintRight_toRightOf="parent" />

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AddRatingsList)
        val textSize = typedArray.getDimension(R.styleable.AddRatingsList_textSize, 16f)
        typedArray.recycle()
        val layoutParam = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        val addRatingBtn = Button(context)
        val constraintSet = ConstraintSet()

        addRatingBtn.text = "Add Rating"
        addRatingBtn.layoutParams = layoutParam
        addRatingBtn.textSize = textSize

        constraintSet.connect(addRatingBtn.id, ConstraintSet.TOP, this.id, ConstraintSet.TOP)
        constraintSet.connect(addRatingBtn.id, ConstraintSet.LEFT, this.id, ConstraintSet.LEFT)
        constraintSet.connect(addRatingBtn.id, ConstraintSet.RIGHT, this.id, ConstraintSet.RIGHT)
        constraintSet.connect(addRatingBtn.id, ConstraintSet.BOTTOM, this.id, ConstraintSet.BOTTOM)

        addRatingBtn.setOnClickListener {
            val intent = Intent(context, RateActivity::class.java)
            val bundle: Bundle? = null
            startActivity(context, intent, bundle)
        }
        addView(addRatingBtn)

    }

}