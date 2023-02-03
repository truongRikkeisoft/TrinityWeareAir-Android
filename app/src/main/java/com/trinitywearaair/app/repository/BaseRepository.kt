package com.trinitywearaair.app.repository

import com.trinitywearaair.app.entity.Response
import kotlinx.coroutines.flow.Flow

interface BaseRepository {
    fun baseFunction(): Flow<Response<Void?>>
}