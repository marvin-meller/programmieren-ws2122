# Programmieren WS 21/22

## Setup

Zuerst müsst ihr das Projekt klonen:

```shell
git clone https://github.com/marvin-meller/programmieren-ws2122.git
```

Öffnet das Projekt dann entweder mit Eclipse oder IntelliJ.

Während des Semesters wird das Repository erweitert.
Neuerungen könnt ihr mit `git pull` auf euer Gerät kopieren.
Ändert ausschließlich Code in den vorgegebenen Dateien, ansonsten gibt es Konflikte, wenn ihr `git pull` ausführt.
Notfalls könnt ihr das Repository immer neu klonen, eigenen Code müsst ihr dann gegebenenfalls von Hand kopieren.

## Tutorium 2

1. Öffnet die Klasse edu.kit.informatik.tutorium2.Main in der IDE eurer Wahl.
2. Führt die main-Methode aus. "Hello, world!" sollte in der Konsole ausgegeben werden.
3. Bearbeitet die Folgenden beiden Aufgaben in beliebiger Reihenfolge:
   - Variablen und Kontrollfluss
     - Vervollständigt die Methoden in der main-Methode.
   - Objektorientierung
     - Vervollständigt die beiden Klassen Int2, RectCenterSize und RectFromTo.
     
## Cheatsheet

### Primitive Datentypen

Verwendet `int` für Ganzzahlen, `double` für Kommazahlen.

| Datentyp | Größe | Beispiel |
| --- | --- | --- |
| `boolean` | 1 bit | `false`, `true` |
| `byte` | 8 bit | ..., `-1`, `0`, `1`, ... |
| `short` | 16 bit | ..., `-1`, `0`, `1`, ... |
| `int` | 32 bit | ..., `-1`, `0`, `1`, ... |
| `long` | 64 bit | ..., `-1`, `0`, `1`, ... |
| `float` | 32 bit | `3.14f` |
| `double` | 64 bit | `3.14` |
| `char` | 32 bit | `A`, `a`, `0`, `\n`, ... |

### Sichtbarkeiten

Sichtbarkeiten kontrollieren, von wo aus auf Klassen, Konsturktoren, Attribute und Methoden zugegriffen werden darf.

| Sichtbarkeit | Selbe Klasse | Erbende Klassen | Klassen im selben Paket | Überall
| --- | --- | --- | --- | --- |
| `private` | x | | | |
| `protected` | x | x | | |
| (keine) | x | x | x | |
| `public` | x | x | x | x |

### Operatoren

| Operator | Beispiel | Beschreibung |
| --- | --- | --- |
| Post increment | `i++` | Erhöhe `i` um eins und gib den neuen Wert zurück. |
| Pre increment | `++i` | Erhöhe `i` um eins und gib den alten Wert zurück. |
| Operator assignment | `i += 1` | Erhöhe `i` um `1`. |
