package test.app.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import test.app.kotlin.bdroom.WordDao
import test.app.kotlin.bdroom.WordRoomDatabase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewAdapter()

        val db: WordRoomDatabase = Room.databaseBuilder<WordRoomDatabase>(
            applicationContext,
            WordRoomDatabase::class.java, "database"
        ).build()


        val wordDao: WordDao

    }

}

