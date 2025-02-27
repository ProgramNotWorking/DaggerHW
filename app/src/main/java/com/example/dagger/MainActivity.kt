package com.example.dagger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.dagger.app.App
import com.example.feature.usecases.GetDataFromServer1UseCase
import com.example.feature.usecases.GetDataFromServer2UseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var getDataFromServer1UseCase: GetDataFromServer1UseCase
//
//    @Inject
//    lateinit var getDataFromServer2UseCase: GetDataFromServer2UseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        (application as App).featureComponent.inject(this)
//
//        lifecycleScope.launch {
//            Log.d("DATA", getDataFromServer1UseCase())
//            Log.d("DATA", getDataFromServer2UseCase())
//        }

    }
}