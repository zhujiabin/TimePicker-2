package photran.me.timepicker.other;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by photran on 6/3/17.
 */

public class BuilderFragment {
    private Bundle mBundle = new Bundle();

    public BuilderFragment() {

    }

    public <T extends Parcelable> BuilderFragment putParcelable(@NonNull String key, T object) {
        mBundle.putParcelable(key, object);
        return this;
    }

    public BuilderFragment putInt(@NonNull String key, int value) {
        mBundle.putInt(key, value);
        return this;
    }

    public BuilderFragment putString(@NonNull String key, String value) {
        mBundle.putString(key, value);
        return this;
    }

    public BuilderFragment putBoolean(@NonNull String key, boolean value) {
        mBundle.putBoolean(key, value);
        return this;
    }

    public Bundle build() {
        return mBundle;
    }
}
