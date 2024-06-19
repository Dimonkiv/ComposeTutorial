package com.dimonkiv.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black),
            ) {
                StyledText(text = "Jetpack Compose")
            }
        }
    }
}

@Composable
fun StyledText(text: String) {
    val fontFamily = FontFamily(
        Font(R.font.font_thin, FontWeight.Thin),
        Font(R.font.font_light, FontWeight.Light),
        Font(R.font.font_extra_light, FontWeight.ExtraLight),
        Font(R.font.font_regular, FontWeight.Normal)
    )
    Text(
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Blue,
                    fontSize = 45.sp
                )
            ) {
                append("J")
            }
            append("epack ")
            withStyle(
                style = SpanStyle(
                    color = Color.Blue,
                    fontSize = 45.sp
                )
            ) {
                append("C")
            }
            append("ompose")
        },
        color = Color.White,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )
}

@Composable
@Preview
fun StyledTextPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        StyledText(text = "Jetpack Compose")
    }
}