package photran.me.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import photran.me.timepicker.views.RadialPickerLayout;

public class MainActivity extends AppCompatActivity {

    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePickerDialog = new TimePickerDialog.Builder()
                .setTimer(8, 50, false)
                .setOnTimeSetListener(new OnTimeSetListener() {
                    @Override
                    void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
                        Toast.makeText(MainActivity.this, hourOfDay + "-" + minute, Toast.LENGTH_LONG).show();
                    }
                }).build();

    }

    public void onTimeDialogClicked(View view) {
        timePickerDialog.show(getFragmentManager(), TimePickerDialog.class.getName());
    }
}
