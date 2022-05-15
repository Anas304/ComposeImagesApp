package com.example.composeimageapp.ui.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.composeimageapp.R
import com.example.composeimageapp.ui.theme.ComposeImageAppTheme


@Composable
fun ImagesMainScreen() {


}




@Composable
fun UnsplashItem() {

    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(11.dp),
        // .clickable { navigationCallback(meal.id) },
        elevation = 50.dp,
        backgroundColor = Color.White,
    ) {
        Box(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .clickable { /** TODO: Navigatioon to Details screen*/ },
            contentAlignment = Alignment.BottomCenter,

            ) {
            Image(
                painter = rememberImagePainter(data = R.drawable.mkbhd),
                contentDescription = "Content Description",
                modifier = Modifier.fillMaxSize()
            )
            Surface(
                modifier = Modifier
                    .height(40.dp)
                    .alpha(ContentAlpha.medium)
                    .fillMaxWidth(),
                color = Color.Black,
            ) {}

            Row(
                modifier = Modifier
                    .height(40.dp)
                    .padding(horizontal = 6.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "This is the Descripiton of Image",
                    style = MaterialTheme.typography.h6,
                    maxLines = 1,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }


        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultMainScreenPreview() {
    ComposeImageAppTheme {
        UnsplashItem()
    }
}