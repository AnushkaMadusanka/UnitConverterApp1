package com.example.unitconverterapp.compose.converter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultBlock(message1:String, message2:String, modifier: Modifier = Modifier){
     Card (
         elevation = 20.dp,
         modifier = modifier.padding(0.dp,20.dp,0.dp,0.dp)
             ){
           Column(modifier = modifier.padding(10.dp)) {
                  
               Text(
                   text = message1,
                   fontSize = 28.sp
               )

               Text(
                   text = message2,
                   fontSize = 28.sp,
                   color = Color.Blue,
                   fontWeight = FontWeight.Bold
               )


           }

     }
}