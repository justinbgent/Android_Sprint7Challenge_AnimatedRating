package com.example.animatedrating.adapter

import android.media.Rating
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.animatedrating.R


import com.example.animatedrating.fragment.RatingsListFragment.OnListFragmentInteractionListener
import com.example.animatedrating.fragment.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.main.fragment_ratings.view.*


class MyratingRecyclerViewAdapter(
    private val mValues: List<Rating>,
    private val listener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MyratingRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_ratings, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mIdView.text = item.id
        holder.mContentView.text = item.content

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.item_number
        val mContentView: TextView = mView.content

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
