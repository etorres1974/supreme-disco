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
        Sound("Space", image = R.drawable.ic_launcher_foreground, audio = R.raw.space),
        Sound("Think", image = R.drawable.ic_launcher_foreground, audio = R.raw.think),
    )
)

val instruments = listOf(
    Album( name = "Voice",
        sounds = listOf(
            Sound("Yeah", image = R.drawable.ic_dj, audio = R.raw.ah_yeah)
        )
    ),
    Album( name = "Instruments",
        sounds = listOf(
            Sound("Bass", image = R.drawable.ic_drum, audio = R.raw.bass)
        )
    ),
    Album( name = "Objects",
        sounds = listOf(
            Sound("Bell", image = R.drawable.ic_bell, audio = R.raw.bell)
        )
    )
)

