package com.codelectro.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codelectro.runningapp.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(
    val repository: MainRepository
): ViewModel() {
}