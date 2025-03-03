package com.example.dagger.presentation.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.dagger.R
import com.example.dagger.app.App
import com.example.dagger.presentation.viewmodel.MainViewModel
import com.example.feature.di.DaggerFeatureComponent
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer1Interface
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer2Interface
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var useCase1: GetDataFromServer1Interface

    @Inject
    lateinit var useCase2: GetDataFromServer2Interface

    @Inject
    lateinit var mainScreenFactory: MainViewModel.MainViewModelFactory.Factory
    private val viewModel: MainViewModel by viewModels {
        mainScreenFactory.create(useCase1, useCase2)
    }

    override fun onAttach(context: Context) {
        DaggerFeatureComponent.builder()
            .coreComponent((requireActivity().application as App).coreComponent)
            .build()
            .inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        fetchData()
        return view
    }

    private fun fetchData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.logDataFromServer()
        }
    }

}