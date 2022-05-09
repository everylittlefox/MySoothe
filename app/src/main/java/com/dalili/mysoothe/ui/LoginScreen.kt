package com.dalili.mysoothe.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dalili.mysoothe.R
import com.dalili.mysoothe.ui.components.FilledButton
import com.dalili.mysoothe.ui.components.MySootheTextField
import com.dalili.mysoothe.ui.theme.MySootheTheme

@Composable
fun LoginScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        LoginBackground()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            LoginHeading()

            Spacer(modifier = Modifier.height(32.dp))

            EmailTextField()

            Spacer(modifier = Modifier.height(8.dp))

            PasswordTextField()

            Spacer(modifier = Modifier.height(8.dp))

            LoginButton()

            CallToSignUp()
        }
    }
}

@Composable
private fun CallToSignUp() {
    Row(modifier = Modifier.paddingFromBaseline(32.dp)) {
        Text(
            text = "Don't have an account?",
            style = MaterialTheme.typography.body1,
        )
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = "Sign up",
            style = MaterialTheme.typography.body1.copy(textDecoration = TextDecoration.Underline)
        )
    }
}

@Composable
private fun LoginHeading() {
    Text(
        text = "LOG IN",
        style = MaterialTheme.typography.h1,
        modifier = Modifier.paddingFromBaseline(200.dp)
    )
}

@Composable
private fun PasswordTextField() {
    MySootheTextField(value = "", label = "Password")
}

@Composable
private fun EmailTextField() {
    MySootheTextField(value = "", label = "Email Address")
}

@Composable
private fun LoginBackground() {
    val isLight = MaterialTheme.colors.isLight
    val bgImgRes = if (isLight) {
        R.drawable.light_login
    } else {
        R.drawable.dark_login
    }

    Image(
        painter = painterResource(id = bgImgRes),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
private fun LoginButton() {
    FilledButton(text = "log in")
}

@Preview
@Composable
fun LoginScreenPreview() {
    MySootheTheme {
        LoginScreen()
    }
}