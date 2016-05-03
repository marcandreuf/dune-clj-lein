(ns dune-clj-lein.core-test
  (:require [clojure.test :refer :all]
            [dune-clj-lein.core :refer :all]
            [meridian.clj-jts :as jts]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(jts/coordinate [1 2])

