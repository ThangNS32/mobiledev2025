package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

public class ForecastFragment extends Fragment {

    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String[] infos = {
            "Cloudy 24°C - 31°C",
            "Heavy Rain 25°C - 32°C",
            "Rain 22°C - 23°C",
            "Snow 23°C - 24°C",
            "Storm 24°C - 25°C",
            "Sunny 25°C - 26°C",
            "Windy 26°C - 27°C"
    };
    private int[] icons = {
            R.drawable.cloud,
            R.drawable.rain,
            R.drawable.heavy_rain,
            R.drawable.snow,
            R.drawable.storm,
            R.drawable.sunny,
            R.drawable.windy
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
       View rootView = inflater.inflate(R.layout.fragment_forecast, container, false);

       LinearLayout forcastContainer = rootView.findViewById(R.id.forecast_container);

       // Tạo 7 dòng dự báo
       for (int i = 0; i < days.length; i++) {
           // Layout ngang cho mỗi dòng
           LinearLayout row = new LinearLayout(getContext());
           row.setOrientation(LinearLayout.HORIZONTAL);
           row.setPadding(8, 16, 8,16);

           TextView dayText = new TextView(getContext());
           dayText.setText(days[i]);
           dayText.setTextSize(18f);
           dayText.setPadding(0, 0, 24, 0);

           ImageView weatherIcon = new ImageView(getContext());
           weatherIcon.setImageResource(icons[i]);
           weatherIcon.setPadding(0, 0, 24, 0);

           TextView infoText = new TextView(getContext());
           infoText.setText(infos[i]);
           infoText.setTextSize(16f);
           infoText.setPadding(24,0,0,0);

           row.addView(dayText);
           row.addView(weatherIcon);
           row.addView(infoText);

           forcastContainer.addView(row);
       }

        return rootView;
    }
}