package com.krisna31.k31_list_pempek_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.krisna31.k31_list_pempek_jetpack_compose.data.pempekList
import com.krisna31.k31_list_pempek_jetpack_compose.pages.HomePages
import com.krisna31.k31_list_pempek_jetpack_compose.ui.navbar.Screen
import com.krisna31.k31_list_pempek_jetpack_compose.ui.navbar.navBarList
import com.krisna31.k31_list_pempek_jetpack_compose.ui.theme.K31ListPempekJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            K31ListPempekJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.DetailPempek.route) {
                BottomBar(navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
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
                val id = it.arguments?.getLong("rewardId") ?: -1L
                DetailScreen(
//                    rewardId = id,
//                    navigateBack = {
//                        navController.navigateUp()
//                    },
//                    navigateToCart = {
//                        navController.popBackStack()
//                        navController.navigate(Screen.Cart.route) {
//                            popUpTo(navController.graph.findStartDestination().id) {
//                                saveState = true
//                            }
//                            launchSingleTop = true
//                            restoreState = true
//                        }
//                    }
                )
            }
        }
    }
}

@Composable
fun DetailScreen() {
    Text(text = "Detail Screen")
}

@Composable
fun AboutPages(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text("Jelvin Krisna Putra")
        Text("krisnaaaputraaa@gmail.com")
    }
}

//private fun shareOrder(context: Context, summary: String) {
//    val intent = Intent(Intent.ACTION_SEND).apply {
//        type = "text/plain"
//        putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.dicoding_reward))
//        putExtra(Intent.EXTRA_TEXT, summary)
//    }
//
//    context.startActivity(
//        Intent.createChooser(
//            intent,
//            context.getString(R.string.dicoding_reward)
//        )
//    )
//}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navBarList.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.nama
                    )
                },
                label = { Text(item.nama) },
//                selected = false,
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}