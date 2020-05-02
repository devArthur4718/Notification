package com.devarthur4718.services.ui

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationViewModel : ViewModel() {

    private val _showNotification = MutableLiveData<Boolean>()
    val showNotification: LiveData<Boolean>
        get() = _showNotification

    fun showNotification(){
        _showNotification.value = true
    }
    fun nofificationDone(){
        _showNotification.value = false
    }

}
