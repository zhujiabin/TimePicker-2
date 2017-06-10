package photran.me.timer.listener;

/**
 * Created by photran on 6/1/17.
 */


import photran.me.timer.views.RadialPickerLayout;

/**
 * The callback interface used to indicate the user is done filling in
 * the time (they clicked on the 'Set' button).
 */
public interface OnTimeSetListener {

    /**
     * @param view      The view associated with this listener.
     * @param hourOfDay The hour that was set.
     * @param minute    The minute that was set.
     */
    void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute);
}
