package ir.hasantbt.common.models

import org.threeten.bp.LocalDate

abstract class Event(
    open val localDate: LocalDate
)