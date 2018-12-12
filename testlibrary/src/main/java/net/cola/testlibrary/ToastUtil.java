package net.cola.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    /**
     * 显示一个Toast
     *
     * @param context 上下文
     * @param str     需要显示的字符串
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
