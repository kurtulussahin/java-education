package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        Input fakeWaterInput = new FakeInput();
        int count=0;
        while (count<100) {
            System.out.println("Döngü " + (count + 1) + "->");

            new MinePlant(
                    new SumpPump(
                            new PumpEngine(new DigitalOutput("Engine")),
                            new SumpProbe(
                                    new LevelSensor("Min Level Sensor",80,new DigitalInput(fakeWaterInput)),
                                    new LevelSensor("Max Level Sensor",90,new DigitalInput(fakeWaterInput))
                            )
                    )
            ).run();

            count++;
        }
    }
}