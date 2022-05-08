package com.dalili.mysoothe.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dalili.mysoothe.R
import com.dalili.mysoothe.ui.components.FilledButton
import com.dalili.mysoothe.ui.theme.MySootheTheme

@Composable
fun WelcomeScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        WelcomeBackground()

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            MySootheLogo()

            Spacer(modifier = Modifier.height(32.dp))

            SignUpButton()
            
            Spacer(modifier = Modifier.height(8.dp))

            LoginButton()
        }
    }
}

@Composable
private fun MySootheLogo() {
    val isLight = MaterialTheme.colors.isLight
    val logoRes = if (isLight) {
        R.drawable.light_logo
    } else {
        R.drawable.dark_logo
    }

    Image(
        painter = painterResource(id = logoRes),
        contentDescription = "MySoothe",
    )
}

@Composable
private fun WelcomeBackground() {
    val isLight = MaterialTheme.colors.isLight
    val bgImgRes = if (isLight) {
        R.drawable.light_welcome
    } else {
        R.drawable.dark_welcome
    }

    Image(
        painter = painterResource(id = bgImgRes),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
private fun SignUpButton() {
    FilledButton(text = "sign up")
}

@Composable
private fun LoginButton() {
    FilledButton(text = "log in", color = MaterialTheme.colors.secondary)
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    MySootheTheme(darkTheme = true) {
        WelcomeScreen()
    }
}