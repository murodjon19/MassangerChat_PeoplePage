package com.example.massangerchatpeoplepage.model

data class Message(var profile : Int, var fullname: String,var isOnline : Boolean = false,var image : Int) {
}