package com.krisna31.k31_list_pempek_jetpack_compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.krisna31.k31_list_pempek_jetpack_compose.data.pempekList
import com.krisna31.k31_list_pempek_jetpack_compose.ui.pages.AboutPages
import com.krisna31.k31_list_pempek_jetpack_compose.ui.pages.DetailPempekPages
import com.krisna31.k31_list_pempek_jetpack_compose.ui.pages.HomePages
import com.krisna31.k31_list_pempek_jetpack_compose.ui.component.BottomBar
import com.krisna31.k31_list_pempek_jetpack_compose.ui.navbar.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.DetailPempek.route) BottomBar(navController)
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding).padding(bottom = 16.dp)
        ) {
            composable(Screen.Home.route) {
                HomePages(
                    navigateToDetail = { pempekId ->
                        navController.navigate(Screen.DetailPempek.createRoute(pempekId))
                    },
                    pempekList = pempekList,
                )
            }
            composable(Screen.About.route) {
                AboutPages()
            }
            composable(
                route = Screen.DetailPempek.route,
                arguments = listOf(navArgument("pempekId") { type = NavType.IntType }),
            ) {
                DetailPempekPages(
                    pempekId = it.arguments?.getInt("pempekId") ?: 1,
                    onBackClick = {
                        navController.navigateUp()
                    },
                )
            }
        }
    }
}
