package com.example.esjumbo.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue


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
}