package com.example.elice.mvppatternapp.view.activity.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.elice.mvppatternapp.R;
import com.example.elice.mvppatternapp.view.presenter.home.ImagePresenter;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ImageActivity extends AppCompatActivity {

    private ImageView resultImage1;
    private ImageView resultImage2;
    private ImageView resultImage3;
    private Button button;
    private ImagePresenter imagePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ButterKnife.bind(this);
        resultImage1 = (ImageView) findViewById(R.id.resultImage1);
        resultImage2 = (ImageView) findViewById(R.id.resultImage2);
        resultImage3 = (ImageView) findViewById(R.id.resultImage3);
        button = (Button) findViewById(R.id.request);

        setupViews();
    }

    private void setupViews() {
        imagePresenter = new ImagePresenter();
        imagePresenter.setView(this);
    }

    @OnClick(R.id.request)
    void requestButton(){
        imagePresenter.loadImageList();
    }

    public void loadResultList(ArrayList<String> temp){
        Glide.with(this).load(temp.get(0)).into(resultImage1);
        Glide.with(this).load(temp.get(1)).into(resultImage2);
        Glide.with(this).load(temp.get(2)).into(resultImage3);
    }
}
