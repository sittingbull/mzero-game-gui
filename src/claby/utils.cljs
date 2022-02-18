(ns claby.utils)

(defonce jq (js* "$"))
(defn se
  "Show emoji `code`"
  [code]
  [:span.emoji {:data (str code)
                :dangerouslySetInnerHTML {:__html (str "&#" code ";")}}])

(defn player-type [player] (if (= player "human") "human" "ai"))

(defn load-local [query]
  (js/window.open (str "http://localhost:9500" (or query "")) "_self"))

