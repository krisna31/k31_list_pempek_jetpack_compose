package com.krisna31.k31_list_pempek_jetpack_compose.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.krisna31.k31_list_pempek_jetpack_compose.data.Pempek


@Composable
fun HomePages(
    modifier: Modifier = Modifier,
    pempekList: List<Pempek>,
    navigateToDetail: (Int) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Home Screen",
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
//    LazyVerticalGrid(
//        columns = GridCells.Adaptive(160.dp),
//        contentPadding = PaddingValues(16.dp),
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp),
//        modifier = modifier
//    ) {
//        items(pempekList) { data ->
//            RewardItem(
//                image = data.reward.image,
//                title = data.reward.title,
//                requiredPoint = data.reward.requiredPoint,
//                modifier = Modifier.clickable {
//                    navigateToDetail(data.reward.id)
//                }
//            )
//        }
//    }
}