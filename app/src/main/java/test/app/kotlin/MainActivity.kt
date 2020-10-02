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
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewAdapter()

       // val mtext:TextView=findViewById(R.id.text_word)

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

        val db=WordRoomDatabase.getDatabase(applicationContext)

        val wordDao: WordDao = db.wordDao()




      //mtext.text = wordDao.getAll()[1]


      //  thread {wordDao.insert(Word(100,"15","fghjgfj") ) }





        






    }
}

