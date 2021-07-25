(defproject org.clojars.scottxtra/clj-ocr "0.1.0-SNAPSHOT"
  :description "Clojure wrapper for Tesseract OCR"
  :url "https://github.com/ScottXTra/clj-ocr"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [net.sourceforge.tess4j/tess4j "4.1.0"]
                 [clj-http "3.12.3"]]
  :repl-options {:init-ns clj-ocr.core})
