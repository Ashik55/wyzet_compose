package com.aashiq.wyzet.di

import com.aashiq.wyzet.data.repository.OnboardingRepositoryImpl
import com.aashiq.wyzet.features.onboarding.domain.repository.OnboardingRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun providesMovieRepository(
        onboardingRepositoryImpl: OnboardingRepositoryImpl
    ): OnboardingRepository


}