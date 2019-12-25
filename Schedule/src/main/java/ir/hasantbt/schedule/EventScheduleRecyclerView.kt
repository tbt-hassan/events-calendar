package ir.hasantbt.schedule

import android.content.Context
import android.util.AttributeSet

import androidx.recyclerview.widget.RecyclerView

import ir.hasantbt.common.models.Event

import org.threeten.bp.LocalDate
import org.threeten.bp.YearMonth

class EventScheduleRecyclerView<T : Event> : RecyclerView {
    constructor(context: Context) : super(context)

    constructor(
        context: Context,
        attrs: AttributeSet
    ) : super(
        context,
        attrs
    ) {
        init(
            attrs,
            0
        )
    }

    constructor(
        context: Context,
        attrs: AttributeSet,
        defStyleAttr: Int
    ) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(
            attrs,
            defStyleAttr
        )
    }

    private fun init(attributeSet: AttributeSet, defStyleAttr: Int) {
        TODO("It is not Implemented yet")
    }

    /**
     * Scroll to a specific month on the calendar. This only
     * shows the view for the month without any animations.
     * For a smooth scrolling effect, use [smoothScrollToMonth]
     *
     * @param month The month that view will scroll to
     */
    fun scrollToMonth(month: YearMonth) {
        TODO("It is not Implemented yet")
    }

    /**
     * Scroll to a specific month on the calendar using a smooth scrolling animation.
     * Just like [scrollToMonth], but with a smooth scrolling animation.
     *
     * @param month The month that view will scroll to
     */
    fun smoothScrollToMonth(month: YearMonth) {
        TODO("It is not Implemented yet")
    }

    /**
     * Scroll to a specific [LocalDate]. This brings the date cell
     * view's top to the top of the ScheduleVew. No animation is performed.
     * For a smooth scrolling effect, use [smoothScrollToDate].
     *
     * @param date The date that view will scroll to
     */
    fun scrollToDate(date: LocalDate) {
        TODO("It is not Implemented yet")
    }

    /**
     * Scroll to a specific [LocalDate]. This brings the date cell
     * view's top to the top of the ScheduleVew..
     * Just like [scrollToDate], but with a smooth animation.
     *
     * @param date The date that view will scroll to
     */
    fun smoothScrollToDate(date: LocalDate) {
        TODO("It is not Implemented yet")
    }

    /**
     * Notify the Calendar to reload the cell for this [LocalDate]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with
     * the all [Event]s of the date that is provided.
     * To notify calendar about single event update, call [notifyEventChanged] function instead.
     *
     * @param date The date that its events are changed
     */
    fun notifyDateChanged(date: LocalDate) {
        TODO("It is not Implemented yet")
    }

    /**
     * Notify the Calendar to reload the cell for this [event]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with the [event]
     * that is provided.
     * To notify calendar about updating whole [LocalDate]'s [Event]s, call [notifyDateChanged]
     * function instead.
     *
     * @param event The event is changed
     */
    fun notifyEventChanged(event: T) {
        TODO("It is not Implemented yet")
    }

    /**
     * Notify the Calendar to load the cell for this [event]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with the [event]
     * that is provided.
     *
     * @param event The event is changed
     */
    fun notifyEventInserted(event: T) {
        TODO("It is not Implemented yet")
    }


    /**
     * Notify the Calendar to remove the cell for this [event]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with the [event]
     * that is provided.
     *
     * @param event The event is changed
     */
    fun notifyEventRemoved(event: T) {
        TODO("It is not Implemented yet")
    }

    /**
     * Notify the Calendar to reload all Events.
     * Essentially calls [EventScheduleViewAdapter.onBindScheduleViewHolder] on the adapter.
     */
    fun notifyCalendarChanged() {
        TODO("It is not Implemented yet")
    }

    /**
     * Find the first visible date on the Calendar.
     * This is the day at the top-left corner of the calendar.
     *
     * @return The first visible day or null if not found.
     */
    fun findFirstVisibleDate(): LocalDate? {
        TODO("It is not Implemented yet")
    }

    /**
     * Find the last visible date on the Calendar.
     * This is the day at the bottom-right corner of the calendar.
     *
     * @return The last visible date or null if not found.
     */
    fun findLastVisibleDate(): LocalDate? {
        TODO("It is not Implemented yet")
    }

    /**
     * Setup the EventScheduleView. You can call this at start to change the start and end months
     *
     * @param startMonth The first month on the Calendar.
     * @param endMonth The last month on the Calendar.
     */
    fun setup(startMonth: YearMonth, endMonth: YearMonth) {
        TODO("It is not Implemented yet")
    }

}