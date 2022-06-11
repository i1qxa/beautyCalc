package com.example.beautycalc.domain

data class ServiceItem(
        val id:Int,
        val name:String,
        val price:Int,
        val consumableItemsList:List<Int>
) {
}