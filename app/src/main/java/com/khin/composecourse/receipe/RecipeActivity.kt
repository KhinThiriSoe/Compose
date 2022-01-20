package com.khin.composecourse.receipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.khin.composecourse.receipe.ui.theme.ComposeCourseTheme
import com.khin.composecourse.receipe.ui.theme.RecipeList

class RecipeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    TopAppBar(title = {
                        Text("ComposableCookBook")
                    })
                    RecipeList(defaultRecipes)
                }
            }
        }
    }
}

@Composable
@Preview
fun Greeting() {
    Column {
        Text("Hello, World!", style = TextStyle(color = Color.Red))
        Text("Hello, Second World!", style = TextStyle(color = Color.Red))
        Text("Hello, Third World!", style = TextStyle(color = Color.Red))
    }
}