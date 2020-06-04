package pony.xcode.tablayout.utils;


import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;


/**
 * 未读消息提示View,显示小红点或者带有数字的红点:
 * 数字一位,圆
 * 数字两位,圆角矩形,圆角是高度的一半
 * 数字超过两位,显示99+
 */
public class UnreadMsgUtils {

    public static void show(TextView msgView, int num) {
        if (msgView == null) {
            return;
        }
        if (num <= 0) {//圆点,设置默认宽高
            msgView.setText("");
        } else {
            if (num < 10) {//圆
                msgView.setText(String.valueOf(num));
            } else if (num < 100) {//圆角矩形,圆角是高度的一半,设置默认padding
                msgView.setText(String.valueOf(num));
            } else {//数字超过两位,显示99+
                String over99 = "99+";
                msgView.setText(over99);
                //字体缩小
                msgView.setTextSize(TypedValue.COMPLEX_UNIT_PX, msgView.getTextSize() / 1.2f);
            }
        }
    }

    public static void setSize(TextView rtv, int size) {
        if (rtv == null) {
            return;
        }
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) rtv.getLayoutParams();
        lp.width = size;
        lp.height = size;
        rtv.setLayoutParams(lp);
    }
}
