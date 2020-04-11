package com.farabi.medical4100.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ethanhua.skeleton.Skeleton
import com.farabi.medical4100.R
import com.farabi.medical4100.adapter.GiversAdapter
import com.farabi.medical4100.models.HealthCareGiver
import kotlinx.android.synthetic.main.activity_results.*
import java.util.ArrayList

class ResultsActivity : AppCompatActivity() {



  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_results)
     val mLayoutManager = LinearLayoutManager(applicationContext)

    recycler_view.setLayoutManager(mLayoutManager)
    recycler_view.addItemDecoration(
      DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
    )
    recycler_view.setItemAnimator(DefaultItemAnimator())
  Skeleton.bind(recycler_view)
      .adapter(GiversAdapter(ArrayList<HealthCareGiver>()))
      .count(10)
      .shimmer(true)
      .duration(5000)     // the shimmer animation duration.                      default is 1000;
      .frozen(false)
      .show()

  }
}
