package com.example.unitconverterapp.compose.history

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.unitconverterapp.data.ConversionResult

@Composable
fun HistoryScreen(
    list : State<List<ConversionResult>>,
    onCloseTask : (ConversionResult) -> Unit,
    onClearAllTask : () -> Unit,
    modifier: Modifier = Modifier
){
   Column {
       if((list.value).isNotEmpty()) {
           Row(
               modifier = modifier
                   .fillMaxWidth()
                   .padding(bottom = 10.dp),
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               Text(
                   text = "History",
                   color = Color.Gray
               )
               OutlinedButton(onClick = { onClearAllTask() }) {
                   Text(
                       text = "Clear All",
                       color = Color.Gray
                   )

               }
           }
       }


       HistoryList(
           list = list,
           onCloseTask = { item ->
               onCloseTask(item)
           }
       )
   }

}