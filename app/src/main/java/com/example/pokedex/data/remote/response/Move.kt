package com.example.pokedex.data.remote.response

data class Move(
    val move: com.example.pokedex.data.remote.response.MoveX,
    val version_group_details: List<com.example.pokedex.data.remote.response.VersionGroupDetail>
)