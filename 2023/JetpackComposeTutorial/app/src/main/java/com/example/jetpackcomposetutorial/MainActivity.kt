package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background) {
                    GreetingText(message = "Happy Birthday Mom!",
                            from = "Love Nathan")
                }//Surface
            }//JetpackComposeTutorialTheme
        }//setContent
    }//onCreate
}//ComponentActivity

@Composable
    Text(text = message,
            fontSize = 100.sp)
fun GreetingText(message: String,
        from: String,
        modifier: Modifier = Modifier) {
}//GreetingText

@Preview(showBackground = true,
        showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Mom!",
                from = "Love Nathan")
    }//JetpackComposeTutorialTheme
}//GreetingPreview
