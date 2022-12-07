package com.globe.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("https://oujqh4k1jk.execute-api.ap-southeast-1.amazonaws.com/Testing/pets/1")
    suspend fun getQuotes() : Response<QuoteList>
}