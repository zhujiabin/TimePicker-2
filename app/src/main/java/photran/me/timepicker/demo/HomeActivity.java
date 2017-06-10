package photran.me.timepicker.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import photran.me.timepicker.R;
import photran.me.timer.TimePickerDialog;
import photran.me.timer.listener.OnTimeSetListener;
import photran.me.timer.views.RadialPickerLayout;

public class HomeActivity extends AppCompatActivity implements OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new TimePickerDialog.Builder()
                        .setTimer(12, 0, true)
                        .setThemeDark(false)
                        .createDialog().show(getFragmentManager(), TimePickerDialog.class.getName());
            }
        });
    }

    @Override
    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
        Log.v("TimePickerDialog", "in activity " + hourOfDay + "-" + minute);
    }
}
