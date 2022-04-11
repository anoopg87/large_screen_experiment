package com.example.twopanetest

import androidx.compose.runtime.Composable


@Composable
fun MainScreen(
    windowSize: WindowSize
) {
    when (windowSize) {
        WindowSize.Compact -> SinglePaneWithBottomNavigation()
        WindowSize.Medium -> SinglePaneWithNavigationRail()
        WindowSize.Expanded -> DualPaneWithNavigationRail()
    }
}

@Composable
fun SinglePaneWithBottomNavigation() {
// Compose support bottom navigation
}

@Composable
fun SinglePaneWithNavigationRail() {

// Compose support Navigation Rail
}

@Composable
fun DualPaneWithNavigationRail() {
    // Compose support Navigation Rail
}



