package dev.javiersantoyo.learntogetherpractice.taskmanager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.javiersantoyo.learntogetherpractice.R

@Composable
fun TaskManager() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                NiceToWork(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}

@Composable
fun NiceToWork(modifier: Modifier) {
    val successImage = painterResource(R.drawable.ic_task_completed)
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = successImage, contentDescription = "Success button")
        Column(modifier = Modifier) {
            Text(
                text = "All tasks completed",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 8.dp)
            )
            Text(text = "Nice work!",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth())
        }

    }


}

