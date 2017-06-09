package photran.me.timepicker.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import photran.me.timepicker.R;
import photran.me.timepicker.TimePickerDialog;
import photran.me.timepicker.listener.OnTimeSetListener;
import photran.me.timepicker.views.RadialPickerLayout;

public class MainActivity extends AppCompatActivity implements OnTimeSetListener {

    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePickerDialog = new TimePickerDialog.Builder()
                .setTimer(8, 50, false)
                .createDialog();

        timePickerDialog.show(getFragmentManager(), TimePickerDialog.class.getName());
    }

    public void onTimeDialogClicked(View view) {
        timePickerDialog.show(getFragmentManager(), TimePickerDialog.class.getName());
    }

    @Override
    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
        if (timePickerDialog != null) {
            Toast.makeText(MainActivity.this, hourOfDay + "-" + minute, Toast.LENGTH_LONG).show();
        }
    }
}
