package com.example.elice.mvppatternapp.view.presenter.home;

import com.example.elice.mvppatternapp.view.activity.home.ImageActivity;
import com.example.elice.mvppatternapp.view.presenter.BasePresenter;

import java.util.ArrayList;

/**
 * Created by elice.kim on 2017. 6. 4..
 */

public class ImagePresenter extends BasePresenter<ImageActivity> {

    public void loadImageList(){

        ArrayList<String> imageUrl = new ArrayList<>();
        imageUrl.add("http://cfile4.uf.tistory.com/image/234BB73E57656A5D2ED05B");
        imageUrl.add("http://pds.joins.com/news/component/htmlphoto_mmdata/201702/01/htm_2017020110214705446.JPG");
        imageUrl.add("http://fimg4.pann.com/new/download.jsp?FileID=39063901");


        view.loadResultList(imageUrl);
    }
}
