package chapters.ch03

/**
  * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
  * that are in America. Strip off the "America/" prefix and sort the result.
  */
object Ex09 {
  println((for (each <- java.util.TimeZone.getAvailableIDs if each.contains("America")) yield each.split('/')(1)).sorted)
}
