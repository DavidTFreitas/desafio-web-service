package com.example.desafiowebservice.model

import java.io.Serializable

data class Item(
    val name: String,
    val resourceURI: String,
    val role: String
): Serializable