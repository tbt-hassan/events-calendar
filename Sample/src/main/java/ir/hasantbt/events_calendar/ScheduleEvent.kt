package ir.hasantbt.events_calendar

import ir.hasantbt.common.models.Event
import org.threeten.bp.LocalDate

class ScheduleEvent(override val localDate: LocalDate) : Event(localDate)