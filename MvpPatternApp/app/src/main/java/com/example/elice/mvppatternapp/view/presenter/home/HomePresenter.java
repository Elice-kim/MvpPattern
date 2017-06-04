package com.example.elice.mvppatternapp.view.presenter.home;

import com.example.elice.mvppatternapp.view.activity.home.HomeActivity;
import com.example.elice.mvppatternapp.view.presenter.BasePresenter;

/**
 * Created by elice.kim on 2017. 6. 4..
 */

public class HomePresenter extends BasePresenter<HomeActivity> {

    public void loadPresentList() {

        //~~~
        //서버 호출 후
        view.onCompletePresentLoad("list1, list2, list3");
    }
}
