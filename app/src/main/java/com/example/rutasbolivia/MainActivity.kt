package com.example.rutasbolivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rutasbolivia.model.RegionListAdapter
import com.example.rutasbolivia.model.ApiAdapter
import com.example.rutasbolivia.model.Trail
import kotlinx.android.synthetic.main.activity_main.*
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private var adapter: RegionListAdapter? = null
    private var trailList: ArrayList<Trail>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trailList = ArrayList<Trail>()
        layoutManager = LinearLayoutManager(this)
        adapter = RegionListAdapter(trailList!!, this)

        myRecyclerView.layoutManager = layoutManager
        myRecyclerView.adapter = adapter

        val apiAdapter = ApiAdapter()
        val apiService = apiAdapter.getClientService()
        val call = apiService.getAllCountries()

        call.enqueue(object : Callback<JsonArray> {
            override fun onFailure(call: Call<JsonArray>, t: Throwable) {
                Log.e("ERROR: ", t.message)
                t.stackTrace
            }

            override fun onResponse(call: Call<JsonArray>, response: Response<JsonArray>) {

                val offersJsonArray = response.body()?.asJsonArray
                offersJsonArray?.forEach { jsonElement: JsonElement ->
                    var jsonObject = jsonElement.asJsonObject
                }
                //VIEW

                //VIEW
            }
        })
        adapter!!.notifyDataSetChanged()
    }
}
