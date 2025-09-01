package vn.edu.usth.weather;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout; //Tạo container động
import androidx.fragment.app.FragmentActivity;
import android.widget.TextView;

public class WeatherActivity extends FragmentActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate() called");

        FrameLayout container = new FrameLayout(this);
        container.setId(TextView.generateViewId()); //Tạo id cho container
        setContentView(container);

        //Thêm ForecastFragment vào container
        if(savedInstanceState == null){
            ForecastFragment fragment = new ForecastFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(container.getId() ,fragment)
                    .commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}