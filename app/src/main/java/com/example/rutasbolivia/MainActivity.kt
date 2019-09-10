package com.example.rutasbolivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rutasbolivia.data.RegionListAdapter
import com.example.rutasbolivia.model.Region
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter: RegionListAdapter? = null
    private var regionList: ArrayList<Region>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regionList = ArrayList<Region>()
        layoutManager = LinearLayoutManager(this)
        adapter = RegionListAdapter(regionList!!, this)

        myRecyclerView.layoutManager = layoutManager
        myRecyclerView.adapter = adapter

        loadData(regionList)
        adapter!!.notifyDataSetChanged()
    }

    private fun loadData(regionList: ArrayList<Region>?) {
        regionList?.add(Region("Region 1", "200"))
        regionList?.add(Region("Region 2", "200"))
        regionList?.add(Region("Region 3", "200"))
        regionList?.add(Region("Region 4", "200"))
        regionList?.add(Region("Region 5", "200"))
        regionList?.add(Region("Region 6", "200"))
        regionList?.add(Region("Region 7", "200"))
    }
}
