package com.example.supportly.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//HACER EL FORMULARIO DE REGISTRO DE MENTOR
@Composable
fun RegisterMentor(){
    // Título
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier
                .padding(50.dp),
            text = "Registro Mentor",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Light)
        )
        Text(
            modifier = Modifier
                .padding(50.dp),
            text = "¿Preparado para Ayudar?",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Thin)
        )
    }


    Spacer(modifier = Modifier.height(100.dp))

    // Campo de texto para el Nombre
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var nom by remember { mutableStateOf("") }
        TextField(
            value = nom,
            onValueChange = { nom = it },
            label = { Text ("Nom: ") },
            placeholder = { Text ("Escriu el teu Nom ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(100.dp))

    // Campo de texto para el correo electrónico alumne
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var email_alumne by remember { mutableStateOf("") }
        TextField(
            value = email_alumne,
            onValueChange = { email_alumne = it },
            label = { Text ("Correo electrónico") },
            placeholder = { Text ("Ingresa tu correo") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para el correo electrónico Profesor
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var email_profesor by remember { mutableStateOf("") }
        TextField(
            value = email_profesor,
            onValueChange = { email_profesor = it },
            label = { Text ("Correo electrónico Tutor Instituto") },
            placeholder = { Text ("Ingresa el correo electronico del tutor de clase") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para la contraseña
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            placeholder = { Text("Ingresa tu contraseña") },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val icon = if (passwordVisible) "🙈" else "👁️"
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Text(icon)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }


    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para el Num tlf
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var num_tlf  by remember { mutableStateOf("") }
        TextField(
            value = num_tlf,
            onValueChange = { num_tlf = it },
            label = { Text ("Numero Telefono") },
            placeholder = { Text ("Numero Telefono") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }


    Spacer(modifier = Modifier.height(20.dp))


    // Botón de Registro
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { /* Lógica para Registro (que guarde el usuario en la bbdd, y que vaya a la siguiente pantalla) */ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(top = 16.dp)
        ) {
            Text(text = "Registrarse como Mentor")
        }
    }
}


//HACER EL FORMULARIO DE REGISTRO DE ALUMNE
@Composable
fun RegisterAlumne(){

    // Título
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier
                .padding(50.dp),
            text = "Registro Alumnos",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Light)
        )
        Text(
            modifier = Modifier
                .padding(50.dp),
            text = "¿Preparado para Aprender?",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Thin)
        )
    }


    Spacer(modifier = Modifier.height(100.dp))

    // Campo de texto para el Nombre
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var nom by remember { mutableStateOf("") }
        TextField(
            value = nom,
            onValueChange = { nom = it },
            label = { Text ("Nombre: ") },
            placeholder = { Text ("Escribe tu Nombre ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para el correo electrónico alumne
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var email_alumne by remember { mutableStateOf("") }
        TextField(
            value = email_alumne,
            onValueChange = { email_alumne = it },
            label = { Text ("Correo electrónico") },
            placeholder = { Text ("Ingresa tu correo") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para el correo electrónico Profesor
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var email_profesor by remember { mutableStateOf("") }
        TextField(
            value = email_profesor,
            onValueChange = { email_profesor = it },
            label = { Text ("Correo electrónico Tutor Instituto: ") },
            placeholder = { Text ("Ingresa el correo electronico del tutor de clase") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para el correo electrónico TUTOR LEGAL
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var email_tut by remember { mutableStateOf("") }
        TextField(
            value = email_tut,
            onValueChange = { email_tut = it },
            label = { Text ("Correo electrónico tutor Legal:") },
            placeholder = { Text ("Ingresa el correo de tu tutor Legal") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }

    Spacer(modifier = Modifier.height(10.dp))

    // Campo de texto para la contraseña
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            placeholder = { Text("Ingresa tu contraseña") },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val icon = if (passwordVisible) "🙈" else "👁️"
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Text(icon)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }


    Spacer(modifier = Modifier.height(20.dp))

    // Campo de texto para el Num tlf
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var num_tlf  by remember { mutableStateOf("") }
        TextField(
            value = num_tlf,
            onValueChange = { num_tlf = it },
            label = { Text ("Numero Telefono") },
            placeholder = { Text ("Numero Telefono") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
    }


    Spacer(modifier = Modifier.height(20.dp))


    // Botón de Registro
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { /* Lógica para Registro (que guarde el usuario en la bbdd, y que vaya a la siguiente pantalla) */ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(top = 16.dp)
        ) {
            Text(text = "Registrarse como alumno")
        }
    }
}