package com.codelectro.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codelectro.runningapp.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val repository: MainRepository
): ViewModel() {
}