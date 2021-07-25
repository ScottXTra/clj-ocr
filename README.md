# clj-ocr

A Clojure wrapper for Tesseract OCR

## Usage
Before using you must download train data for the language that you would like to preform OCR on.
A function has been included to simplify this.
In the clj-ocr.utils namespace, simply call: 
```clojure
(get-lang-data "<ISO 639-3 standard language code>")
```

Example for English:
```clojure
(get-lang-data "eng")
```
Example for German:
```clojure
(get-lang-data "deu")
```

Codes can be looked up [here](https://iso639-3.sil.org/code_tables/639/data)
not every language code will work. It pulls from [here](https://github.com/tesseract-ocr/tessdata).

To run OCR on an image, in clj-ocr.core simply call: 
```clojure
(do-ocr 
    (ImageIO/read (clojure.java.io/file "<filename>")) 
    (set-language "eng"))
```
Example:
```clojure
(do-ocr 
    (ImageIO/read (clojure.java.io/file "pic.png")) 
    (set-language "eng"))
```
## Implementation 
This project is not meant to wrap the entire Tess4j wapper. It is meant to simplify the use of the most commonly used parts of Tesseract OCR.

Currently Implemented:
- doOCR
- setLanguage

## Tess4J Docs
http://tess4j.sourceforge.net/docs/docs-0.4/net/sourceforge/tess4j/Tesseract.html

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
