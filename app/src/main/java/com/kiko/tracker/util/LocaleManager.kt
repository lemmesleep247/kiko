package com.kiko.tracker.util

import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

object LocaleManager {
    val supportedLocales = listOf(
        "en" to "English",
        "hi" to "हिंदी"
    )

    fun setLocale(languageCode: String) {
        Log.d("LocaleManager", "Setting locale to $languageCode")
        val localeList = LocaleListCompat.forLanguageTags(languageCode)
        AppCompatDelegate.setApplicationLocales(localeList)
    }

    fun getCurrentLocaleTag(): String {
        val locales = AppCompatDelegate.getApplicationLocales()
        return if (!locales.isEmpty) locales[0]?.toLanguageTag() ?: "en" else "en"
    }
}