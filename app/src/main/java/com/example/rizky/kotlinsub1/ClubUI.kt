package com.example.rizky.kotlinsub1

import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*


class ClubUI : AnkoComponent<ViewGroup> {

    object club {
        val img_club = 1
        val nama_club = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>)= with(ui) {
        verticalLayout{
            lparams(matchParent, wrapContent){
                margin = dip(10)
            }
            orientation = LinearLayout.HORIZONTAL
            backgroundColor = Color.rgb(2, 92, 252)
            isBaselineAligned = true
            padding = dip(15)

            imageView {
                id = club.img_club
            }.lparams{
                    width = dip(50)
                    height = dip(50)}

            textView {
                id = club.nama_club
            }.lparams(wrapContent, wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }
}