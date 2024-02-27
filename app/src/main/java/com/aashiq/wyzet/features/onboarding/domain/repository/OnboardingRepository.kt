package com.aashiq.wyzet.features.onboarding.domain.repository

import com.aashiq.wyzet.common.Result
import com.aashiq.wyzet.data.model.OnboardingResponse
import kotlinx.coroutines.flow.Flow

interface OnboardingRepository {
    suspend fun getOnboardingItems(): Flow<Result<OnboardingResponse>>

}