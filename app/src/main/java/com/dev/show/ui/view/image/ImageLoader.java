package com.dev.show.ui.view.image;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import java.io.File;

public interface ImageLoader {

    void show(Context context, Uri uri, ImageView target);

    void show(Context context, File file, ImageView target);

    void show(Context context, String url, ImageView target);
}
