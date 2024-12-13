package com.cleancode.knuth;

public class PrimePrinter {
    private static final int numberOfPrimes = 1000;

    public static void main(String[] args) {
        PrimePrinterHelper helper = new PrimePrinterHelper(numberOfPrimes);
        int[] primes = helper.generatePrimes();
        NumberPrinter printer = new NumberPrinter(50, 4);
        printer.printNumbers(primes, numberOfPrimes);
    }
}