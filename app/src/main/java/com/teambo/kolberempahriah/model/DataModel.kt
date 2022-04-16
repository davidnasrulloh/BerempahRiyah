package com.teambo.kolberempahriah.model

data class DataModel(
    val nestedList: List<String>,
    val itemText: String,
    var isExpandable: Boolean = false
)
