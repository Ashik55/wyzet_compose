package com.aashiq.wyzet.features.onboarding



import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnboardingViewmodel  @Inject constructor(
//    private val movieUseCase: MovieUseCase
): ViewModel() {

//    private val _movieResponse: MutableState<MovieState> = mutableStateOf(MovieState())
//    val movieResponse:State<MovieState> = _movieResponse
//
//    private val _movieDetails:MutableState<Movies.Results> = mutableStateOf(Movies.Results())
//    val movieDetails:MutableState<Movies.Results> = _movieDetails
//
//    fun setMovie(data:Movies.Results){
//        _movieDetails.value = data
//    }
//
//    init {
//        getMovies()
//    }
//
//    private fun getMovies() = viewModelScope.launch {
//        movieUseCase.getMovies()
//            .doOnSuccess {
//                _movieResponse.value = MovieState(
//                    it,
//                )
//            }
//            .doOnFailure {
//                _movieResponse.value = MovieState(
//                    error = it.toString(),
//                )
//            }
//            .doOnLoading {
//                _movieResponse.value = MovieState(
//                    isLoading =  true
//                )
//            }.collect()
//    }

}