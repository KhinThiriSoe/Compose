package com.khin.composecourse.receipe.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.khin.composecourse.receipe.Recipe
import com.khin.composecourse.receipe.RecipeCard

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn {
        itemsIndexed(recipes) { index, item ->
            RecipeCard(item, Modifier.padding(16.dp))
        }
    }
}