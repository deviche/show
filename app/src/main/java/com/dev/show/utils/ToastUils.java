package com.dev.show.utils;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Toast;

public class ToastUils {

    private static Toast toast;

    public static void showLong(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }

    public static void showShort(Context context, String msg) {

        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }
}
