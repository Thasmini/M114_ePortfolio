# M114_ePortfolio

Links: <br>
•  https://gitlab.com/ch-tbz-it/Stud/m114 (Offizieller Skript) <br>
•  https://www.juergarnold.ch/digitaltechnik.html <br>
•  https://www.juergarnold.ch/codesysteme.html <br>
•  https://www.juergarnold.ch/kompression.html <br>
•  https://www.juergarnold.ch/kryptografie.html

Inhalt
-----------
- Theoriezusammenfassung der einzelnen Kapitel
- Arbeitsaufträge, Lösungen zu den Aufgaben (Immer auch mir der Aufgabenstellung!)
- Unterrichtsreflexion, Lernjournal


# Tag 1 [16.05.2023]

## 1.1 Theorie
### 1.1.0 Begriffe
- Hex-Editor: Ein Hex-Editor ist ein spezielles Computerprogramm, mit dem Benutzer binäre Daten auf einer niedrigen Ebene anzeigen und bearbeiten können, indem sie den Inhalt einer Datei oder eines Speicherbereichs in Hexadezimaldarstellung betrachten und verändern.

### 1.1.1 Zahlensysteme, numerische Codes
    Lernziele: Bit/Byte; Massvorsätze k,M,G,T; Zahlensysteme BIN/HEX; 2er Komplement; Dataoverflow; Fliesskommazahl; Parallel; Seriell; Bustakt Hz

  1. Binärsystem/Dualsystem: (Basis 2) <br> (Ziffern 0 und 1)  Es wird oft in der Informatik und Elektronik verwendet, da digitale Geräte Informationen in Form von Nullen und Einsen verarbeiten.

  2. Achtersystem/Oktal: (Basis 8) <br> (Ziffern von 0 bis 7)Oktalzahlen werden in einigen speziellen Anwendungen verwendet, wie zum Beispiel der Dateiberechtigung unter Unix-basierten Betriebssystemen.
   
  3. Zehnersystem/Dezimalsystem: (Basis 10) <br> (Ziffern von 0 bis 9.) 
   
  4. sechzehnersystem Hexadezimal: (Basis 16) <br> (Ziffern von 0 bis 9 sowie die Buchstaben A bis F) Hexadezimale Zahlen werden in der Informatik häufig verwendet, um binäre Zahlen kompakt darzustellen und zu manipulieren. 


## 1.2 Arbeitsaufträge
URL: https://gitlab.com/ch-tbz-it/Stud/m114/-/tree/main/A.%20Daten%20codieren/A.1%20Zahlensysteme%2C%20numerische%20Codes

  ### 1.2.0 Begriffe
  Schach: Brettspiel für zwei Personen, die mit je sechzehn schwarzen bzw. weißen Schachfiguren
  ### 1.2.1 Schachbrett
  Wir mussten schätzen wie viel Reis auf dem letzten Feld eines Schachbretts liegen mussten, wenn auf dem ersten Feld ein Korn ist und auf dem Zweiten das Doppelte und so weiter. Um dies genauer zu berechnen haben wir das Peojekt mir Java programmiert. Das Resultat war im Minus bereich, weil der Datentyp zu klein für das Resultat war. Es kommt zu einem Dataoverflow. Das heisst, dass der Wert ausserhalb des Wertebereichs geht. 
  In einer anderen Programmiersprache wie C kann man einen unsigned Integer oder Long verwenden. <br>
    [Ablage: M114_ePortfolio\Schachbrett]
    ![Alt text](/Media/schachbrett.png)
    <br>

        Integer = 36bit, also 0..2^32 = 4,3 Mia 
        Long = 64bit
        Double = 64bit 
    <br>
    Lösung: Mit einem Double würde es gehen. Double sind Floatingpoint numbers. Im Gegensatz zu Long hat Double Genauigkeit. 
    ![Alt text](/Media/schachbrett_loesung.png)
    <br>
   
         Fliesskomma Format: --> +-.xxxxxxE+-yyy (E = Exponente) 

### 1.2.2 Zahlensysteme - Reloaded
Link: https://gitlab.com/ch-tbz-it/Stud/m114/-/raw/main/GITressourcen/Daten_codieren/ADD_1.jpg 

1. BIN-DEC-HEX-Zahlentabelle: 
   
BIN(MSB): "Binary Most Significant Bit"

BIN(LSB): "Binary Least Significant Bit"

  <table>
  <thead>
    <tr>
      <th>BIN(MSB)</th>
      <th>BIN</th>
      <th>BIN</th>
      <th>BIN(LSB)</th>
      <th>BEC</th>
      <th>HEX</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>2</td>
      <td>2</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>3</td>
      <td>3</td>
    </tr>
     <tr>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>0</td>
      <td>4</td>
      <td>4</td>
    </tr>
     <tr>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>1</td>
      <td>5</td>
      <td>5</td>
    </tr>
     <tr>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>6</td>
      <td>6</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>7</td>
      <td>7</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>8</td>
      <td>8</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>0</td>
      <td>1</td>
      <td>9</td>
      <td>9</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>10</td>
      <td>A</td>
    </tr>
   <tr>
      <td>1</td>
      <td>0</td>
      <td>1</td>
      <td>0</td>
      <td>11</td>
      <td>B<td>
    </tr>
    <tr>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>0</td>
      <td>12</td>
      <td>C</td>
    </tr>
    <tr>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>1</td>
      <td>13</td>
      <td>D</td>
    </tr>
    <tr>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>14</td>
      <td>E</td>
    </tr>
    <tr>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>15</td>
      <td>F</td>
    </tr>
  </tbody>
</table>
  2. 911 in Binär ohne Taschenrechner: <br>
    911 ÷ 2 = 455, Rest 1  <br>
    455 ÷ 2 = 227, Rest 1 <br>
    227 ÷ 2 = 113, Rest 1 <br>
    113 ÷ 2 = 56, Rest 0 <br>
    56 ÷ 2 = 28, Rest 0 <br>
    28 ÷ 2 = 14, Rest 0 <br>
    14 ÷ 2 = 7, Rest 0 <br>
    7 ÷ 2 = 3, Rest 1 <br>
    3 ÷ 2 = 1, Rest 1 <br>
    1 ÷ 2 = 0, Rest 1 <br>

3. 1011'0110 in Dezimal ohne Taschenrechner: <br>
   (1 * 128) + (0 * 64) + (1 * 32) + (1 * 16) + (0 * 8) + (1 * 4) + (1 * 2) + (0 * 1) = 182

4. 1110'0010'1010'0101 in Hexadezimalzahl ohne Taschenrechner:

    Gruppierung:
    1110 0010 1010 0101

    Konvertierung: <br>
    1110 = E (Hex) <br>
    0010 = 2 (Hex) <br>
    1010 = A (Hex) <br>
    0101 = 5 (Hex)

    1110'0010'1010'0101 (Binär) = E2A5 (Hexadezimal)

5. ALU (Arithmetic Logic Unit) <br>
```
   1101'1001 (A)
+  0111'0101 (B)
-----------------
  10101'1110
```
Rechnung:
1. Rechtes Bit (1. Bit): 1 + 1 = 0 (Summe) mit einem Carry von 1.
2. Zweites Bit: 0 + 0 + 1 (Carry) = 1 (Summe) ohne Carry.
3. Drittes Bit: 0 + 0 + 1 (Carry) = 1 (Summe) ohne Carry.
4. Viertes Bit: 1 + 1 + 0 (Carry) = 0 (Summe) mit einem Carry von 1.
5. Fünftes Bit: 1 + 0 + 1 (Carry) = 0 (Summe) mit einem Carry von 1.
6. Sechstes Bit: 0 + 1 + 0 (Carry) = 1 (Summe) ohne Carry.
7. Siebtes Bit: 1 + 1 + 1 (Carry) = 1 (Summe) mit einem Carry von 1.
8. Achtes Bit: 1 + 0 + 0 (Carry) = 1 (Summe) ohne Carry.

![Alt text](https://gitlab.com/ch-tbz-it/Stud/m114/-/raw/main/GITressourcen/Daten_codieren/ADD_1.jpg)

6. Network Traffic: 
Bitkombinatation in in OSI-Layer3:
1100 0000 . 1010 1000 . 0100 1100 . 1101 0011
repräsentiert eine IP-Adresse im IPv4-Format, das die Adressierung und das Routing von Datenpaketen im Netzwerk ermöglicht.

Die Bitkombination ist in vier Gruppen von jeweils 8 Bits (Oktetten) aufgeteilt, die durch Punkte voneinander getrennt sind. Jede Gruppe repräsentiert einen Wert zwischen 0 und 255 in dezimaler Darstellung. 

1100 0000 = 192
1010 1000 = 168
0100 1100 = 76
1101 0011 = 211

Die Bitkombination "1100 0000 . 1010 1000 . 0100 1100 . 1101 0011" entspricht also der IP-Adresse 192.168.76.211.

IP-Adresse: Geräte in einem Netzwerk eindeutig zu identifizieren. Die ersten beiden Oktette (192.168) identifizieren normalerweise das lokale Netzwerk, während die letzten beiden Oktette (76.211) ein spezifisches Gerät innerhalb des Netzwerks identifizieren.



## 1.3 Reflexion
Das Modul hat ganz einfach begonnen. Heute haben wir die Zahlensysteme angeschaut. Wir hatten das schn mal, aber nicht so vertieft. Ausserdem hat mir die Aufgabe mit dem Schach sehr gefallen, weil wir eine ganz einfache Java Programm schreiben durften. Leider konnte ich nicht alle Aufgaben fertig lösen. Es waren zu viele aufs Mal. Aber die aufgaben waren schon interessant und lehrreich. Dennoch hätte ich gerne mehr Zeit bekommen, um die Aufgaben zu erledigen.




# Tag 2 [23.05.2023]

## 2.1 Theorie
- Negative (ganze)Zahlen: (heisst Zahlen Bitweise negieren)
4 bit 0010 = 2  

2er Komplement: (Wie man Zahl negativ macht)
1. Zahl negieren ; 1101
2. +1 addieren ; 1110 (-2) //1110 positive wäre 14, wenn man mit signed integer arbeitet, so kann man die negative Zahl verwenden

- Speicher (Arbeitspeicher): 
  ![Alt text](/Media/Arbeitsspeicher.png)

- Codierung: hexed.it
- ASCII
- UNICode
### 2.1.0 Begriffe
- Wireshark: weit verbreitetes Open-Source-Netzwerkanalysewerkzeug und ermöglicht Benutzern das Erfassen und Überwachen des Netzwerkverkehrs in Echtzeit. 
  
- OSI-Layer2 (Data Link Layer): st und  der zweite Layer im OSI-Referenzmodell für Netzwerkkommunikation liegt direkt über dem Physical Layer und ist für die Übertragung von Daten zwischen direkt verbundenen Geräten in einem lokalen Netzwerk verantwortlich

### 2.1.1 Alphanumerische Codes ASCII und Unicode




## 2.2 Arbeitsaufträge
Drei Textdateien: Textsample1, Textsample2 und Textsample3 unter AlphanumerischeCodes
Eine der Dateien ist in ASCII codiert, die andere in UTF-8 und die dritte in UTF-16.

- Welche der Dateien ist nun ASCII-codiert, welche UTF-8 und welche UTF-16 BE-BOM?
Textsample1 = ASCII-codiert
Textsample2 = UTF-8
Textsample3 = UTF-16 BE-BOM

- Alle drei Dateien enthalten denselben Text. Aus wie vielen Zeichen besteht dieser?
64 Zeichen

- Was sind die jeweiligen Dateigrössen? (Beachten sie, dass unter Grösse auf Datenträger jeweils 0 Bytes angegeben wird. Dies darum, weil beim Windows-Dateisystem NTFS kleine Dateien direkt in die MFT (Master File Table) geschrieben werden.) Wie erklären sie sich die Unterschiede?
Textsample1 = 68 Bytes
Textsample2 = 71 Bytes
Textsample3 = 138 Bytes

1. ASCII-Codierung:
   ASCII ist eine 7-Bit-Codierung, die nur die ersten 128 Zeichen des Unicode-Zeichensatzes abdeckt. Ein ASCII-Textfile besteht aus einer Sequenz von 8-Bit-Bytes, wobei jedes Byte nur die unteren 7 Bits für das Zeichen verwendet und das höchste Bit auf Null gesetzt wird.

2. UTF-8-Codierung:
   UTF-8 ist eine variable Längen-Codierung für Unicode-Zeichen. Es verwendet ein Byte, um ASCII-Zeichen darzustellen, und verwendet mehrere Bytes für nicht-ASCII-Zeichen.

3. UTF-16BE-BOM-Codierung:
   UTF-16 ist eine Codierung, bei der jedes Zeichen standardmässig 16 Bits (2 Bytes) belegt. UTF-16BE steht für Big-Endian und UTF-16 BOM beinhaltet das sogenannte Byte Order Mark, das am Anfang der Datei platziert wird, um die Byte-Reihenfolge anzugeben. Die Dateigröße einer UTF-16BE-BOM-codierten Datei ist generell größer als bei ASCII und UTF-8, da jedes Zeichen mehr Speicherplatz benötigt. 

- Bei den weiteren Fragen interessieren uns nur noch die ASCII- und die UTF-8-Datei: Bekanntlich ist UTF-8 in den ersten 128 Zeichen deckungsgleich mit ASCII. Untersuchen sie nun die beiden HEX-Dumps und geben sie an, welche Zeichen unterschiedlich codiert sind. Ein kleiner Tipp: Es sind deren zwei.
//TODO

- Was bedeuten die beiden Ausdrücke, denen wir z.B. bei UTF-16 begegnen: Big-Endian (BE), Little-Endian (LE)?

Big-Endian (BE): das höchstwertige (signifikanteste) Byte zuerst gespeichert, gefolgt von den niedrigerwertigen (weniger signifikanten) Bytes.

Little-Endian (LE): das niederwertigste (weniger signifikante) Byte zuerst gespeichert, gefolgt von den höherwertigen (signifikanteren) Bytes. 

-
### 2.2.2 Zahlensysteme - Reloaded
... 
7. OSI-Layer2 mit Wireshark untersuchen:
   Bitkombination: 1011 1110 - 1000 0011 -  1000 0101 - 1101 0101 - 1110 0100 - 1111 1110

1011 1110 -> BE
1000 0011 -> 83
1000 0101 -> 85
1101 0101 -> D5
1110 0100 -> E4
1111 1110 -> FE

Also erhalten wir die MAC-Adresse: BE:83:85:D5:E4:FE


## 2.3 Reflexion
Heute haben wir viele Inputs von unserem Lehrer erhalten. Wir gingen tief in einige Themen ein und mussten auch etwas Mathematik mit ihm machen. Fand ich noch recht lustig. Zur Beginn hatte ich Probleme beim Lösen der Aufgabe, weil ich viel zu lange für die jeweiligen Aufgabe brauchte. Aber heute war ein lehrreicher Tag. Wir haben einiges dazu gelernt.




# Tag 3 [30.05.2023]

## 3.1 Theorie
- Farbe:
    - Elektromagnetische Wellen werden mit der Wellenlänge oder der Frequenz angegeben.
    - Licht besteht aus elektromagnetischen Wellen.
    - Nur ein Teil der Frequenzen des Lichts sind für das menschliche Auge sichtbar.
- Farbmodelle 
- Bild auf dem Laptop ist ein additives FArbsystem RGB (Akhv)
- Bild auf dem Papier isz ein subtraktives Farbsystem(Myk passive)

VLC (Variable Length Coding)
    Link: https://gitlab.com/ch-tbz-it/Stud/m114/-/tree/main/B.%20Daten%20komprimieren/B.1%20Verlustlose%20Komprimierung

  - Morsecode
    Der Morsecode wurde im Jahr 1838 von Samuel Morse und Alfred Lewis Vail erfunden. Er dient als Kommunikationsverfahren, um Buchstaben, Zahlen und andere Zeichen in Seefunk und Telegrafie elektrisch, optisch oder akustisch zu übermitteln. Der Morsecode kann entweder als Codetabelle oder als binärer Baum dargestellt werden.

    ![Alt text](/Media/morsecode.jpg)

    Ein Nachteil des Morsecodes besteht darin, dass es ohne spezielles Trennzeichen oder Delimiter (z. B. eine kurze Pause) oft zu Missverständnissen kommen kann, da es nicht eindeutig ist, wo ein Zeichen beginnt und endet. Dieses Problem tritt bei der Huffman-Kodierung nicht auf, da dort die Regel gilt, dass kein Codewort den Anfang eines anderen Codewortes darstellen darf.

    Die gegebene Codesequenz "..-....-" kann verschiedene Bedeutungen haben, wie zum Beispiel "IDEA" (I=.. D=-.. E=. A=-.), "USA" (U=..- S=... A=-.) oder "UHT" (U=..- H=.... T=-). Es könnte aber auch für einen Fussballverein "FV" stehen (F=..-. V=...-). Daher ist der Morsecode nicht eindeutig und kann zu Verwirrungen führen.


  - Der Huffmancode
    Der Huffman-Code ist ein Verfahren zur verlustlosen Komprimierung von Daten. Er wurde von David A. Huffman im Jahr 1952 entwickelt. Der Code basiert auf einer Variante des binären Baums und verwendet eine unterschiedliche Anzahl von Bits, um verschiedene Zeichen darzustellen. Dabei werden häufig auftretende Zeichen mit weniger Bits codiert, während weniger häufig auftretende Zeichen mit mehr Bits codiert werden.

    ![Alt text](/Media/Huffmancode.jpg)

    Der Vorteil des Huffman-Codes besteht darin, dass er effizient ist und eine gute Kompressionsrate bietet. Durch die Verwendung eines speziellen Algorithmus kann der Huffman-Code so gestaltet werden, dass kein Codewort den Anfang eines anderen Codewortes darstellt. Dadurch wird eine eindeutige Entschlüsselung gewährleistet, ohne dass Trennzeichen oder Delimiter benötigt werden.


### 3.1.0 Begriffe
- CMYK
- Vectorielle Grafiken
- DPI und PPI im Multimediabereich

### 3.1.1 Farbcodierung RGB/ CMYK
#FF0000 entspricht der Farbe Rot.
#00FF00 entspricht der Farbe Grün.
#0000FF entspricht der Farbe Blau.
#FFFF00 entspricht der Farbe Gelb.
#00FFFF entspricht der Farbe Cyan.
#FF00FF entspricht der Farbe Magenta.
#000000 entspricht der Farbe Schwarz.
#FFFFFF entspricht der Farbe Weiß.
#00BC00 entspricht der Farbe Dunkelgrün.

C:0%, M:100%, Y:100%, K:0% entspricht der Farbe Magenta.
C:100%, M:0%, Y:100%, K:0% entspricht der Farbe Gelb.
C:100%, M:100%, Y:0%, K:0% entspricht der Farbe Cyan.
C:0%, M:0%, Y:100%, K:0% entspricht der Farbe Blau.
C:100%, M:0%, Y:0%, K:0% entspricht der Farbe Rot.
C:0%, M:100%, Y:0%, K:0% entspricht der Farbe Grün.
C:100%, M:100%, Y:100%, K:0% entspricht der Farbe Weiß.
C:0%, M:0%, Y:0%, K:100% entspricht der Farbe Schwarz.
C:0%, M:0%, Y:0%, K:0% entspricht der Farbe Transparent.
C:0%, M:46%, Y:38%, K:22% entspricht der Farbe Dunkelbraun.

RGB 255/255/255 in YCbCr ergibt: Y: 1,Cb: 0,Cr: 0
RGB 0/0/0 in YCbCr ergibt:Y: 0,Cb: 0.Cr: 0
Y:1, Cb:0, Cr:0 entspricht der Farbe Weiß.
Y:0, Cb:0, Cr:0 entspricht der Farbe Schwarz.
Y:0, Cb:1, Cr:0 entspricht der Farbe Blau.
Y:0, Cb:-1, Cr:0 entspricht der Farbe Gelb.
Y:0, Cb:0, Cr:1 entspricht der Farbe Rot.
Y:0, Cb:0, Cr:-1 entspricht der Farbe Cyan.
Y:0.3, Cb:0.5, Cr:-0.17 entspricht einer bestimmten Farbe im YCbCr-Farbraum. 



## 3.2 Arbeitsaufträge

### Matterhorn Bildkomprimierung
Originalbild:
    ![Alt text](/Media/matterhorn.jpg)
Komprimiertes Bild:
    ![Alt text](/Media/matterhorn_komprimiert.jpg)

## 3.3 Reflexion
Diese Unterrichtslektion war etwas streysig, weil ich mich nicht konzentrieren konnte. Das lag daran, dass wir die Prüfung in der 4 Lektion schreiben mussten. Ich wurde nervös.Ansonsten haben wir wieder mal einiges neu dazu gelernt.



# Tag 4 [06.06.2023]

## 4.1 Theorie
## RLC (Run Length Coding) bzw. RLE (Run Length Encoding)
Es geht um Datenkomprimierung. Sie basiert auf der Idee, dass aufeinanderfolgende gleiche Datenwerte durch einen einzigen Wert und seine Länge dargestellt werden können.

Beispiel: [AAAABBBCCDAA] Bei der Anwendung von RLC wird diese in folgende Darstellung umgewandelt: (A, 4), (B, 3), (C, 2), (D, 1), (A, 2).

Die RLC-Kodierung ist besonders effektiv, wenn die Eingabesequenz viele aufeinanderfolgende gleiche Zeichen enthält.

## Lexikalisches Verfahren LZW (Lempel-Ziv-Welch-Algorithmus)
Der LZW-Algorithmus basiert auf der Idee, wiederholende Muster in der Eingabesequenz zu erkennen und sie durch kürzere Codewörter zu ersetzen.

Selbstverständlich! Hier ist ein Beispiel, wie der LZW-Algorithmus auf eine Eingabesequenz angewendet werden könnte:

Eingabesequenz: "ABABABAABABA"

Schritt 1: Initialisierung des Wörterbuchs mit einzelnen Zeichen des Eingabealphabets:
- Wörterbuch: {'A': 0, 'B': 1, ...}

Schritt 2: Lesen des ersten Zeichens aus der Eingabesequenz:
- Aktuelles Muster: 'A'

Schritt 3: Schleife zur Verarbeitung der restlichen Eingabesequenz:

- Lesen des nächsten Zeichens: 'B'
- Hinzufügen des Zeichens zum aktuellen Muster: 'AB'
- Überprüfen, ob 'AB' im Wörterbuch vorhanden ist:
  - Nicht vorhanden, also füge ('AB', 2) zum Wörterbuch hinzu.
  - Gib das Codewort des vorherigen Musters ('A') aus: 0
  - Setze das aktuelle Muster auf 'B'.

- Lesen des nächsten Zeichens: 'A'
- Hinzufügen des Zeichens zum aktuellen Muster: 'BA'
- Überprüfen, ob 'BA' im Wörterbuch vorhanden ist:
  - Nicht vorhanden, also füge ('BA', 3) zum Wörterbuch hinzu.
  - Gib das Codewort des vorherigen Musters ('B') aus: 1
  - Setze das aktuelle Muster auf 'A'.

- Lesen des nächsten Zeichens: 'B'
- Hinzufügen des Zeichens zum aktuellen Muster: 'AB'
- Überprüfen, ob 'AB' im Wörterbuch vorhanden ist:
  - Vorhanden mit dem Codewort 2.
  - Setze das aktuelle Muster auf 'ABA'.

- Lesen des nächsten Zeichens: 'B'
- Hinzufügen des Zeichens zum aktuellen Muster: 'BAB'
- Überprüfen, ob 'BAB' im Wörterbuch vorhanden ist:
  - Nicht vorhanden, also füge ('BAB', 4) zum Wörterbuch hinzu.
  - Gib das Codewort des vorherigen Musters ('ABA') aus: 2
  - Setze das aktuelle Muster auf 'B'.

- Lesen des nächsten Zeichens: 'A'
- Hinzufügen des Zeichens zum aktuellen Muster: 'BA'
- Überprüfen, ob 'BA' im Wörterbuch vorhanden ist:
  - Vorhanden mit dem Codewort 3.
  - Setze das aktuelle Muster auf 'ABA'.

- Lesen des letzten Zeichens: 'B'
- Hinzufügen des Zeichens zum aktuellen Muster: 'BAB'
- Überprüfen, ob 'BAB' im Wörterbuch vorhanden ist:
  - Vorhanden mit dem Codewort 4.
  - Gib das Codewort des vorherigen Musters ('ABA') aus: 2

Schritt 4: Gib das Codewort des aktuellen Musters ('BAB') aus: 4

Die Ausgabe des LZW-Algorithmus für die Eingabesequenz "ABABABAABABA" wäre: 0, 1, 2, 3, 4.

### 4.1.0 Begriffe
- Komprimierung (Verlustlos)
    - Huffman: Binarytree
    - RLC/E
    - ZLW
    - BûrowsWheeler

- Komprimierung (Verlustbehaftet
    - Multimedia
    - JPG DCT
    - weiter Verfahren)

### 4.1.1 
- Huffman-Algorithmus:
  Code-Tabelle
M-2: 0
I-2: 10
U-1: 110
L-1: 1110
T-1: 11110
E-1: 111110
D-1: 1111110
A-1: 1111111

    ![Alt text](/Media/huffman_aufgabe.png)

Häufigkeit der Buchstabe: M-2, U-1, L-1, T-1, I-2, E-1, D-1, A-1

Wort = Multimedia

- RLC/E-Verfahren: 
  RL-Code: 010100011110010010010010010010010010010110010110010010010010010010010010001

Grafik:
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B
   W  B  W  B  W  B  W  B

w = weiss
b = black
QUADRAT

- LZW-Verfahren: 
 a)  Wort «ANANAS» 

 b) «ERDBE<256>KL<260>» zu dekomprimieren.

 - BWT (Burrows-Wheeler-Transformation)

## 4.2 Arbeitsaufträge




## 5.3 Reflexion

# Tag 5 [13.06.2023]

## 5.1 Theorie
## RLC (Run Length Coding) bzw. RLE (Run Length Encoding)


## Lexikalisches Verfahren LZW (Lempel-Ziv-Welch-Algorithmus)

### 5.1.0 Begriffe


### 5.1.1 

## 5.2 Arbeitsaufträge


## 5.3 Reflexion


## 5.3 Reflexion



# Tag 6 [20.06.2023]
https://www.cryptool.org/de/cto/
Wir haben Animationen von den Verfahren angeschaut.
## 6.1 Theorie



### 6.1.0 Begriffe
- Vigenère-Chiffre: ist eine polyalphabetische Substitution, die auf einem Schlüsselwort basiert. 
Sie verwendet mehrere Caesar-Verschiebungen, um Nachrichten zu verschlüsseln und zu entschlüsseln.

- XOR (Exclusive OR) ist ein logischer Operator, der in der Kryptographie und Signalverarbeitung verwendet wird. Er führt eine bitweise Operation auf zwei Eingabebits aus und gibt ein Ausgabebit zurück. XOR wird für Verschlüsselung, Fehlererkennung und digitale Schaltungen eingesetzt.



### 6.1.1 

## 6.2 Arbeitsaufträge


## 6.3 Reflexion



# Tag 7 [27.06.2023]

## 7.1 Theorie
  - Schlüsseltausch: Beim symmetrischen Verschlüsselungsverfahren wird für Ver- und Entschlüsselung derselbe Schlüssel verwendet. Der sichere Schlüsseltausch zwischen den Kommunikationspartnern kann durch den Einsatz von asymmetrischer Verschlüsselung oder physischen Treffen erfolgen, um den Schlüssel persönlich auszutauschen. Der Schlüsseltausch ist wichtig, um die Vertraulichkeit und Integrität der verschlüsselten Daten zu gewährleisten.
  Nachteil 1 = Um so mehr Teilnehmer desto mehr Schlüssel. Nicht linear, sondern quadratisch. 
  Nachteil 2 = Schlüsselaustausch, also soll man private- und öffentliche Schlüssel haben.

  Anz. Schlüssel: Teilnmehmer mal (Teilnehmer - 1)/ 2
  Formel binomialkoeffizient:  https://d1g9li960vagp7.cloudfront.net/wp-content/uploads/2019/10/Binomialkoeffizient-Formel-neu-1024x576.jpg

  z.B. AP21b hat 22 Lehrlinge. 22 mal 21 durch 2 = 231
                500 Menschen = 500 mal 499 durch 2 = 124'750

# Hybride Verfahren


### 7.1.0 Begriffe
 

### 7.1.1 

## 7.2 Arbeitsaufträge
# Symmetrisch
1. Diffie-Hellman: ![Alt text](/Media/Diffie-Hellman.png)
2. RSA-Verschlüsselung:  ![Alt text](/Media/schlusselpaare.png) ![Alt text](/Media/rsa-entschlusselung.png)
3. RSA-Demo: ![Alt text](/Media/rsa-demo.png)
4. RSA-AES: ![Alt text](/Media/hybrid.png)

# Hashwert
![Alt text](hashdemo.png)
## 7.3 Reflexion
Diese Woche haben wir über Schlüssel geredet. Damit ist private und public key gemeint. 