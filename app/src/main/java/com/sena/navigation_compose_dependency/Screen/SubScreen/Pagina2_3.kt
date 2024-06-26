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
fun Pagina2_3(navHostController: NavHostController, nombre: String) {
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
                    painter = painterResource(id = R.drawable.view_3),
                    contentDescription = "Imagen ilustrativa",
                    modifier = Modifier.aspectRatio(1.5f)
                )

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "La mayoría de las personas no tienen síntomas después de infectarse.\n\n" +
                            "Algunas presentan un cuadro agudo con síntomas que duran varias semanas:\n\n" +
                            "- Coloración amarillenta de la piel y los ojos (ictericia)\n" +
                            "- Orina oscura\n" +
                            "- Cansancio extremo\n" +
                            "- Náuseas\n" +
                            "- Vómitos\n" +
                            "- Dolor abdominal\n" +
                            "La hepatitis aguda, si es grave, puede provocar una insuficiencia hepática, lo que puede acarrear la muerte.\n\n" +
                            "Aunque la mayoría de las personas se recuperarán de una enfermedad aguda, algunas " +
                            "personas con hepatitis B crónica contraerán una enfermedad hepática progresiva y " +
                            "presentarán complicaciones, como cirrosis y carcinoma hepatocelular (cáncer de hígado). " +
                            "Estas enfermedades pueden ser mortales.",
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
                            "Parque Explora: Carrera 52 #73-75.\n" +
                            "\n"+
                            "Plaza Botero: Carrera 52 #52-43.",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
