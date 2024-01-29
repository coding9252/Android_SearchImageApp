package com.gahyeon.android_searchimageapp.retrofit

import com.gahyeon.android_searchimageapp.data.SearchImageData
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface KakaoAPIInterface {
    @GET("image")  // 엔드포인트
    suspend fun getImage(@QueryMap param: HashMap<String, String>): SearchImageData  // getImage가 요청되면 SearchImageData가 리턴됨.
}