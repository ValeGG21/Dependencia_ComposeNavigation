package com.sena.navigation_compose_dependency.Navigation_Controller

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sena.navigation_compose_dependency.Screen.Pagina1
import com.sena.navigation_compose_dependency.Screen.Pagina2
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_3
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_4
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_5
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_6
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_7
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_8
import com.sena.navigation_compose_dependency.Screen.SubScreen.Pagina2_9

@Composable
fun NavComponent() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = "view_1") {
        composable(route = "view_1") {
            Pagina1(navigationController)
        }
        composable(
            route = "view_2/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2(navigationController, nombre)
        }
        composable(
            route = "view_3/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_3(navigationController, nombre)
        }
        composable(
            route = "view_4/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_4(navigationController, nombre)
        }
        composable(
            route = "view_5/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_5(navigationController, nombre)
        }
        composable(
            route = "view_6/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_6(navigationController, nombre)
        }
        composable(
            route = "view_7/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_7(navigationController, nombre)
        }
        composable(
            route = "view_7/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_7(navigationController, nombre)
        }
        composable(
            route = "view_8/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_8(navigationController, nombre)
        }
        composable(
            route = "view_9/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            Pagina2_9(navigationController, nombre)
        }

    }
}

