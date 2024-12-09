package com.example.supportly.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supportly.R

@Composable
fun MainPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Imagen del logo
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo de Supportly",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Fit
        )



        // Botón Registrarse
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "¿Aún no tienes cuenta?",
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Light)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción para registrarse */ },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text(
                    text = "Regístrate",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }

        // Botón Iniciar sesión
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "¿Ya tienes cuenta?",
                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Light)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción para iniciar sesión */ },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text(
                    text = "Inicia sesión",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainPage() {
    MainPage()
}
