package com.example.rutasbolivia.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rutasbolivia.R
import com.example.rutasbolivia.model.Region
import kotlinx.android.synthetic.main.route_layout.view.*

class RegionListAdapter (private val list: ArrayList<Region>, private val context: Context) : RecyclerView.Adapter<RegionListAdapter.ViewHolder>() {

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

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(region: Region) {
            val route = itemView.findViewById<TextView>(R.id.route_id)
            val distance = itemView.findViewById<TextView>(R.id.distance)

            route.text = region.name
            distance.text = region.distance
        }
    }
}
