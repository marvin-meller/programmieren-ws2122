package edu.kit.informatik.tutorium2;

// Je Datei eine gleichnamige öffentliche Klasse.
public class Main {
    // Die main-Methode ist der Startpunkt des Programms.
    // Statische Methoden können ausgeführt werden, ohne erst ein Objekt der Klasse zu erstellen.
    public static void main(final String[] args) {
        System.out.println("Sum from 10 to 14: " + sumFromTo(10, 14));
        System.out.println();

        System.out.println("First n squares:");
        printSquares(10);
        System.out.println();

        System.out.println("Primes from 0 to 100:");
        printPrimes(0, 100);
        System.out.println();
    }

    // Ausführbare Methode mit zwei Parametern vom Typ int (Ganzzahl) und Rückgabewert vom Typ int.
    public static int sumFromTo(final int from, final int to) {
        // Variable sum als int deklarieren und mit 0 initialisieren.
        // Der Name sum ist zwischen den umschließenden geschweiften Klammern (z. 21-36) verfügbar.
        int sum = 0;

        // Variable i als int deklarieren und mit parameter from initialisieren.
        // Den folgenden Block ausführen, solange i kleiner gleich parameter to ist.
        // Nach jeder Ausführung wird i um eins erhöht.
        for (int i = from; i <= to; i++) {
            // Variable sum um i erhöhen.
            sum += i;
        }

        // Variable sum zurückgeben.
        return sum;
    }

    public static void printSquares(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i * i);
        }
    }

    // Teilen von Ganzzahlen verhält sich wie Teilen mit Rest:
    // Sei x = ay + b oder äquivalent a = (x - b) / y.
    // a = x / y (gegen 0 gerundet)
    // b = x % y (kann auch negativ sein)
    public static boolean divides(final int divisor, final int dividend) {
        // Vergleichen mit `a == b` oder `a.equals(b)`.
        // = ist ausschließlich für Zuweisungen.
        return dividend % divisor == 0;
    }

    public static boolean isPrime(final int n) {
        if (n < 2) {
            // Return beendet die Ausführung vorzeitig.
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (divides(i, n)) {
                // Auch in Schleifen möglich.
                return false;
            }
        }

        return true;
    }

    public static void printPrimes(final int from, final int to) {
        // Patentierter Algorithmus:
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
