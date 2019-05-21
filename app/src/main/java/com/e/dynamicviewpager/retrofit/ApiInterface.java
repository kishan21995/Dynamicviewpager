package com.e.dynamicviewpager.retrofit;



import com.e.dynamicviewpager.model.TabSubChildCatRequestNew;
import com.e.dynamicviewpager.model.TabSubChildCatResponseNew;
import com.e.dynamicviewpager.model.fragmentdatamodel.TabSubChildFragment;
import com.e.dynamicviewpager.model.fragmentdatamodel.TabSubChildFragmentRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("http://vrok.in/grofer_api/child_catall")
    Call<TabSubChildCatResponseNew> getAllSubChildNew(@Body TabSubChildCatRequestNew tabSubChildCatRequestNew);

    @POST("http://vrok.in/grofer_api/fetch_by_cid")
    Call<TabSubChildFragment> getAllSubChildFragment(@Body TabSubChildFragmentRequest tabSubChildFragmentRequest);

}
