package com.ijb.androidpagingstudy.model

import android.arch.lifecycle.LiveData
import com.ijb.androidpagingstudy.model.Repo

/**
 * RepoSearchResult from a search, which contains LiveData<List<Repo>> holding query data,
 * and a LiveData<String> of network error state.
 */
data class RepoSearchResult(
        val data: LiveData<List<Repo>>,
        val networkErrors: LiveData<String>
)