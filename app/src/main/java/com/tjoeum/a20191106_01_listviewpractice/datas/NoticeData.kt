package com.tjoeum.a20191106_01_listviewpractice.datas

import java.io.Serializable

class NoticeData(title:String, content:String, writeDate:String) : Serializable{

    var title = title
    var content = content
    var date = writeDate


}