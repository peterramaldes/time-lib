(ns io.github.peterramaldes.time
  (:require [java-time.api :as t]))

(defn now
  "Returns the current datetime v0.0.4"
  []
  (t/instant))

(defn time-str
  "Return a string representation of a datetime in the local time zone."
  [instant]
  (t/format
    (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
    instant))
