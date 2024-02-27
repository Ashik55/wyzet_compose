package com.aashiq.wyzet.data.repository

import com.aashiq.wyzet.common.Result
import com.aashiq.wyzet.common.base.BaseRepository
import com.aashiq.wyzet.data.model.OnboardingResponse
import com.aashiq.wyzet.data.network.ApiService
import com.aashiq.wyzet.features.onboarding.domain.repository.OnboardingRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OnboardingRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : OnboardingRepository, BaseRepository() {
    override suspend fun getOnboardingItems(): Flow<Result<OnboardingResponse>> = safeApiCall {
        apiService.getLandingPages()
    }
}