package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.pawsitivedetect.tools.UtilityFunction.Companion.calculateTimeAgo
import com.example.pawsitivedetect.tools.UtilityFunction.Companion.generateRandomTime
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun TimeDebugger() {

    val date1 by remember {
        mutableStateOf(generateRandomTime().toString())
    }
    val date2 by remember {
        mutableStateOf(generateRandomTime().toString())
    }
    val date3 by remember {
        mutableStateOf(generateRandomTime().toString())
    }
    val date4 by remember {
        mutableStateOf(generateRandomTime().toString())
    }
    val date5 by remember {
        mutableStateOf(generateRandomTime().toString())
    }

//    val postTime = LocalDateTime.parse("2023-01-01T12:34:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
//    val timeAgo = calculateTimeAgo(postTime)

    val postTime1 = LocalDateTime.parse(date1, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    val timeAgo1 = calculateTimeAgo(postTime1)

    val postTime2 = LocalDateTime.parse(date2, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    val timeAgo2 = calculateTimeAgo(postTime2)

    val postTime3 = LocalDateTime.parse(date3, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    val timeAgo3 = calculateTimeAgo(postTime3)

    val postTime4 = LocalDateTime.parse(date4, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    val timeAgo4 = calculateTimeAgo(postTime4)

    val postTime5 = LocalDateTime.parse(date5, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    val timeAgo5 = calculateTimeAgo(postTime5)

    Column {
        /*Text(text = postTime.toString())
        Text(text = timeAgo)*/

        Text(text = date1)
        Text(text = timeAgo1)

        Text(text = date2)
        Text(text = timeAgo2)

        Text(text = date3)
        Text(text = timeAgo3)

        Text(text = date4)
        Text(text = timeAgo4)

        Text(text = date5)
        Text(text = timeAgo5)
    }

}



@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun TimeDebuggerPreview() {
    PawsitiveDetectTheme {
        Surface {
            TimeDebugger()
        }
    }
}