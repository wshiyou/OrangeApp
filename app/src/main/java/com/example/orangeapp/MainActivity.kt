package com.example.orangeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.orangeapp.ui.theme.OrangeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrangeAppTheme {
   Orange()
            }
        }
    }
}

@Composable
fun Orange(modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {

    }
    var result = 1
    var orangeId = when(result)
    {
        1 -> R.drawable.orange_tree1
        2 -> R.drawable.orange_fruit1
        3 -> R.drawable.orange_drink_full1
        4 -> R.drawable.asdasd

        else -> {}
    }


    Spacer(modifier = Modifier.height((90.dp)))
    Image(painter = painterResource(R.drawable.orange_tree1), contentDescription = "orange")
    Button(onClick = {
        result = (1..4).random()
    }) {

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OrangeAppTheme {
        Orange()
    }
}