package com.bkm.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bkm.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetpackComposeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = "Column composable",
                description = "Displays text and follows the recommended Material Design guidelines",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview
@Composable
fun QuadrantAppPreview() {
    MyJetpackComposeTheme {
        QuadrantApp()
    }
}
