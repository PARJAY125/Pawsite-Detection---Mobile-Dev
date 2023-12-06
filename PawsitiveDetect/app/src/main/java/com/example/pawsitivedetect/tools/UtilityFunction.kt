package com.example.pawsitivedetect.tools

import java.time.Duration
import java.time.LocalDateTime
import java.time.Month
import kotlin.random.Random

class UtilityFunction {
    companion object {
        fun calculateTimeAgo(postTime: LocalDateTime): String {
            val currentTime = LocalDateTime.now()
            val duration = Duration.between(postTime, currentTime)

            return when {
                duration.toMinutes() < 60 -> "${duration.toMinutes()} minute${if (duration.toMinutes() > 1) "s" else ""} ago"
                duration.toHours() < 24 -> "${duration.toHours()} hour${if (duration.toHours() > 1) "s" else ""} ago"
                duration.toDays() < 7 -> "${duration.toDays()} day${if (duration.toDays() > 1) "s" else ""} ago"
                duration.toDays() < 30 -> "${duration.toDays() / 7} week${if ((duration.toDays() / 7) > 1) "s" else ""} ago"
                duration.toDays() < 365 -> "${duration.toDays() / 30} month${if ((duration.toDays() / 30) > 1) "s" else ""} ago"
                else -> "${duration.toDays() / 365} year${if ((duration.toDays() / 365) > 1) "s" else ""} ago"
            }
        }
        fun generateRandomTime(): LocalDateTime {
            // Set the range of years
            val startYear = 2020
            val endYear = 2023

            // Generate a random year within the specified range
            val randomYear = startYear + Random.nextInt(endYear - startYear + 1)

            // Generate a random month
            val randomMonth = Month.values()[Random.nextInt(12)]

            // Calculate the number of days in the selected month
            val maxDay = randomMonth.maxLength()

            // Generate a random day within the selected month
            val randomDay = Random.nextInt(maxDay) + 1

            // Generate a random hour, minute, and second
            val randomHour = Random.nextInt(24)
            val randomMinute = Random.nextInt(60)
            val randomSecond = Random.nextInt(60)

            // Create a LocalDateTime object with the generated values
            return LocalDateTime.of(randomYear, randomMonth, randomDay, randomHour, randomMinute, randomSecond)
        }
    }
}