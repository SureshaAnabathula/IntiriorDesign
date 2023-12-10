package com.suresh.interiordesigning.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.suresh.interiordesigning.LoginScreen
import com.suresh.interiordesigning.SignUpScreen
import com.suresh.interiordesigning.data.home.HomeViewModel
import com.suresh.interiordesigning.navigation.InteriorAppRouter
import com.suresh.interiordesigning.navigation.Screen
import com.suresh.interiordesigning.screens.HomeScreen
import com.suresh.interiordesigning.screens.TermsAndConditionsScreen


@Composable
fun InteriorApps(homeViewModel: HomeViewModel = viewModel()) {

    homeViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        if (homeViewModel.isUserLoggedIn.value == true) {
            InteriorAppRouter.navigateTo(Screen.HomeScreen)
        }

        Crossfade(targetState = InteriorAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }

                is Screen.HomeScreen -> {
                    HomeScreen()
                }
            }
        }

    }
}