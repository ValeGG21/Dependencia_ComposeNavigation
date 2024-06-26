package com.sena.navigation_compose_dependency.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sena.navigation_compose_dependency.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Pagina1(navHostController: NavHostController) {
    var identificacion by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2196F3))
            .padding(24.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.pagina1_2),
                contentDescription = "Logo",
                modifier = Modifier.size(256.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Hola, ingresa los datos para conocer información sobre las vacunas",
                fontSize = 15.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = identificacion,
                onValueChange = { identificacion = it },
                label = { Text(text = "Identificación", color = Color.White) },
                placeholder = { Text(text = "123...", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
            )
            OutlinedTextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text(text = "Nombre", color = Color.White) },
                placeholder = { Text(text = "Pepito Perez...", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navHostController.navigate("view_2/$nombre") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .background(color = Color.Transparent, shape = RoundedCornerShape(4.dp))
                    .border(width = 1.dp, color = Color(0xFF2196F3), shape = RoundedCornerShape(4.dp))            ) {
                Text(text = "I N G R E S A R", color = Color.Black)
            }
        }
    }
}
