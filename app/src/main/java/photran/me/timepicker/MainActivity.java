package photran.me.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePickerDialog = TimePickerDialog.newInstance(new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, hourOfDay + "-" + minute, Toast.LENGTH_LONG).show();
            }
        }, 30, 20, 0, true);

    }

    public void onTimeDialogClicked(View view) {
        timePickerDialog.show(getFragmentManager(), TimePickerDialog.class.getName());
    }
}
