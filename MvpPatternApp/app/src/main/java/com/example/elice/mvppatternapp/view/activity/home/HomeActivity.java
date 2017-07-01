package com.example.elice.mvppatternapp.view.activity.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.elice.mvppatternapp.R;
import com.example.elice.mvppatternapp.view.presenter.home.HomePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.resultTextView) TextView resultTextView;

    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        setUpViews();
    }

    //homePresenter, homeActivity 연결
    private void setUpViews() {
        homePresenter = new HomePresenter();
        homePresenter.setView(this);
    }

    //button 클릭시, 실행될 코드를 presenter의 메소드에 정의하여 호출함
    @OnClick(R.id.requestButton)
    void requestButtonClicked() {
        homePresenter.loadPresentList();
    }

    //presenter의 실행코드 완료결과를 액티비티의 텍스트뷰에 업데이트
    public void onCompletePresentLoad(String response) {
        resultTextView.setText(response);
    }
}
