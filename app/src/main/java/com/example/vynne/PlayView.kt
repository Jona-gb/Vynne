@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class
)

package com.example.vynne

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ImageDisplayCard( contentDescription: String){
    var src :Int =R.drawable.music002
    var state by remember { mutableStateOf(false)}
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ElevatedCard(
            onClick = { state = !state },
            modifier = Modifier
                .padding(
                    start = 18.dp,
                    end = 18.dp
                )
                .fillMaxWidth()
                .height(290.dp),
            shape = RoundedCornerShape(25.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
                modifier = Modifier.run {
                    wrapContentSize()
                    blur(
                        radius = 0.dp,
                        edgeTreatment = BlurredEdgeTreatment.Rectangle
                    )
                }, horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                //the card that contains the music image

                Image(
                    painter = painterResource(id = src),
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                )
                src = if (state) {
                    R.drawable.music001
                } else {
                    R.drawable.music002
                }
            }

        }
        //===============PROGRESS BAR TO CHECK THE MUSIC PLAYING======================
        //============================================================================
        //============================================================================
        Spacer(modifier = Modifier.padding(bottom = 12.dp))
        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            LinearProgressIndicator(

            )

        }



        //===============BUTTONS TO CONTROL THE MUSIC PLAYING=========================
        //============================================================================
        //============================================================================
        Spacer(modifier = Modifier.padding(bottom = 18.dp))
        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ElevatedButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowLeft,
                    contentDescription = "Play Before"
                )
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowLeft,
                    contentDescription = "Play Before"
                )
            }



            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            var state001 by remember{ mutableStateOf(false) }
            var Xchange =Icons.Rounded.PlayArrow
            ElevatedButton(
                onClick = { state001=!state001},
                modifier = Modifier.size(65.dp),
            ) {
                Icon(imageVector = Xchange, contentDescription = "Play")
                Xchange = if(state001){
                    Icons.Rounded.PlayArrow
                }else{
                    Icons.Rounded.Close
                }
            }



            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            ElevatedButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowRight,
                    contentDescription = "Play After"
                )
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowRight,
                    contentDescription = "Play After"
                )
            }
        }
    }
}


