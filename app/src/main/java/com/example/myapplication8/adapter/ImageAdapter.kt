package com.example.myapplication8.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@androidx.databinding.BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url : String ) {
    Glide.with(this.context).load(url).into(this)
}