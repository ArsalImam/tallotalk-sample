package com.bykea.tello.talk.sample

class TelloTalkUtils {
    fun initialize() {
        val builder: TelloApiClient.Builder = Builder()
            .accessKey("accessKey")
            .projectToken("projectToken")
            .notificationIcon("Drawable Resource for notification Small Icon")
        telloApiClient = builder.build()
    }
}