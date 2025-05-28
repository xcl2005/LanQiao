package DigitalSystem;

import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();
        scanner.close();

        if (count <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Shared data structure
        long[] fibonacciSequence = new long[count];

        // Create a thread to generate Fibonacci numbers
        Thread generatorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                generateFibonacci(fibonacciSequence);
            }
        });

        // Start the child thread
        generatorThread.start();

        try {
            // Parent thread waits for child thread to finish
            generatorThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting.");
            Thread.currentThread().interrupt();
        }

        // Output the generated sequence
        System.out.println("Generated Fibonacci sequence:");
        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.print(fibonacciSequence[i] + (i < fibonacciSequence.length - 1 ? ", " : "\n"));
        }
    }

    /**
     * Generates Fibonacci numbers and stores them in the provided array.
     * @param seq an array to hold the Fibonacci sequence
     */
    private static void generateFibonacci(long[] seq) {
        int n = seq.length;
        if (n > 0) seq[0] = 0;
        if (n > 1) seq[1] = 1;
        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
    }
}

