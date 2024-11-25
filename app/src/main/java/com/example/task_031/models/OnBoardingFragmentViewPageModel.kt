package com.example.task_031.models

import com.example.task_031.R
import java.io.Serializable

class OnBoardingFragmentViewPagerModel (
    val generalInfo: String?,
    val invitation: String?,
    val imageView: Int?,
    var checkButton: Boolean
): Serializable {
    companion object {
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewPagerModel(
                "Сбербанк лучший.",
                "заставка",
                (R.drawable.sberbank1),
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Сбербанк удобный.",
                "авторизация",
                (R.drawable.sberbank2),
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Сбербанк полноценный.",
                "основные операции",
                (R.drawable.sberbank3),
                false
            ),
        )
    }
}