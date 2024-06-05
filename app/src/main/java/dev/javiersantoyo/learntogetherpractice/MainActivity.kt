package dev.javiersantoyo.learntogetherpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.javiersantoyo.learntogetherpractice.learntogether.LernTogether
import dev.javiersantoyo.learntogetherpractice.taskmanager.TaskManager
import dev.javiersantoyo.learntogetherpractice.ui.theme.LearnTogetherPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherPracticeTheme {
//               LernTogether()
                TaskManager()
            }
        }
    }
}
