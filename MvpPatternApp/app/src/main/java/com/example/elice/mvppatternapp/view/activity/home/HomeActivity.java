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

    private void setUpViews() {
        homePresenter = new HomePresenter();
        homePresenter.setView(this);
    }

    @OnClick(R.id.requestButton)
    void requestButtonClicked() {
        homePresenter.loadPresentList();
    }

    public void onCompletePresentLoad(String response) {
        resultTextView.setText(response);
    }
}
