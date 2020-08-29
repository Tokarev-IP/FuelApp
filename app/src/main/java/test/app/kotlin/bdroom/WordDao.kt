package test.app.kotlin.bdroom

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {
    @Query("SELECT word from word_table")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    @Insert()
    fun insert(word: Word)

    @Query("SELECT word from word_table WHERE word=:mword")
    fun select_word(mword: String)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}