package com.example.app_kotlin.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_kotlin.ui.theme.AppkotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppkotlinTheme {
                appLogin()
            }
        }
    }
}


@Preview
@Composable
fun appLogin() {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(30.dp)
        ) {
            item {
                // Mensaje
                Text(
                    text = "Hola, bienvenido", fontSize = 25.sp, color = Color.Blue,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 50.dp, 0.dp, 0.dp)
                )
                //input
                OutlinedTextField(
                    value = email.value, onValueChange = {
                        email.value = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Email, contentDescription = "correo")
                    },
                    label = {
                        Text(text = "correo")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 25.dp, 0.dp, 0.dp)
                )
                //password
                OutlinedTextField(
                    value = password.value, onValueChange = {
                        password.value = it
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Lock, contentDescription = "password")
                    },
                    label = {
                        Text(text = "contraseña")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 25.dp, 0.dp, 0.dp),
                    visualTransformation = PasswordVisualTransformation()
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 25.dp, 0.dp, 0.dp)
                        .background(Color.Blue)
                ) {
                    Text(
                        text = "Ingresar",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 22.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = AnnotatedString("No tienes cuenta? Regístrate aquí"),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(40.dp)
                        .clickable {
                            // Aquí va el código que se ejecutará al hacer clic
                        },
                    style = TextStyle(
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.Underline,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

