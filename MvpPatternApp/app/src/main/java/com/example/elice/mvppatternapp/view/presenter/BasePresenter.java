package com.example.elice.mvppatternapp.view.presenter;

/**
 * Created by elice.kim on 2017. 6. 4..
 */

public class BasePresenter<T> {

    public T view;

    public void setView(T view) {
        this.view = view;
    }
}
