package com.thishkt.demotextview

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv2.setText("HKT")
        tv2.setTextColor(Color.parseColor("#0000ff"))
        //使用 dp 設定文字大小
        tv2.setTextSize(TypedValue.COMPLEX_UNIT_PX, dpToPx(40f))

        //使用 sp 設定文字大小
        tv3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
    }

    //dp 轉 Px
    fun dpToPx(dp: Float): Float {
        return dp * this.getResources().getDisplayMetrics().density
    }
}
