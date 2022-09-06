package com.example.myapplication.ui.Notes

import com.example.myapplication.R

class Album(
    val name : String,
    val sounds : List<Sound>
)

class Sound(
    val name : String,
    val image : Int,
    val audio : Int
)

val loops = Album( name = "Loops",
    sounds = listOf(
        Sound("Jazz", image = R.drawable.ic_launcher_foreground, audio = R.raw.jazz),
        Sound("HipHop", image = R.drawable.ic_launcher_foreground, audio = R.raw.beat),
    )
)

val instruments = listOf(
    Album( name = "Piano",
        sounds = listOf(
            Sound("A", image = R.drawable.ic_launcher_foreground, audio = R.raw.jazz)
        )
    ),
    Album( name = "Guitarra",
        sounds = listOf(
            Sound("Guitarra", image = R.drawable.ic_launcher_foreground, audio = R.raw.jazz)
        )
    )
)