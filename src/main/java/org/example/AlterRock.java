package org.example;

public class AlterRock implements Music{
    @Override
    public String getSong() {
        return "LP - One More Light";
    }

    public void doBeanInit() {
        System.out.println("\nInit AlterRock Bean\n");
    }

    public void doBeanDestroy() {
        System.out.println("\nDestroy AlterRock Bean\n");
    }
}
