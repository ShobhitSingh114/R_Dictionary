package com.example.r_dictionary.feature_dictionary.domain.repository

import com.example.r_dictionary.core.util.Resource
import com.example.r_dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}