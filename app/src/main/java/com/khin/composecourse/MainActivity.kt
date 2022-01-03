package com.khin.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.khin.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Hello")
                Text(text = "World")
                Text(text = "Khin")
                Text(text = "Thiri")
            }*/

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

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}