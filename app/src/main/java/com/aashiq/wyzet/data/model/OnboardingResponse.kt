package com.aashiq.wyzet.data.model

data class OnboardingResponse(
    val `data`: Data?,
    val message: String?
) {
    data class Data(
        val items: List<OnboardingItem?>?
    )
}

data class OnboardingItem(
    val description: String?,
    val id: Int?,
    val image: String?,
    val mid_image: String?,
    val original_image: String?,
    val status: Int?,
    val thumb_image: String?,
    val title: String?
)