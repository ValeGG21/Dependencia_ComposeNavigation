package com.sena.navigation_compose_dependency.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sena.navigation_compose_dependency.R

data class BotonInfo(
    val icono: Int,
    val textoPrincipal: String,
    val descripcion: String,
    val onClick: () -> Unit
)

@Composable
fun Pagina2(navHostController: NavHostController, nombre: String) {
    // Lista de botones
    val listaBotones = listOf(
        BotonInfo(
            icono = R.drawable.pagina2_2,
            textoPrincipal = "Hepatitis B",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = { navHostController.navigate(route = "view_3/$nombre") }
        ),
        BotonInfo(
            icono = R.drawable.pagina2_3,
            textoPrincipal = "Sarampión",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_4/$nombre")}
        ),
        BotonInfo(
            icono = R.drawable.pagina2_4,
            textoPrincipal = "Neumococo",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_5/$nombre")}
        ),
        BotonInfo(
            icono = R.drawable.pagina2_5,
            textoPrincipal = "Influenza",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_6/$nombre")}
        ),
        BotonInfo(
            icono = R.drawable.pagina2_6,
            textoPrincipal = "Virus del Papiloma Humano (VPH)",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_7/$nombre")}
        ),
        BotonInfo(
            icono = R.drawable.pagina2_7,
            textoPrincipal = "Varicela",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_9/$nombre")}
        ),
        BotonInfo(
            icono = R.drawable.pagina2_8,
            textoPrincipal = "Tetano",
            descripcion = "Mira donde puedes aplicar esta vacuna",
            onClick = {navHostController.navigate(route = "view_8/$nombre")}
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2196F3))
    ) {
        Text(
            text = "¡Bienvenido, $nombre!",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { navHostController.navigate(route = "view_1") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(48.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pagina2_1),
                        contentDescription = "###"
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Descubre todas las vacunas que hay disponibles para ti",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }

        // Lista de botones en LazyColumn
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(listaBotones) { boton ->
                // Agregar un espacio vertical entre los elementos del LazyColumn
                Spacer(modifier = Modifier.height(8.dp))

                BotonCuadrado(boton = boton)
            }
        }
    }
}

@Composable
fun BotonCuadrado(boton: BotonInfo) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(Color.White)
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Image(
                painter = painterResource(id = boton.icono),
                contentDescription = "Icono"
            )
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = boton.textoPrincipal,
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = boton.descripcion,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
            Button(
                onClick = boton.onClick,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(text = "Ir", color = Color.Blue)
            }
        }
    }
}
