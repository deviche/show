package com.dev.show.ui.view.image;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import java.io.File;

public class ImageHelper implements ImageLoader {
    private GlideLoader loader;

    public ImageHelper(GlideLoader loader) {
        this.loader = loader;
    }

    @Override
    public void show(Context context, Uri uri, ImageView target) {
        loader.show(context,uri,target);
    }

    @Override
    public void show(Context context, File file, ImageView target) {
        loader.show(context,file,target);
    }

    @Override
    public void show(Context context, String url, ImageView target) {
        loader.show(context,url,target);
    }
}
