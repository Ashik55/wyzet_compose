package com.aashiq.wyzet.data.network

import com.aashiq.wyzet.data.model.OnboardingItem
import com.aashiq.wyzet.data.model.OnboardingResponse
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {
    companion object {
        const val BASE_URL = "https://admin.wyzrfriends.com/api"

    }

    @GET("/landing-pages")
    suspend fun getLandingPages(): Response<OnboardingResponse>
}