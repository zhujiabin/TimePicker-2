package photran.me.timepicker.demo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import photran.me.timepicker.R;
import photran.me.timer.TimePickerDialog;
import photran.me.timer.listener.OnTimeSetListener;
import photran.me.timer.views.RadialPickerLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment implements OnTimeSetListener {

    public static final int REQUEST_CODE_FRAGMENT_DIALOG = 0x123;

    public HomeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        view.findViewById(R.id.btnOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TimePickerDialog timePickerDialog = new TimePickerDialog.Builder()
                        .setTimer(12, 0, true)
                        .setThemeDark(false)
                        .createDialog();
                timePickerDialog.setTargetFragment(HomeActivityFragment.this, REQUEST_CODE_FRAGMENT_DIALOG);
                timePickerDialog.show(getFragmentManager(), TimePickerDialog.class.getName());
            }
        });

        return view;
    }

    @Override
    public void onTimeSet(TimePickerDialog dialog, int hourOfDay, int minute) {
        Log.v("TimePickerDialog", "in fragment " + hourOfDay + "-" + minute);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_FRAGMENT_DIALOG) {
            Log.v("TimePickerDialog", "in fragment " + "onActivityResult");
        }
    }
}
