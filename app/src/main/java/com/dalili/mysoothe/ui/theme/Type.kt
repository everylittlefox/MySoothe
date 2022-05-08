package com.dalili.mysoothe.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dalili.mysoothe.R

private val LatoBold = FontFamily(Font(R.font.lato_bold))
private val LatoRegular = FontFamily(Font(R.font.lato_regular))
private val KulimParkLight = FontFamily(Font(R.font.kulim_park_light))
private val KulimParkRegular = FontFamily(Font(R.font.kulim_park_regular))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = LatoRegular,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = LatoBold,
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,

    ),
    caption = TextStyle(
        fontFamily = KulimParkRegular,
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,
    ),
    h1 = TextStyle(
        fontFamily = KulimParkLight,
        fontSize = 28.sp,
        letterSpacing = 1.15.sp
    ),
    h2 = TextStyle(
        fontFamily = KulimParkRegular,
        fontSize = 15.sp,
        letterSpacing = 1.15.sp
    ),
    h3 = TextStyle(
        fontFamily = LatoBold,
        fontSize = 14.sp,
    ),
)