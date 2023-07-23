package com.example.pokedex.util

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.palette.graphics.Palette

fun Any.log(message: String, tag: String = "RequestX") {
    Log.d(tag,"${javaClass.simpleName} -> $message")
}

/**
 * Calculate the dominant color from the given drawable.
 */
fun Drawable.calculateDominantColor(onFinish: (Color) -> Unit) {
    val bmp = (this as BitmapDrawable).bitmap.copy(Bitmap.Config.ARGB_8888, true)
    Palette.from(bmp).generate { palette ->
        palette?.dominantSwatch?.rgb?.let { colorValue ->
            onFinish(Color(colorValue))
        }
    }
}