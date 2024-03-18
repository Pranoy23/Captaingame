package com.example.captaingame

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptaingameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptaingameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Captaingame()

                }
            }
        }
    }

    @Composable
    fun Captaingame(){
         val treasurefound = remember { mutableStateOf( 0)}
         val direction= remember { mutableStateOf("north")}
        val stormOrTreasure = remember { mutableStateOf("") }

            Column {
                Text(text = "Treasure Found :  ${treasurefound.value}")
                Text(text = "current direction : ${direction.value}")
                Text(text = stormOrTreasure.value)

                Button(onClick = {
                    direction.value="east"
                    if (Random.nextBoolean()){
                            treasurefound.value +=1
                            stormOrTreasure.value="we found a treasure!!"
                        }else{
                            stormOrTreasure.value="Strom ahead !! "

                        }

                    }) {
                        Text(text = "sail east")

                }

                Button(onClick = { direction.value="west"
                    if (Random.nextBoolean()){
                        treasurefound.value +=1
                        stormOrTreasure.value="we found a treasure!!"
                    }else{
                        stormOrTreasure.value="Strom ahead !! "

                    }
                }) {
                    Text(text = "sail west")

                }
                Button(onClick = { direction.value="south"
                    if (Random.nextBoolean()){
                        treasurefound.value +=1
                        stormOrTreasure.value="we found a treasure!!"
                    }else{
                        stormOrTreasure.value="Strom ahead !! "

                    }
                }) {
                    Text(text = "sail south")

                }
                Button(onClick = { direction.value="north"
                    if (Random.nextBoolean()){
                        treasurefound.value +=1
                        stormOrTreasure.value="we found a treasure!!"
                    }else{
                        stormOrTreasure.value="Strom ahead !! "

                    }
                }) {
                    Text(text = "sail north")

                }
            }


    }

}



