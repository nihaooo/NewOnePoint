package explame.com.smartbutler.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by www10 on 2017/4/18.
 * 工具统一类
 */

public class UtilTools {

    //设置字体
    public static void setFont(Context mContext, TextView textview) {
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(), "fonts/FONT.TTF");
        textview.setTypeface(fontType);
    }
}
