package com.example.kmm.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kmm.CountModel


@Composable
fun CountingScreen() {
    CountingScreenUi()
}
@Composable
fun CountingScreenUi() {
    val count = remember {
        CountModel()
    }
    var counting by remember {
        mutableIntStateOf(count.count)
    }
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = counting.toString(), color = Color.White, fontSize = 20.sp)
        Button(onClick = {
                count.increment()
                counting = count.count},
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()) {
            Text(text = "Increment")
        }
        Button(onClick = {
                count.decrement()
                counting = count.count
            }, modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth()) {
            Text(text = "Decrement")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun CountingScreenUiPreview() {
    CountingScreenUi()
}