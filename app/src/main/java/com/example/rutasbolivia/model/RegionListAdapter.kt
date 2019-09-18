package com.example.rutasbolivia.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rutasbolivia.R

class RegionListAdapter (private val list: ArrayList<Trail>, private val context: Context) : RecyclerView.Adapter<RegionListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.route_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(trail: Trail) {
            val route = itemView.findViewById<TextView>(R.id.route_id)
            val distance = itemView.findViewById<TextView>(R.id.distance)

            route.text = trail.name
            distance.text = trail.distance

            itemView.setOnClickListener {
//                val intent = Intent(context, MapsActivity::class.java).apply {
//                }
//                context.startActivity(intent)
            }
        }
    }
}
