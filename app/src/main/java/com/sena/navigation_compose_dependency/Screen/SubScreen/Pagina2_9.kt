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
fun Pagina2_9(navHostController: NavHostController, nombre: String) {
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
                    painter = painterResource(id = R.drawable.view_9),
                    contentDescription = "Imagen ilustrativa",
                    modifier = Modifier.aspectRatio(1.5f)
                )

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "La varicela es una enfermedad altamente contagiosa causada por el virus varicela-zóster.\n" +
                            "Sus síntomas pueden incluir:\n\n" +
                            "- Erupción cutánea con manchas rojas que se convierten en ampollas llenas de líquido\n" +
                            "- Picazón intensa en la piel\n" +
                            "- Fiebre moderada\n" +
                            "- Malestar general\n" +
                            "- Pérdida de apetito\n" +
                            "- Dolor de cabeza\n\n" +
                            "Es importante evitar el contacto cercano con personas vulnerables y buscar atención médica si se sospecha de varicela, " +
                            "especialmente para recibir tratamiento adecuado y prevenir complicaciones.",
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
                            "Clínica del Rosario de Bello: Carrera 50 #53-05, Bello (área metropolitana de Medellín).\n" +
                            "\n" +
                            "Clínica Las Vegas El Bosque: Carrera 52 #47A-08, Barrio El Bosque.",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
