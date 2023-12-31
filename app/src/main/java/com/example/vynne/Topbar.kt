package com.example.vynne

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun Topappbar(){
    TopAppBar(title = {            Text(text = "Vynne",
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight(4),
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    },
        navigationIcon = {
            var state0002 by remember{ mutableStateOf(false) }
            IconButton(onClick = { state0002 = ! state0002 }) {
                Icon(painter = painterResource(id = R.drawable.baseline_menu_24), contentDescription ="menu" )

            }
        },
        actions = {

            Spacer(modifier = Modifier.padding(horizontal = 8.dp))
            var state0003 by remember{ mutableStateOf(false) }
            IconButton(onClick = { state0003 = ! state0003 }) {
                Icon(painter = painterResource(id = R.drawable.baseline_settings_24), contentDescription ="menu" )

            }
        }
    )




}