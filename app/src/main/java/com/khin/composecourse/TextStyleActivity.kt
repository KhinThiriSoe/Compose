package com.khin.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.khin.composecourse.ui.theme.ComposeCourseTheme

class TextStyleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.inter_thin, FontWeight.Thin),
                Font(R.font.inter_light, FontWeight.Light),
                Font(R.font.inter_extralight, FontWeight.ExtraLight),
                Font(R.font.inter_regular, FontWeight.Normal),
                Font(R.font.inter_black, FontWeight.Black),
                Font(R.font.inter_medium, FontWeight.Medium),
                Font(R.font.inter_bold, FontWeight.Bold),
                Font(R.font.inter_semibold, FontWeight.SemiBold),
                Font(R.font.inter_extrabold, FontWeight.ExtraBold)
            )

            ComposeCourseTheme {
                val painter = painterResource(id = R.drawable.ic_beach_access)
                val description = "Kemit playing in the snow"
                val title = "Kemit ia playing in the snow"
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                ) {
                    ImageCard(painter = painter, contentDescription = description, title = title)
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF898989))
                ) {
                    Text(
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline,
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Magenta,
                                    fontSize = 50.sp
                                )
                            ) {
                                append("J")
                            }
                            append("etpack ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Magenta,
                                    fontSize = 50.sp
                                )
                            ) {
                                append("C")
                            }
                            append("ompose")
                        })
                }
            }
        }
    }
}