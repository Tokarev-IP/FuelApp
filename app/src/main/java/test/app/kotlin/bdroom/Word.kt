package test.app.kotlin.bdroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "word_table")
data class Word(

    @PrimaryKey val uid: String,

    @ColumnInfo(name = "word")
    var text: String?,

    @ColumnInfo(name = "number")
    var numb: String?
)




