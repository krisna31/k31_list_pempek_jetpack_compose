package com.krisna31.k31_list_pempek_jetpack_compose.ui.navbar

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object About : Screen("about")
    object DetailPempek : Screen("home/{pempekId}") {
        fun createRoute(pempekId: Int) = "home/$pempekId"
    }
}
