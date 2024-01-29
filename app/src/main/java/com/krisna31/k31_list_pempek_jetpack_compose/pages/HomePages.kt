package com.krisna31.k31_list_pempek_jetpack_compose.pages

import android.R.attr.maxLines
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.krisna31.k31_list_pempek_jetpack_compose.data.Pempek
import com.krisna31.k31_list_pempek_jetpack_compose.data.pempekList


@Composable
fun HomePages(
    pempekList: List<Pempek>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        itemsIndexed(pempekList, key = { index, item -> item.id }) { index, item ->
            Row(
                modifier = modifier
                    .wrapContentSize(Alignment.Center)
                    .clickable {
                        navigateToDetail(item.id)
                    }
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                Text(
                    text = item.id.toString(),
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 2.dp)
                        .align(Alignment.CenterVertically),
                )
                Column(
                    modifier = Modifier
                        .weight(10f)
                        .padding(start = 16.dp)
                        .fillMaxSize()
                        .wrapContentSize(Alignment.CenterStart)
                ) {
                    Text(
                        text = pempekList[index].nama,
                        maxLines = 1,
                        style = MaterialTheme.typography.titleMedium,
                    )
                    Text(
                        text = pempekList[index].deskripsi,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = MaterialTheme.typography.labelSmall,
                    )
//                    Text(
//                        text = "Isian: ${pempekList[index].isian}",
//                        maxLines = 1,
//                        style = MaterialTheme.typography.labelSmall,
//                    )
//                    Text(
//                        text = "Jenis Pengolahan: ${pempekList[index].jenisPengolahan}",
//                        maxLines = 1,
//                        style = MaterialTheme.typography.labelSmall,
//                    )
                    Text(
                        text = "Rp. ${pempekList[index].harga},-",
                        maxLines = 1,
                        style = MaterialTheme.typography.labelSmall,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomePages() {
    HomePages(
        pempekList = pempekList,
        navigateToDetail = {}
    )
}