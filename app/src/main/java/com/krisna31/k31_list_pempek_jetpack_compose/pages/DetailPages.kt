package com.krisna31.k31_list_pempek_jetpack_compose.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.krisna31.k31_list_pempek_jetpack_compose.R
import com.krisna31.k31_list_pempek_jetpack_compose.data.pempekList


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPempekPages(
    pempekId: Int,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val pempek = pempekList.find { it.id == pempekId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Detail ${pempek?.nama ?: "Pempek"}")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        onBackClick()
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Cyan,
                )
            )
        },
//        bottomBar = {
//            BottomAppBar(
//                containerColor = MaterialTheme.colorScheme.primaryContainer,
//                contentColor = MaterialTheme.colorScheme.primary,
//            ) {
//                Text(
//                    text = "Bottom app bar",
//                )
//            }
//        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.Start,
        ) {

            if (pempek != null) {
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxSize()
                        .wrapContentSize(Alignment.CenterStart)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(pempek.imgUrl)
                            .crossfade(true)
                            .build(),
                        placeholder = painterResource(R.drawable.placeholder),
                        error = painterResource(R.drawable.placeholder),
                        contentDescription = "Pempek ${pempek.nama}",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.clip(
                            RectangleShape,
                        ).align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = pempek.nama,
                        maxLines = 1,
                        style = MaterialTheme.typography.displayMedium,
                    )
                    Text(
                        text = pempek.deskripsi,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = MaterialTheme.typography.titleMedium,
                    )
                    Text(
                        text = "Isian: ${pempek.isian}",
                        maxLines = 1,
                        style = MaterialTheme.typography.titleMedium,
                    )
                    Text(
                        text = "Jenis Pengolahan: ${pempek.jenisPengolahan}",
                        maxLines = 1,
                        style = MaterialTheme.typography.titleMedium,
                    )
                    Text(
                        text = "Rp. ${pempek.harga},-",
                        maxLines = 1,
                        style = MaterialTheme.typography.titleMedium,
                    )
                }
            } else {
                Text(
                    text = "Pempek tidak ditemukan",
                    modifier = Modifier
                        .padding(start = 2.dp),
                )
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF, device = Devices.PIXEL_4)
@Composable
fun PreviewDetailPempekPages() {
    DetailPempekPages(
        pempekId = 1,
        onBackClick = {},
    )
}