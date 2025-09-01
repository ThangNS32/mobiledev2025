package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.graphics.Color;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

public class ForecastFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        //Tạo một View rỗng
        FrameLayout layout = new FrameLayout(requireContext());

        // Đặt màu nền
        layout.setBackgroundColor(Color.parseColor("#20FF0000"));

        return layout;
    }
}