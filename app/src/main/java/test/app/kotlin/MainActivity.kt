package test.app.kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.google.android.material.floatingactionbutton.FloatingActionButton
import test.app.kotlin.bdroom.Word
import test.app.kotlin.bdroom.WordDao
import test.app.kotlin.bdroom.WordRoomDatabase



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewAdapter()

        val floatButton = findViewById<FloatingActionButton>(R.id.floating_button)

        floatButton.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, FragmentAdd.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
        }

/*
        val dl = Room.databaseBuilder(
            applicationContext,
            WordRoomDatabase::class.java,"database")
            .allowMainThreadQueries()
            .build()

        val wordDao: WordDao = dl.wordDao()

        val mtext:TextView=findViewById(R.id.text_word)

        wordDao.deleteAll()
       mtext.text = wordDao.getAll()[1]

        val mword = Word(
            "5",
            "90",
            "Gaz"
        )
        wordDao.insert(mword)

 */

    }
}

