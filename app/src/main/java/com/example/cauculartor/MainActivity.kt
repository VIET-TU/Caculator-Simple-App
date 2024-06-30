package com.example.cauculartor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cauculartor.ui.theme.CauculartorTheme
import com.example.cauculartor.ui.theme.DarkMode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CauculartorTheme {
                CauculartorTheme {
                    val viewModel = viewModel<CaculatorViewModel>()
                    val state = viewModel.state
                    val buttonSpacing = 8.dp
                    Calculator(
                        state = state,
                        onAction = viewModel::onAction,
                        buttonSpacing = buttonSpacing,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Cyan)
                            .padding(16.dp)

                    )
                }
            }
        }
    }
}

