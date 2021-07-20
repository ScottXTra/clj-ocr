(ns clj-ocr.utils
  (:require [clj-http.client :as client])
  )

(def data-url
  "https://github.com/tesseract-ocr/tessdata/blob/master/")

(def langs
  ["ara" "asm" "eng" "afr"])

(defn get-lang-data 
  [l]
(clojure.java.io/copy
 (:body (client/get (str "https://github.com/tesseract-ocr/tessdata/blob/master/" l ".traineddata?raw=true")))
 (java.io.File. (str l ".traineddata"))) 
  1)

(defn get-all-langs
  []
  (pmap get-lang-data langs))