package com.tjoeum.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeum.a20191106_01_listviewpractice.datas.NoticeData
import kotlinx.android.synthetic.main.activity_notice_detail.*

class NoticeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_detail)

        //as 데이터형태 - 형변환
        var noticeData:NoticeData = intent.getSerializableExtra("noticeData") as NoticeData

        titleTxt.text = noticeData.title
        contentTxt.text = noticeData.content

    }
}
