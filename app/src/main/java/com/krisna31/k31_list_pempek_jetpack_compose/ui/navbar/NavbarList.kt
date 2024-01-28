package com.krisna31.k31_list_pempek_jetpack_compose.ui.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.krisna31.k31_list_pempek_jetpack_compose.R

data class NavbarList(
    val nama: String,
    val icon: ImageVector,
    val screen: Screen
)

val navBarList = listOf(
    NavbarList(
        nama = "Home",
        icon = Icons.Default.Home,
        screen = Screen.Home
    ),
    NavbarList(
        nama = "About",
        icon = Icons.Default.AccountCircle,
        screen = Screen.About
    ),
)