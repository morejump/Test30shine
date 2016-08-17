package com.example.congbeo.test30shine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity {
    private SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderLayout = (SliderLayout) findViewById(R.id.slidelayout);
        addSliderLayout();
    }
    private void addSliderLayout(){
        TextSliderView gai = new TextSliderView(this);
        gai.description("@#$%@&!(##*@")
                .image(R.drawable.anh1);

        sliderLayout.addSlider(gai);
        sliderLayout.addSlider(gai);
        sliderLayout.addSlider(gai);
        sliderLayout.addSlider(gai);
    }
}
