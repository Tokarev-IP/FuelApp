package test.app.kotlin.bdroom

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface WordDao {
    @Query("SELECT * from word_table")
    fun getAll(): List<Word>

    @Query("SELECT number from word_table")
    fun getNumbers(): List<String>

    @Insert()
    fun insert(word: Word)

    @Query("SELECT word from word_table WHERE word=:mword")
    fun selectWord(mword: String):List<String>

    @Query("DELETE FROM word_table")
    fun deleteAll()
}

