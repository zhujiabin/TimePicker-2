package photran.me.timepicker.listener;

/**
 * Created by photran on 6/1/17.
 */

import android.os.Parcel;
import android.os.Parcelable;

import photran.me.timepicker.views.RadialPickerLayout;

/**
 * The callback interface used to indicate the user is done filling in
 * the time (they clicked on the 'Set' button).
 */
public abstract class OnTimeSetListener implements Parcelable {

    /**
     * @param view      The view associated with this listener.
     * @param hourOfDay The hour that was set.
     * @param minute    The minute that was set.
     */
    public abstract void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute);

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
