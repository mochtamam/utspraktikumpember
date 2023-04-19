package com.example.utspraktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: myAdapterlist

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        showList()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<Data>()
        data.add(Data(R.drawable.p1,"Albert","Jungler (RRQ Hoshi)"))
        data.add(Data(R.drawable.p2,"Skylar","Goldlaner (RRQ Hoshi)"))
        data.add(Data(R.drawable.p3,"Clayy","Midlaner (RRQ Hoshi)"))
        data.add(Data(R.drawable.p4,"R7","Explaner (RRQ Hoshi)"))
        data.add(Data(R.drawable.p5,"VYN","Roamer (RRQ Hoshi)"))
        data.add(Data(R.drawable.p6,"Kairi","jungler (Onic Esport)"))
        data.add(Data(R.drawable.p7,"CW","Goldlaner (Onic Esport)"))
        data.add(Data(R.drawable.p8,"Butsss","Explaner (Onic Esport)"))
        data.add(Data(R.drawable.p9,"Sanz","Midlaner (Onic Esport)"))
        data.add(Data(R.drawable.p10,"Kiboy","Roamer (Onic Esport)"))
        data.add(Data(R.drawable.p11,"Celiboy","Jungler (AlterEgo"))
        data.add(Data(R.drawable.p12,"Udil","Midlaner (AlterEgo)"))
        data.add(Data(R.drawable.p13,"Rasy","Roamer (AlterEgo)"))
        data.add(Data(R.drawable.p14,"Pai","Explaner (AlterEgo)"))
        data.add(Data(R.drawable.p15,"Nino","Goldlaner (AlterEgo)"))
        data.add(Data(R.drawable.p16,"Hijumee","Midlaner (Evos Legend)"))
        data.add(Data(R.drawable.p17,"Tazz","JUngler (Evos Legend)"))
        data.add(Data(R.drawable.p18,"Saykots","Explaner (Evos Legend)"))
        data.add(Data(R.drawable.p19,"Dreams","Roamer (Evos Legend)"))
        data.add(Data(R.drawable.p20,"Branz","Goldlaner (Evos Legend)"))

        adapter = myAdapterlist(data)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                showList()
                return true
            }
            R.id.item2 -> {
                showGrid()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
