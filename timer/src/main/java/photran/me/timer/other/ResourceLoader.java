package photran.me.timer.other;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

/**
 * Created by photran on 6/3/17.
 */

public class ResourceLoader {

    private final Context mContext;

    public ResourceLoader(Context context) {
        mContext = context;
    }

    @ColorInt
    public int getColor(@ColorRes int color) {
        return ContextCompat.getColor(mContext, color);
    }

    public String getString(@StringRes int text) {
        return mContext.getResources().getString(text);
    }

    public ColorStateList getColorStateList(@ColorRes int id) {
        return ContextCompat.getColorStateList(mContext, id);
    }
}
