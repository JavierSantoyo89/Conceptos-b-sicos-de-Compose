package dev.javiersantoyo.learntogetherpractice.learntogether

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.javiersantoyo.learntogetherpractice.R

@Composable
fun LernTogether() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Banner(modifier = Modifier)
                Greeting(
                    h1Title = "Jetpack Compose tutorial",
                    p1Text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                    p2Text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}

@Composable
fun Greeting(h1Title: String, p1Text: String, p2Text: String, modifier: Modifier = Modifier) {
    Row {
        Text(
            text = h1Title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
    }
    Row {
        Text(
            text = p1Text,
//                fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
    }
    Row() {
        Text(
            text = p2Text,
//                fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}


@Composable
fun Banner(modifier: Modifier) {
    val backgroundImage = painterResource(R.drawable.bg_compose_background)
    Image(painter = backgroundImage, contentDescription = null)
}
