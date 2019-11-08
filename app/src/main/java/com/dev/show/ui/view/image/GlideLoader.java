package com.dev.show.ui.view.image;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

public class GlideLoader implements ImageLoader {
    @Override
    public void show(Context context, Uri uri, ImageView target) {
        try {
            Glide.with(context).load(uri).into(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void show(Context context, File file, ImageView target) {
        try {
            Glide.with(context).load(file).into(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void show(Context context, String url, ImageView target) {
        try {
            Glide.with(context).load(url).into(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
