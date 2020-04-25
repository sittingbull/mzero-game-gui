(ns claby.core-test
    (:require
     [cljs.test :refer-macros [deftest is testing]]
     [clojure.test.check]
     [clojure.test.check.properties]
     [cljs.spec.test.alpha :as st]
     [claby.game :as g]
     [claby.core :as c]))

(deftest get-html-for-state-t
  (testing "Correct specs"
    (is (= nil (-> (st/check `c/get-html-for-state)
                   first
                   st/abbrev-result
                   (#(if (:failure %) (:failure %) nil))))))
  
  (testing "Converts appropriately a board to reagent html"
    (is (= [:table
            [:tbody
             [:tr {:key "claby-0"}
              [:td.empty {:key "claby-0-0"}]
              [:td.empty {:key "claby-0-1"}]
              [:td.wall {:key "claby-0-2"}]]
             [:tr {:key "claby-1"}
              [:td.empty {:key "claby-1-0"}]
              [:td.fruit.player {:key "claby-1-1"}]
              [:td.empty {:key "claby-1-2"}]]
             [:tr {:key "claby-2"}
              [:td.empty {:key "claby-2-0"}]
              [:td.empty {:key "claby-2-1"}]
              [:td.empty {:key "claby-2-2"}]]]]
           (c/get-html-for-state
            {::g/game-board [[:empty :empty :wall]
                             [:empty :fruit :empty]
                             [:empty :empty :empty]]
             ::g/player-position [1 1]})))))
