# clj-ocr

A Clojure wrapper for Tesseract OCR

## Usage
Before using you must download train data for the language that you would like to preform OCR on.
A function has been included to simplify this.
Simply run 
> (get-lang-data "<ISO 639-3 standard language code>") <

Example:
> (get-lang-data "eng")

for English or
> (get-lang-data "deu")

for German in the clj-ocr.utils namespace to download.
Codes can be looked up [here](https://iso639-3.sil.org/code_tables/639/data)
not every language code will work. It pulls from [here](https://github.com/tesseract-ocr/tessdata)

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
