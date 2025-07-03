package com.isa.horoscopoapp.data.providers

import com.isa.horoscopoapp.domain.model.HoroscopeInfo
import com.isa.horoscopoapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries, Taurus, Gemini, Cancer, Leo, Virgo,
            Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
        )

    }
}