package com.wa2c.android.cifsdocumentsprovider.presentation.provider

/**
 * Access Mode
 */
enum class AccessMode(
    val smbMode: String,
    val safMode: String
) {
    /** Read */
    R("r", "r"),
    /** Write */
    W("rw", "w");

    companion object {
        fun fromSafMode(mode: String): AccessMode {
            return if (mode.equals(W.safMode, true)) W else R
        }
    }
}
