package photran.me.timepicker.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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

        registerReceiver(mReceiver,
                new IntentFilter(TimePickerDialog.TIME_PICKER_DIALOG_RESULT_ACTION));
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(mReceiver);
        super.onDestroy();
    }

    public BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final TimePickerDialog.Builder builder = new TimePickerDialog.Builder(intent);
            Toast.makeText(HomeActivity.this,
                    builder.getHourOfDay() + "-" + builder.getMinute(),
                    Toast.LENGTH_LONG)
                    .show();
        }
    };

    @Override
    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
        Log.v("TimePickerDialog", "in activity " + hourOfDay + "-" + minute);
    }
}
