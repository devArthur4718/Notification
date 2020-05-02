package com.devarthur4718.services

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devarthur4718.services.ui.NotificationFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NotificationFragment.newInstance())
                .commitNow()
        }


//        btnNotification.setOnClickListener {
//            it.context.showNotification(
//                title = getString(R.string.title_not_1),
//                comment = getString(R.string.services_notification),
//                iconDrawable = R.drawable.ic_android_black_24dp
//            )
//        }
//
//        btnNotificationTap.setOnClickListener {
//            it.context.showNotificationTap(
//                R.drawable.ic_android_black_24dp,
//                "Notification Tap",
//                 "Notification Content",
//                "11",
//                AlertDetails::class.java,
//                false
//
//            )
//        }
//
//        btnShowToast.setOnClickListener {
//            it.context.showToast(R.string.app_name)
//        }
//
//        btnShowNowtificationAction.setOnClickListener {
//            it.context.showNotificationActionButton(
//                R.drawable.ic_android_black_24dp,
//                "Notification Action",
//                "Notification content",
//                "Show all messages",
//                "11",
//                AlertDetails::class.java
//            )
//        }
//
//        btnShowReplyButton.setOnClickListener {
//
//            it.context.showNotificationReply(
//                R.drawable.ic_message_black_24dp,
//                R.drawable.ic_screen_share_black_24dp,
//                            "Do you want to reply?",
//                            "Notifiation Content",
//                            "Reply 2",
//                                "12",
//                        AlertDetails::class.java
//            )
//        }
//
//        btnNotificationProgress.setOnClickListener {
//            it.context.showNotificationProgress(
//                R.drawable.ic_file_download_black_24dp,
//                "Picture Download",
//                "Download in Progress",
//                "14",
//                3
//            )
//        }
    }
}
