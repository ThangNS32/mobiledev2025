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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        //Tạo LinearLayout theo chiều dọc
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);

        //Thêm TextView hiển thị ngày
        TextView dayText = new TextView(getActivity());
        dayText.setText("Thursday");
        dayText.setTextSize(24);
        dayText.setPadding(20,20,20,20);

        //Thêm ImageView hiển thị icon thời tiết
        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.sunny);

        layout.addView(dayText);
        layout.addView(weatherIcon);

        // Đặt màu nền
        layout.setBackgroundColor(Color.parseColor("#20FF0000"));

        return layout;
    }
}