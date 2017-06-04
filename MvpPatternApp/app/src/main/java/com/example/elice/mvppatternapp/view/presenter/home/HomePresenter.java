package com.example.elice.mvppatternapp.view.presenter.home;

import com.example.elice.mvppatternapp.view.activity.home.HomeActivity;
import com.example.elice.mvppatternapp.view.presenter.BasePresenter;

import java.util.ArrayList;

/**
 * Created by elice.kim on 2017. 6. 4..
 */

public class HomePresenter extends BasePresenter<HomeActivity> {

    public void loadPresentList() {

        //~~~
        ArrayList<String> abcArray = new ArrayList<>();
        abcArray.add("a");
        abcArray.add("b");
        abcArray.add("c");
        abcArray.add("d");
        abcArray.add("e");
        abcArray.add("f");
        abcArray.add("g");
        abcArray.add("h");
        abcArray.add("i");

        String temp = "";
        for (String abc : abcArray) {
            temp += abc + "\n";
        }

        view.onCompletePresentLoad(temp);
    }
}
