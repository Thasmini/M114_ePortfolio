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

### 1.1.1 Zahlensysteme
- Begriffe: Zehner, Binär/Dual, Oktal, Hexadecimal


  1. Binärsystem/Dualsystem: (Basis 2) <br> (Ziffern 0 und 1)  Es wird oft in der Informatik und Elektronik verwendet, da digitale Geräte Informationen in Form von Nullen und Einsen verarbeiten.

  2. Achtersystem/Oktal: (Basis 8) <br> (Ziffern von 0 bis 7)Oktalzahlen werden in einigen speziellen Anwendungen verwendet, wie zum Beispiel der Dateiberechtigung unter Unix-basierten Betriebssystemen.
   
  3. Zehnersystem/Dezimalsystem: (Basis 10) <br> (Ziffern von 0 bis 9.) 
   
  4. sechzehnersystem Hexadezimal: (Basis 16) <br> (Ziffern von 0 bis 9 sowie die Buchstaben A bis F) Hexadezimale Zahlen werden in der Informatik häufig verwendet, um binäre Zahlen kompakt darzustellen und zu manipulieren. 


## 1.2 Arbeitsaufträge
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