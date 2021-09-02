package com.example.coinconverter.domain

import com.example.coinconverter.core.UseCase
import com.example.coinconverter.data.model.ExchangeResponseValue
import com.example.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DeleteExchangeUseCase (
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.deleteItem(param)
            emit(Unit)
        }
    }
}