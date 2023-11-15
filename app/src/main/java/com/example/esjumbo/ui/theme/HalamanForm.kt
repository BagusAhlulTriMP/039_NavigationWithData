package com.example.esjumbo.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit
) {
    var nama by rememberSaveable {
        mutableStateOf("") }

    var noHp by remember {
        mutableStateOf("") }

    var alamat by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(nama, noHp, alamat)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

    }
}