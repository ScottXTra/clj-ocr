(ns clj-ocr.core
  (:require clj-ocr.utils)
  (:import
   [net.sourceforge.tess4j  ITesseract Tesseract]
   [javax.imageio ImageIO])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def instance
  (new Tesseract))
;; param 1 -> buffered image ( to read a file from disk to buffered image is (ImageIO/read (clojure.java.io/file "pic.png")) )
;; returns -> text from the image 
(defn ocr [bi]
  (.doOCR instance bi))



