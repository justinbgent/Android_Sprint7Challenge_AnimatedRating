package com.example.animatedrating.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.animatedrating.R
import com.example.animatedrating.fragment.RatingsListFragment.OnListFragmentInteractionListener
import com.example.animatedrating.model.Rating
import kotlinx.android.synthetic.main.fragment_ratings.view.*


class MyratingRecyclerViewAdapter(
    private val ratingItem: MutableList<Rating>,
    private val listener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MyratingRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_ratings, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = ratingItem[position]
        holder.name.text = item.name
        holder.ratingNum.text = item.rating.toString()
    }

    override fun getItemCount(): Int = ratingItem.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.name_text
        val ratingNum = view.rating_text
    }
}
