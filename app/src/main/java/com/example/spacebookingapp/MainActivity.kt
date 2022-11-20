package com.example.spacebookingapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Surface
import org.w3c.dom.Text
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            GreetingCardTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    Greeting("Android")
                }
            }
        }

    }
}

@Composable
fun Greeting(name: String){
    Surface(color = Color.CYAN){
        Text(text = "Hi, welcome to SpaceBooking!", modifier = Modifier.padding(24.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    GreetingCardTheme{
        Greeting( "Android")
    }
}