package com.tjoeum.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tjoeum.a20191106_01_listviewpractice.adapters.NoticeAdapter
import com.tjoeum.a20191106_01_listviewpractice.datas.NoticeData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var noticeList = ArrayList<NoticeData>()
    var noticeAdapter: NoticeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNotices()

        noticeAdapter = NoticeAdapter(this,R.layout.notice_list_item,noticeList)
        noticeListView.adapter = noticeAdapter

        noticeListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"${position} 번째 줄 클릭",Toast.LENGTH_SHORT).show()
        }

        noticeListView.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this,"${position} 번째 줄 클릭",Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener true
        }
    }

    fun addNotices(){
        noticeList.add(NoticeData("1번 공지","1번 내용입니다","2019-01-11"))
        noticeList.add(NoticeData("2번 공지","2번 내용입니다","2019-01-21"))
        noticeList.add(NoticeData("3번 공지","3번 내용입니다","2019-02-01"))
        noticeList.add(NoticeData("4번 공지","4번 내용입니다","2019-02-11"))
        noticeList.add(NoticeData("5번 공지","5번 내용입니다","2019-03-01"))
        noticeList.add(NoticeData("6번 공지","6번 내용입니다","2019-03-11"))
        noticeList.add(NoticeData("7번 공지","7번 내용입니다","2019-04-01"))
        noticeList.add(NoticeData("8번 공지","8번 내용입니다","2019-05-01"))
        noticeList.add(NoticeData("9번 공지","9번 내용입니다","2019-07-01"))
        noticeList.add(NoticeData("10번 공지","10번 내용입니다","2019-04-02"))
        noticeList.add(NoticeData("11번 공지","11번 내용입니다","2019-11-01"))
        noticeList.add(NoticeData("12번 공지","12번 내용입니다","2019-12-01"))
        noticeList.add(NoticeData("13번 공지","13번 내용입니다","2019-10-01"))

        var text = List(5,{ i -> "${i}공지"})
        Log.i("text?",text.toString())
        for (i in IntRange(0,10))
            Log.i("값은?","몇번째야?${i}")


        Log.i("값은?",IntRange(10, 20).toString())
    }
}
