package com.example.esjumbo.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
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
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it },
            label = { Text(text = "Nama") })
        OutlinedTextField(
            value = noHp,
            onValueChange = {noHp = it },
            label = { Text(text = "No Hp") })
        OutlinedTextField(
            value = alamat,
            onValueChange = {alamat = it },
            label = { Text(text = "Alamat") })
    }
}