(ns clj-ocr.utils
  (:require [clj-http.client :as client]
            [clojure.java.io :as io])
  )

(def data-url
  "https://github.com/tesseract-ocr/tessdata/blob/master/")

(def langs
  ["ara" "asm" "eng" "afr"])

 (defn get-lang-data [l]
   (with-open [in (io/input-stream (str "https://github.com/tesseract-ocr/tessdata/blob/master/" l ".traineddata?raw=true"))
               out (io/output-stream (str l ".traineddata"))]
     (io/copy in out))
   1)

(defn get-web-image [url filename]
  (with-open [in (io/input-stream url)
              out (io/output-stream filename)]
    (io/copy in out)))

(defn get-all-langs
  []
  (pmap get-lang-data langs))

