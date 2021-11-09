package Homework;

public class PersonalComputer {
    private String CPU;
    private double memory;

    public PersonalComputer(String CPU, double memory) {
        this.CPU = CPU;
        this.memory = memory;
    }

    public void show() {
        System.out.println("CPU: " + CPU + ", memory: " + memory);
    }

    public static class Monitor {
        private String color;
        private double monitorSize;
        private String power;

        public Monitor(String color, double monitorSize, String power) {

            this.color = color;
            this.monitorSize = monitorSize;
            this.power = power;
        }
    }

    public static class Computer {
        private String color;
        private String power;

        public Computer(String CPU, double price, String color, String power) {
            this.color = color;
            this.power = power;
        }
        public void show() {
            System.out.println("Color: " + color + ", Power: " + power);
        }
    }
}
