package org.example;

import org.springframework.stereotype.Component;

@Component
public class AlterRock implements Music{

    private AlterRock(){}

    public static AlterRock getAlterRock() {
        return new AlterRock();
    }

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
