package com.saantiaguilera.greener.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.rxlifecycle2.RxController
import com.saantiaguilera.greener.R

/**
 * TODO Describe what this class do.
 */
class HomeController : RxController() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.controller_home, container, false)
    }

}