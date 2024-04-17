package com.example.r_dictionary.feature_dictionary.domain.model

import com.example.r_dictionary.feature_dictionary.domain.model.Meaning

data class WordInfo(
    val meanings: List<Meaning>,
//    val origin: String,
    val phonetic: String,
    val word: String
)
