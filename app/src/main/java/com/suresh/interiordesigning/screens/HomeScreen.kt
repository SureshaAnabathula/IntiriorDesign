package com.suresh.interiordesigning.screens

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.suresh.interiordesigning.ItemDetialsActivity
import com.suresh.interiordesigning.ProfileActivity
import com.suresh.interiordesigning.R
import com.suresh.interiordesigning.components.AppToolbar
import com.suresh.interiordesigning.components.NavigationDrawerBody
import com.suresh.interiordesigning.components.NavigationDrawerHeader
import com.suresh.interiordesigning.data.home.HomeViewModel

import kotlinx.coroutines.launch

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val contect = LocalContext.current

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere","inside_NavigationItemClicked")
                    Log.d("ComingHere","${it.itemId} ${it.title}")
                })
        }

    ) { paddingValues ->

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 640.dp)
                        .background(color = Color.White)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 53.dp, y = 22.dp)
                            .requiredWidth(width = 253.dp)
                            .requiredHeight(height = 47.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xff9bc0ec)))
                    Text(
                        text = "Goto Profile Section",
                        color = Color.Black.copy(alpha = 0.62f),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 129.dp, y = 35.dp)
                            .clickable {
                                contect.startActivity(Intent(contect, ProfileActivity::class.java))
                            }
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 15",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 315.dp, y = 89.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 16",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 329.dp, y = 89.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 17",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 315.dp, y = 101.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 14",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 329.dp, y = 101.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 7",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = (-10).dp, y = 619.dp)
                            .requiredWidth(width = 381.dp)
                            .border(border = BorderStroke(1.dp, Color.White)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 18",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 315.dp, y = 89.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 19",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 329.dp, y = 89.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.box),
                        contentDescription = "Vector 20",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 315.dp, y = 101.dp)
                            .requiredSize(size = 11.dp)
                            .clip(shape = RoundedCornerShape(2.dp))
                            .border(border = BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(2.dp)))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 7.dp,
                                y = 81.dp)
                            .requiredWidth(width = 26.dp)
                            .requiredHeight(height = 38.dp)
                            .background(color = Color(0xff110506).copy(alpha = 0.82f)))
                    Text(
                        text = "Furnitures world",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 46.dp,
                                y = 89.dp)
                            .requiredWidth(width = 196.dp)
                            .requiredHeight(height = 30.dp))
                    val localContext = LocalContext.current
                    Image(
                        painter = painterResource(id = R.drawable.baker),
                        contentDescription = "furniture3 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 176.dp)
                            .requiredWidth(width = 150.dp)
                            .requiredHeight(height = 160.dp)
                            .clip(shape = RoundedCornerShape(20.dp))

                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, ItemDetialsActivity::class.java)
                                )
                            }
                    )


                    Image(
                        painter = painterResource(id = R.drawable.trendywo),
                        contentDescription = "furniture2 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 196.dp,
                                y = 176.dp)
                            .requiredWidth(width = 150.dp)
                            .requiredHeight(height = 160.dp)
                            .clip(shape = RoundedCornerShape(20.dp))

                            .clickable {
                                localContext.startActivity(
                                    Intent(localContext, ItemDetialsActivity::class.java)
                                )
                            }

                    )
                    Text(
                        text = "Baker Furniture",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 356.dp))
                    Text(
                        text = "Trendy wooden",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 196.dp,
                                y = 363.dp))
                    Text(
                        text = "New  Bedroom",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 207.dp,
                                y = 595.dp))
                    Text(
                        text = "Outdoor",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 19.dp,
                                y = 590.dp))
                    Image(
                        painter = painterResource(id = R.drawable.newbed),
                        contentDescription = "furniture4 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 194.dp,
                                y = 422.dp)
                            .requiredWidth(width = 150.dp)
                            .requiredHeight(height = 160.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .rotate(degrees = -0.54f))
                    Image(
                        painter = painterResource(id = R.drawable.outdoor),
                        contentDescription = "furniture5 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 420.dp)
                            .requiredWidth(width = 150.dp)
                            .requiredHeight(height = 160.dp)
                            .clip(shape = RoundedCornerShape(20.dp)))
                    Text(
                        text = "Categories ",
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 19.dp,
                                y = 119.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }

            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}