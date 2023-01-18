package com.example.biometricloginsample.util

object InjectorCryptographyManager {
    fun getCryptographyManager(): CryptographyManager = CryptographyManagerImpl()
}