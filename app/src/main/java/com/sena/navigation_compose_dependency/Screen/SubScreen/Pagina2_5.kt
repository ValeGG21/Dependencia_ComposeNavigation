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
fun Pagina2_5(navHostController: NavHostController, nombre: String) {
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
                    painter = painterResource(id = R.drawable.view_5),
                    contentDescription = "Imagen ilustrativa",
                    modifier = Modifier.aspectRatio(1.5f)
                )

                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "El neumococo es una bacteria que puede causar diversas enfermedades, algunas de las cuales pueden ser graves.\n" +
                            "Los síntomas varían según la infección específica, pero pueden incluir:\n\n" +
                            "- Fiebre alta\n" +
                            "- Tos productiva\n" +
                            "- Dolor en el pecho\n" +
                            "- Dificultad para respirar\n" +
                            "- Dolor de cabeza\n" +
                            "- Rigidez en el cuello\n" +
                            "- Confusión (especialmente en personas mayores)\n" +
                            "- Dolor de oído (en caso de otitis media)\n\n" +
                            "Es importante buscar atención médica si se sospecha de una infección neumocócica, ya que puede llevar a complicaciones serias. " +
                            "La vacunación es una de las mejores maneras de prevenir las infecciones neumocócicas.",
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
                            "Clínica del Country: Carrera 80 #5B-65, Barrio Robledo.\n" +
                            "\n"+
                            "Clínica Las Vegas: Carrera 51 #51-42, Barrio Laureles.",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
