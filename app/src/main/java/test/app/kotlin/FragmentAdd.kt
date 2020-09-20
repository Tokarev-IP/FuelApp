package test.app.kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.room.Room
import test.app.kotlin.bdroom.Word
import test.app.kotlin.bdroom.WordDao
import test.app.kotlin.bdroom.WordRoomDatabase

class FragmentAdd: Fragment() {

    companion object {
        fun newInstance(): FragmentAdd {
            return FragmentAdd()
        }
    }


    @SuppressLint("ResourceType")
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_add, container,false)

        val buttonOK: Button = view.findViewById(R.id.add_button)
        val editPrice1: EditText = view.findViewById(R.id.edit_text_1)
        val editPrice2: EditText = view.findViewById(R.id.edit_text_2)
        val editPrice3: EditText = view.findViewById(R.id.edit_text_3)

        buttonOK.setOnClickListener{

            val dl = Room.databaseBuilder(
                context!!.applicationContext,
                WordRoomDatabase::class.java,"database")
                .allowMainThreadQueries()
                .build()

            val number=editPrice1.text.toString()

            val edit_text1: Int = Integer.parseInt(number)
            val edit_text2: String = editPrice2.text.toString()
            val edit_text3: String = editPrice3.text.toString()

            val wordDao: WordDao = dl.wordDao()

            val mword = Word(
                edit_text1,
                edit_text2,
                edit_text3
            )
            wordDao.insert(mword)

           // closeFragment(savedInstanceState)
        }

        return view
    }
/*
    fun closeFragment(savedInstanceState: Bundle?){
        if (savedInstanceState == null) {
            val trancaction: FragmentTransaction? = fragmentManager?.findFragmentByTag(R.layout.fragment_add)

            trancaction?.addToBackStack()
            trancaction?.commit()

        }
    }

 */
}