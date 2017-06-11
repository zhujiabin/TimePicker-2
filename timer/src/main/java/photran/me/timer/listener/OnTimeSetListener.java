package photran.me.timer.listener;

/**
 * Created by photran on 6/1/17.
 */


import photran.me.timer.TimePickerDialog;

/**
 * The callback interface used to indicate the user is done filling in
 * the time (they clicked on the 'Set' button).
 */
public interface OnTimeSetListener {

    /**
     * @param dialog    The dialog associated with this listener.
     * @param hourOfDay The hour that was set.
     * @param minute    The minute that was set.
     */
    void onTimeSet(TimePickerDialog dialog, int hourOfDay, int minute);
}
