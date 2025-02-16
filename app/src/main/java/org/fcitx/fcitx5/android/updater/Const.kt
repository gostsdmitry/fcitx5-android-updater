package org.fcitx.fcitx5.android.updater

import android.os.Build

object Const {
    val deviceABI: String
        get() = Build.SUPPORTED_ABIS[0]
    const val apkMineType = "application/vnd.android.package-archive"
    const val updaterProviderName = BuildConfig.APPLICATION_ID + ".provider"
    const val fcitx5AndroidPackageName = "org.fcitx.fcitx5.android"
    const val fcitx5AndroidJenkinsJobName = "fcitx5-android"
    const val fcitx5AndroidGitHubOwner = "fcitx5-android"
    const val fcitx5AndroidGitHubRepo = "fcitx5-android"
    const val retryDuration = 1500L
}