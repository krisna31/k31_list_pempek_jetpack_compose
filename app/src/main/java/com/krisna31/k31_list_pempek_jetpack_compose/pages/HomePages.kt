package com.krisna31.k31_list_pempek_jetpack_compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.krisna31.k31_list_pempek_jetpack_compose.data.Pempek


@Composable
fun HomePages(
    pempekList: List<Pempek>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(160.dp),
//        contentPadding = PaddingValues(16.dp),
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        items(pempekList.size) { index ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = pempekList[index].nama,
                )
                Text(text = pempekList[index].harga.toString())
            }
        }
    }
}