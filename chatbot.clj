(ns chatbot (:require [clojure.string :as str]))

(defn Eliza-Bot []
  (println "Hello, I am your Park Chatbot!")
  (println "May I know your good name please?")
  (flush)
  (def name (read-line))
  (println "Hello",name,", How can I help you?")

  (def counter (atom 1))
  (while (= @counter 1)
    (do
      (def input (read-line))
      (def process-input (str/lower-case input))
      (def subpart (str/split process-input #"\s+"))
      (doseq [v subpart] (if (or (= v "hours") (= v "time") (= v "period") (= v "duration"))  (println "Open Throughout The Year"))
                         (if (or (= v "playground") (= v "playspace")) (println "Yes, We do have a playground in the park"))
                         (if (or (= v "refreshments") (= v "snacks")) (println "Yes, You can have refreshments served in the park"))
                         (if (= v "food") (println "No, We don't allow food to be brought in the park"))
                         (if (or (= v "dog") (= v "dogs"))(println "Yes, Dogs are allowed in the park"))
                         (if (= v "restaurants")(println "Yes, We have restaurants to eat food in the park"))
                         (if (or (= v "biking")(= v "bike"))(println "Yes, Biking can be done in the park"))
                         (if (or (= v "skating")(= v "skate"))(println "Yes, Skating can be done in the park"))
                         (if (or (= v "toilet")(= v "washroom")(= v "loo"))  (println "Yes, Skating can be done in the park"))
                         (if (or (= v "entertainment")(= v "attractions"))  (println "We have zoo, botanical gardens, natural attractions, planetarium, exhibition grounds in the park"))
                         )
      (println "You can continue asking other queries or simply type '0' to exit ") (flush) (def cnt (read)) (if (= cnt 0)(swap! counter dec))
      )
    )
  (println "OK Bye, Have a nice day")
  )

;(def counter (atom "yes"))
;(println (reset! counter "no"))








