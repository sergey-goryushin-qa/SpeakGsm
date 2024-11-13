package ru.hse.speakgsm.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationDefaults
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.contentColorFor
import androidx.compose.material.primarySurface
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import ru.hse.speakgsm.app.ui.theme.SpeakGsmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpeakGsmTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar()
                    }
                ) { innerPadding ->
                }
            }
        }
    }
    @Composable
    fun BottomNavigationBar() {
        BottomNavigation(
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = MaterialTheme.colors.onPrimary
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_chat),
                        contentDescription = "Chat"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_camera),
                        contentDescription = "Camera"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_translate),
                        contentDescription = "Translate"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_history),
                        contentDescription = "History"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_fav),
                        contentDescription = "Favorite"
                    )
                },
                selected = false,
                onClick = {

                }
            )
        }
    }
}