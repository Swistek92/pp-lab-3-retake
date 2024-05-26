#!/bin/bash

# Skrypt do kompilacji Main.java oraz wszystkich plików .java w katalogu medicine/

# Ścieżka do katalogu medicine
MEDICINE_DIR="medicine"

# Sprawdzenie, czy katalog medicine istnieje
if [ ! -d "$MEDICINE_DIR" ]; then
    echo "Katalog $MEDICINE_DIR nie istnieje."
    exit 1
fi

# Kompilacja pliku Main.java
echo "Kompilacja Main.java..."
javac Main.java
if [ $? -ne 0 ]; then
    echo "Błąd kompilacji pliku Main.java."
    exit 1
fi

# Kompilacja wszystkich plików .java w katalogu medicine
echo "Kompilacja plików w katalogu $MEDICINE_DIR..."
javac $MEDICINE_DIR/*.java
if [ $? -ne 0 ]; then
    echo "Błąd kompilacji plików w katalogu $MEDICINE_DIR."
    exit 1
fi

echo "Kompilacja zakończona pomyślnie."

# Uruchomienie skompilowanego programu Main
echo "Uruchamianie programu Main..."
java Main
if [ $? -ne 0 ]; then
    echo "Błąd podczas uruchamiania programu Main."
    exit 1
fi

echo "Program Main zakończył działanie pomyślnie."