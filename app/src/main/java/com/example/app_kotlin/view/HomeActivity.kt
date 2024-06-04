package com.example.app_kotlin.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_kotlin.ui.theme.AppkotlinTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppkotlinTheme {
                appHome()
            }
        }
    }
}
@Preview
@Composable
fun appHome(){

}