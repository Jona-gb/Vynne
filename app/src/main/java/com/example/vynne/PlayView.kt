@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ImageDisplayCard(imageResId: Int, contentDescription: String){
    var src :Int = imageResId
    var state by remember { mutableStateOf(false)}
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(onClick = {state =!state },
            modifier = Modifier
                .padding(
                    start = 18.dp,
                    end = 18.dp
                )
                .fillMaxWidth()
                .height(290.dp),
            shape = RoundedCornerShape(10.dp),
        ){
            Column(
                modifier = Modifier.run {
                    wrapContentSize()
                    //blur(radius = 10.dp)
                }
                ,horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                //the card that contains the music image

                Image(
                    painter = painterResource(id = src),
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                )
                src = if (state) {
                    R.drawable.gettyimage
                } else {
                    R.drawable.adobestock
                }
            }

        }

//button
        Spacer(modifier = Modifier.padding(bottom=18.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Control_Button1()
        }

}


// button to display
/*@Composable
fun TransparentCircleBlurButton(
    text: String,
    modifier: Modifier = Modifier,
) {
    var state1 by remember{
        mutableStateOf(false)
    }
    Button(
        {state1 =! state1}, modifier
            .fillMaxSize()
            .graphicsLayer {
                shape = CircleShape
                alpha = 0.5f
            },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.onSurface,
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = text)
        }
    }
}
*/

}