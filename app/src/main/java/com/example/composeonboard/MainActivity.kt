package com.example.composeonboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composeonboard.data.OnBoardingData
import com.example.composeonboard.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState



class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeOnboardTheme {

                Surface(modifier = Modifier.fillMaxSize()) {

                    val items = ArrayList<OnBoardingData>()

                    items.add(
                        OnBoardingData(
                            R.drawable.three,
                            "Make your own food",
                            "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ",
                            backgroundColor = Color(0xFF0189C5),
                            mainColor = Color(0xFF00B5EA),
                        )
                    )

                    items.add(
                        OnBoardingData(
                            R.drawable.two,
                            "Free delivery",
                            "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ",
                            backgroundColor = Color(0xFFE4AF19),
                            mainColor = ColorYellow
                        )
                    )

                    items.add(
                        OnBoardingData(
                            R.drawable.one,
                            "Easy to cook",
                            "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ",
                            backgroundColor = Color(0xFF96E172),
                            mainColor = ColorGreen
                        )
                    )

                    val pagerState = rememberPagerState(
                        pageCount = items.size,
                        initialOffscreenLimit = 2,
                        infiniteLoop = false,
                        initialPage = 0,
                    )
                    OnboardingPager(

                        item = items, pagerState = pagerState, modifier = Modifier
                            .fillMaxWidth()
                            .background(color = ColorBlue)
                    )
                }
            }
        }
    }
}