package com.example.vynne

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp


@Composable
fun Control_Button1(){
    var state1 by remember{
        mutableStateOf(false)
    }
    var buttonS : Color = Color.Gray
    var buttonIcon1 = Icons.Filled.PlayArrow
    Button(
        {state1 =! state1},
        modifier = Modifier
            .graphicsLayer {
                shape = CircleShape
                alpha = 45.5f
            }
            .size(width = 70.dp, height = 70.dp)
        ,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonS,
            contentColor = MaterialTheme.colorScheme.onSurface,
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center,

            ) { Icon(imageVector = buttonIcon1,
            contentDescription ="Icon Button",
            modifier = Modifier
                .aspectRatio((1.0 / 1.5).toFloat()) // This is the aspect ratio of the image
                .size(3056.dp),)
        }

        if(state1){
            buttonS = Color.Gray
            buttonIcon1 = Icons.Filled.PlayArrow
        }else{
            buttonS = Color.DarkGray
            buttonIcon1 = Icons.Filled.Close
        }
    }

//BUTTON TWO
    Button(
        {state1 =! state1},
        modifier = Modifier
            .graphicsLayer {
                shape = CircleShape
                alpha = 45.5f
            }
            .size(width = 70.dp, height = 70.dp)
        ,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonS,
            contentColor = MaterialTheme.colorScheme.onSurface,
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center,

            ) { Icon(imageVector = buttonIcon1,
            contentDescription ="Icon Button",
            modifier = Modifier
                .aspectRatio((1.0 / 1.5).toFloat()) // This is the aspect ratio of the image
                .size(3056.dp),)
        }

        if(state1){
            buttonS = Color.Gray
            buttonIcon1 = Icons.Filled.PlayArrow
        }else{
            buttonS = Color.DarkGray
            buttonIcon1 = Icons.Filled.Close
        }
    }



//BUTTON THREE
    Button(
        {state1 =! state1},
        modifier = Modifier
            .graphicsLayer {
                shape = CircleShape
                alpha = 45.5f
            }
            .size(width = 70.dp, height = 70.dp)
        ,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonS,
            contentColor = MaterialTheme.colorScheme.onSurface,
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center,

            ) { Icon(imageVector = buttonIcon1,
            contentDescription ="Icon Button",
            modifier = Modifier
                .aspectRatio((1.0 / 1.5).toFloat()) // This is the aspect ratio of the image
                .size(3056.dp),)
        }

        if(state1){
            buttonS = Color.Gray
            buttonIcon1 = Icons.Filled.PlayArrow
        }else{
            buttonS = Color.DarkGray
            buttonIcon1 = Icons.Filled.Close
        }
    }


}