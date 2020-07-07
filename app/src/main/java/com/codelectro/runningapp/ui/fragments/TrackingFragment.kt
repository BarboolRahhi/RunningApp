package com.codelectro.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.codelectro.runningapp.R
import com.codelectro.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {
    private val viewModel: MainViewModel by viewModels()
}