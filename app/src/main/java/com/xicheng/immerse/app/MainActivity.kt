package com.xicheng.immerse.app

import android.content.Intent
import android.os.Bundle
import com.xicheng.immerse.foundation.uilib.activity.ImmerseActivity
import com.xicheng.immerse.read.ui.ReadActivity

class MainActivity : ImmerseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 默认跳转到阅读
        startActivity(
            Intent(this, ReadActivity::class.java)
        )
    }
}