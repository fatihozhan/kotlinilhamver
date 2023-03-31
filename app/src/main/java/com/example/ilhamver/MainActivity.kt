package com.example.ilhamver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ilhamver.ui.theme.IlhamVerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "İlham Ver", color = colorResource(id = R.color.white)) },
            backgroundColor = colorResource(id = R.color.anaRenk),

            )
    }, content = { it -> it
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.jason), contentDescription = "")
                Text(
                    text = "Jason Mamao",
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )

            }
            Text(
                text = "Dünyayı değiştirmek istiyorsan yüzücü ol!!!",
                modifier = Modifier.padding(all = 10.dp),
                textAlign = TextAlign.Center,
            )
            Button(
                onClick = {
                    Log.e("Button", "İlham Verildi")
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Red,
                    contentColor = Color.White
                )
            ) {
                Text(text = "İlham Ver")
            }
        }
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IlhamVerTheme {
        Sayfa()
    }
}