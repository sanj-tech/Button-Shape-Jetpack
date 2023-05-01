package com.example.buttonexampleinjetpack

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buttonexampleinjetpack.ui.theme.ButtonExampleInJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonExampleInJetpackTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MaterialUIApp()
                    ButtonEx()
                    OutlinedButton()

                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MaterialUIApp(){
Scaffold(
    topBar = {
        TopAppBar(
            title = {
                Text(text = "Jetpack Example")
            }
        )

    }
) {

}
}

@Composable
fun ButtonEx(){
    Column {
        Button(onClick = { Log.d("Button","Button Clicked")},
            modifier = Modifier.padding(55.dp),
            colors = ButtonDefaults
                .buttonColors(backgroundColor = Color.Green),
                shape = CircleShape, border = BorderStroke(0.5.dp, Color.Red)
        )

        {
            Text(text = "Ok", fontSize = 15.sp, color = Color.Black)

        }

    }
}
@Composable
fun OutlinedButton(){
    Column(modifier = Modifier.padding(0.dp,50.dp,0.dp)) {
        androidx.compose.material.OutlinedButton(onClick = { /*TODO*/ },
            modifier = Modifier.padding(55.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red),
            shape = CircleShape,
        ) {

            Text(text = "outlined Button", fontSize = 13.sp)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ButtonExampleInJetpackTheme {
        ButtonEx()
        OutlinedButton()
        MaterialUIApp()
    }
}