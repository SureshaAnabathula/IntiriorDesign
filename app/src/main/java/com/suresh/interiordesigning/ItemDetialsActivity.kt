package com.suresh.interiordesigning

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suresh.interiordesigning.ui.theme.InteriorDesigningTheme
import com.suresh.interiordesigning.ui.theme.Primary

class ItemDetialsActivity : ComponentActivity() {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InteriorDesigningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 356.dp)
                .requiredHeight(height = 640.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color = Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dropdown),
                contentDescription = "Chevron Left",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 313.dp,
                        y = 338.dp)
                    .requiredWidth(width = 32.dp)
                    .requiredHeight(height = 29.dp)
                    .rotate(degrees = 90f))
            Text(
                text = "Product Details",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 4.dp,
                        y = 338.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Reviews",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 7.dp,
                        y = 485.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Baker are completely wooded.  Baker may be good for sitting comfort. Baker Furniture  are make your home Beautifully",
                color = Color(0xff656565).copy(alpha = 0.5f),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 373.dp)
                    .requiredWidth(width = 335.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Baker Furniture",
                color = Color.Black,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp, y = 263.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            val localContext = LocalContext.current


            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 42.dp,
                        y = 699.dp)
                    .requiredWidth(width = 276.dp)
                    .requiredHeight(height = 58.dp)
                    .clip(shape = RoundedCornerShape(29.dp))
                    .background(color = Color(0xff41f13d))
                    .clickable {
                        localContext.startActivity(Intent(localContext, AddtoCartActivity::class.java))
                    }
            ) {
                Text(
                    text = "Place Order",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 63.dp,
                            y = 15.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Divider(
                color = Color(0xff656565).copy(alpha = 0.5f),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 23.dp, y = 320.dp)
                    .requiredWidth(width = 321.dp))
            Divider(
                color = Color(0xff656565).copy(alpha = 0.5f),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 13.dp, y = 478.dp)
                    .requiredWidth(width = 321.dp))
            Image(
                painter = painterResource(id = R.drawable.star1),
                contentDescription = "star 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 150.dp, y = 485.dp)
                    .requiredWidth(width = 184.dp)
                    .requiredHeight(height = 37.dp)
                    .rotate(degrees = 0.05f))
            Image(
                painter = painterResource(id = R.drawable.baker),
                contentDescription = "furniture3 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (-3).dp, y = 2.dp)
                    .requiredWidth(width = 361.dp)
                    .requiredHeight(height = 244.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .rotate(degrees = 0.32f))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp, y = 542.dp)
                    .requiredWidth(width = 276.dp)
                    .requiredHeight(height = 58.dp)
                    .clip(shape = RoundedCornerShape(29.dp))
                    .clickable {
                        localContext.startActivity(Intent(localContext, AddtoCartActivity::class.java))
                    }
                    .background(color = Color(0xff584bee))
            ) {
                Text(
                    text = "Add to cart",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 63.dp, y = 15.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
        }
        Text(
            text = "£",
            color = Color(0xff4bc5f9),
            style = TextStyle(
                fontSize = 32.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 268.dp, y = 261.dp))
        Text(
            text = "200",
            color = Color(0xff4bc5f9),
            style = TextStyle(
                fontSize = 32.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 290.dp, y = 264.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InteriorDesigningTheme {
        Greeting("Android")
    }
}