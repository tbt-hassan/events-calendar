package ir.hasantbt.schedule

import android.view.ViewGroup
import ir.hasantbt.common.models.Event
import ir.hasantbt.common.view.EventViewHolder

interface EventScheduleViewAdapter<A : EventViewHolder, B : Event> {
    fun onCreateScheduleViewHolder(parent: ViewGroup): A
    fun onBindScheduleViewHolder(event: B, viewHolder: A)
}
