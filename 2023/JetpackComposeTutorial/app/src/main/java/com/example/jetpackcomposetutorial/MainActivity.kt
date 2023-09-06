package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      JetpackComposeTutorialTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          //GreetingText(message = "Happy Birthday Dad!", from = "Love Nathan")
          GreetingImage(message = "Happy Birthday Dad!", from = "Love Nathan")
        }//Surface
      }//JetpackComposeTutorialTheme
    }//setContent
  }//onCreate
}//ComponentActivity

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
  Column(verticalArrangement = Arrangement.Center, modifier = modifier.padding(8.dp)) {
    Text(text = message, fontSize = 90.sp, lineHeight = 116.sp, textAlign = TextAlign.Center)
    Text(text = from, fontSize = 36.sp,
      modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 40.dp)
        .align(alignment = Alignment.End))
  }//Column
}//Greeting

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
}//GreetingImage

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
  JetpackComposeTutorialTheme {
    //GreetingText(message = "Happy Birthday Dad!", from = "Love Nathan")
    GreetingImage(message = "Happy Birthday Dad!", from = "Love Nathan")
  }//JetPackComposeTutorialTheme

}//BirthdayCardPreview