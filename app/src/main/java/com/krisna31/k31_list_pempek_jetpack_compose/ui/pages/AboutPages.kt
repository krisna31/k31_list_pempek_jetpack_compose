package com.krisna31.k31_list_pempek_jetpack_compose.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.krisna31.k31_list_pempek_jetpack_compose.R

@Composable
fun AboutPages(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = stringResource(R.string.profile_picture)
        )
        Divider(
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
        )
        Text(
            stringResource(R.string.jelvin_krisna_putra),
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
            )
        )
        Text(
            stringResource(R.string.krisnaaaputraaa_gmail_com),
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Light,
            )
        )
    }
}