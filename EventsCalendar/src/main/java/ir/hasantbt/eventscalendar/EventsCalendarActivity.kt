package ir.hasantbt.eventscalendar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import ir.hasantbt.common.models.Event
import ir.hasantbt.common.view.EventViewHolder
import ir.hasantbt.schedule.EventScheduleViewAdapter
import org.threeten.bp.LocalDate
import java.time.YearMonth

abstract class EventsCalendarActivity<A : EventViewHolder, B : Event> : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var eventScheduleViewAdapter: EventScheduleViewAdapter<A, B>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_calendar)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action") {
                    Toast.makeText(
                        view.context,
                        "Hello",
                        Toast.LENGTH_SHORT
                    ).show()
                }.show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_schedule,
                R.id.nav_monthly
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    /**
     * Call this method as soon as your activity got created to prepare views
     *
     * @param [startMonth] The first month on the Calendar.
     * @param [endMonth] The last month on the Calendar.
     * @param [events] List of events that will be shown in the Calendar
     * @param [eventScheduleViewAdapter] Adapter for adapting Events to views for Schedule view
     */
    fun setup(
        startMonth: YearMonth,
        endMonth: YearMonth,
        events: List<B>,
        eventScheduleViewAdapter: EventScheduleViewAdapter<A, B>
    ) {
        TODO("NOT Implemented")
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
     * TODO: 1/4/20: add monthly related docs
     * To notify calendar about single event update, call [notifyEventChanged] function instead.
     *
     * @param date The date that its events are changed
     */
    fun notifyDateChanged(date: LocalDate) {
        TODO("It is not Implemented yet")
    }

    /**
     * Notify the Calendar to reload the cell for this [Event]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with the [Event]
     * that is provided.
     * TODO: 1/4/20: add monthly related docs
     * To notify calendar about updating whole [LocalDate]'s [Event]s, call [notifyDateChanged]
     * function instead.
     *
     * @param event The event is changed
     */
    fun notifyEventChanged(event: B) {
        TODO("It is not Implemented yet")
    }


    /**
     * Notify the Calendar to load the cell for this [event]
     * This causes [EventScheduleViewAdapter.onBindScheduleViewHolder] to be called with the [event]
     * that is provided.
     *
     * @param event The event is changed
     */
    fun notifyEventInserted(event: B) {
        TODO("It is not Implemented yet")
    }


    /**
     * Notify the Calendar to remove the cell for this [event]
     *
     * @param event The event is changed
     */
    fun notifyEventRemoved(event: B) {
        TODO("It is not Implemented yet")
    }


    /**
     * Notify the Calendar to reload all Events.
     * Essentially calls [EventScheduleViewAdapter.onBindScheduleViewHolder] on the adapter.
     * TODO: 1/4/20: add monthly related docs
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
}
