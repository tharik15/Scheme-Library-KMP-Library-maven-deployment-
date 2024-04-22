package com.example.libraryextensibility

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.libraryextensibility.databinding.ActivityMainBinding
import com.example.libraryextensibility.ui.theme.LibraryExtensibilityTheme
import com.example.schemelib.SchemeClass

class MainActivity : ComponentActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appliedSchemeList = SchemeClass.getAppliedSchemeList()
        for (schemeBo in appliedSchemeList){
            binding.nameTv.text = "Scheme Name : "+schemeBo.schemeName

        }

    }
}