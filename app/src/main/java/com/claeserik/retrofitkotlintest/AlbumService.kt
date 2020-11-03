package com.claeserik.retrofitkotlintest

import retrofit2.Response

interface AlbumService {
    suspend fun getAlbums() : Response<Albums>
}