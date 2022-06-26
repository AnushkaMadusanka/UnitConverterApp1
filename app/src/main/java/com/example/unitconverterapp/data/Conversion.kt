package com.example.unitconverterapp.data

data class Conversion(
   val id : Int,
   val description : String,
   val convertFrom : String,
   val convertTo : String,
   val multiplyBy : Double
)
