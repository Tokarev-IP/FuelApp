package test.app.kotlin.bdroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "word_table")
data class Word(

    @PrimaryKey val uid: Int,

    @ColumnInfo(name = "word")
    val text: String,

    @ColumnInfo(name = "number")
    val numb: String
)




