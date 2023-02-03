package com.trinitywearaair.app.data

import com.trinitywearaair.app.entity.Response
import com.trinitywearaair.app.repository.BaseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

@Singleton
class BaseRepositoryImp: BaseRepository {
    override fun baseFunction(): Flow<Response<Void?>> {
        TODO("Not yet implemented")
    }
}