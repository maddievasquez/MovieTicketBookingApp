package com.maddie.movieticketbookingapp

data class Movie(
    val name : String,
    val image : Int,
    val certification : String,
    val description : String,
    val starring : Array<String>,
    val running_time_mins : Int,
    val seats_remaining : Int,
    val seats_selected : Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Movie

        if (!starring.contentEquals(other.starring)) return false

        return true
    }

    override fun hashCode(): Int {
        return starring.contentHashCode()
    }
}
