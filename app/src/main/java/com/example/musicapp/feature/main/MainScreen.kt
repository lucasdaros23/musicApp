package com.example.musicapp.feature.main

import android.annotation.SuppressLint
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.data.audio.SoundPoolRepository
import com.example.musicapp.feature.components.MusicTile
import com.example.musicapp.feature.components.SidebarIconButton
import com.example.musicapp.ui.theme.Size

@Composable
fun MainScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            Modifier
                .fillMaxHeight()
                .padding(Size.mini)
            ) {
            listOfSidebarButtons.forEach {
                SidebarIconButton(id = it.first, {}, Modifier.padding(bottom = Size.tiny))
            }
        }
        Column {
            listOfTiles.chunked(3).forEachIndexed { rowIndex, rowItems ->
                Row(modifier = Modifier.weight(1f)) {
                    rowItems.forEachIndexed { lineIndex, tile ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f)

                        ) {
                            val index = lineIndex + (3 * rowIndex)
                            MusicTile(
                                tile = tile,
                                onClick = { viewModel.onPadClick(index) }
                            )
                        }
                    }
                }
            }
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true, device = "spec:width=640dp,height=360dp,orientation=landscape")
@Composable
private fun MainScreenPreview() {
    MainScreen(MainViewModel(SoundPoolRepository(LocalContext.current)))
}