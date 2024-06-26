package com.sena.navigation_compose_dependency.Screen.SubScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sena.navigation_compose_dependency.R

@Composable
fun Pagina2_7(navHostController: NavHostController, nombre: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2196F3))
    ) {
        // Botón de navegación en la esquina superior izquierda
        Button(
            onClick = {
                navHostController.navigate("view_2/$nombre")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .size(48.dp)
                .align(Alignment.TopStart)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.pagina2_1),
                contentDescription = "Botón de navegación"
            )
        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Contenido informativo
            Column(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.view_7),
                    contentDescription = "Imagen ilustrativa",
                    modifier = Modifier.aspectRatio(1.5f)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "El Virus del Papiloma Humano (VPH) es una infección de transmisión sexual común que puede no presentar síntomas.\n" +
                            "En algunos casos, el VPH puede causar:\n\n" +
                            "- Verrugas genitales (pequeñas protuberancias en los genitales o cerca de ellos)\n" +
                            "- Lesiones anales o genitales que pueden ser precursoras de cáncer\n" +
                            "- En casos raros, cáncer de cuello uterino, vulva, vagina, pene, ano o garganta\n\n" +
                            "Es fundamental realizar exámenes de detección periódicos y buscar atención médica si se notan cambios o síntomas inusuales. " +
                            "La vacunación contra el VPH puede prevenir muchas de las infecciones y complicaciones asociadas.",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    textAlign = TextAlign.Justify
                )


                Text(
                    text = "Puntos de encuentro en donde podrás aplicarte la vacuna:\n" +
                            "\n"+
                            "Clínica León XIII: Carrera 48 #57-30, Barrio Aranjuez.\n" +
                            "\n" +
                            "Hospital Infantil Concejo de Medellín: Calle 64 #50-01, Barrio Sevilla.",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
