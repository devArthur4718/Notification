package com.devarthur4718.services.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.devarthur4718.services.R
import com.devarthur4718.services.databinding.NotificationFragmentBinding
import com.devarthur4718.services.showNotification

class NotificationFragment : Fragment() {

    companion object {
        fun newInstance() = NotificationFragment()
    }

    private lateinit var viewModel: NotificationViewModel
    private lateinit var binding : NotificationFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var fragmentViews : NotificationFragmentBinding = DataBindingUtil.inflate(
            inflater,R.layout.notification_fragment, container, false
        )
        binding = fragmentViews
        binding.lifecycleOwner =  this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NotificationViewModel::class.java)
        binding.viewmodel = viewModel
        setupObservables()

    }

    private fun setupObservables() {
        viewModel.showNotification.observe(viewLifecycleOwner, Observer { onShowNotification(it) })
    }

    @SuppressLint("ResourceType")
    private fun onShowNotification(show: Boolean) {
        if(show){
                context?.showNotification(
                title = getString(R.string.title_not_1),
                comment = getString(R.string.services_notification),
                iconDrawable = R.drawable.ic_android_black_24dp)

            viewModel.nofificationDone()
        }
    }



}
