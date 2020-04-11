package com.farabi.medical4100.adapter

/**
 * Created by mac on 2/6/18.
 */


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.farabi.medical4100.R
import com.farabi.medical4100.models.HealthCareGiver
import java.util.*

class GiversAdapter(moviesList: List<HealthCareGiver>) :
    RecyclerView.Adapter<GiversAdapter.MyViewHolder>() {
    private var models: List<HealthCareGiver> = ArrayList()


    private var mContext: Context? = null

    init {
        this.models = moviesList
    }


    fun setModels(givers: List<HealthCareGiver>) {
        this.models = givers
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.giver_layout, parent, false)
        mContext = parent.context

        return MyViewHolder(itemView)
    }

    private fun setScaleAnimation(view: View) {
        val anim = ScaleAnimation(
            0.0f,
            1.0f,
            0.0f,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        anim.duration = FADE_DURATION.toLong()
        view.startAnimation(anim)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val giver = models[position]

        setScaleAnimation(holder.itemView)

        holder.fullName.setText(String.format("Ip Address: %s", giver.fullName))
        holder.telephone.setText(String.format("Mac : %s", giver.address))
/*
        if (giver.fullname.equals(mRouterIp)) {
            holder.img.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_router_black_24dp));
        }


        if (networkModel.getIp().equals(mUserIp)) {
            holder.img.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_person_pin_black_24dp));
        }

        */


    }

    override fun getItemCount(): Int {
        return models.size
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var fullName: TextView
        var telephone: TextView
         var img: ImageView

        init {
            fullName = view.findViewById(R.id.fullName)
            telephone = view.findViewById(R.id.tel)

            img = view.findViewById(R.id.image)
         }
    }

    companion object {

        private val FADE_DURATION = 500 //FADE_DURATION in milliseconds
    }


}
