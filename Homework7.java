package Homework;

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter Inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        //run the print method until it returns true
        while (Inkjet.print());
        while (laser.print());
    }

    public abstract static class Printer {
        private String model;
        private int printedCount;
        private int availableCount;

        public Printer(String model, int availableCount) {
            this.model = model;
            this.availableCount = availableCount;
            this.printedCount = 0;
        }

        public String getModel() {
            return this.model;
        }

        public int getPrintedCount() {
            return this.printedCount;
        }

        public int getAvailableCount() {
            return this.availableCount;
        }

        public void incrementPrintedCount() {
            printedCount++;
        }

        public void decrementAvailableCount() {
            availableCount--;
        }
        public abstract boolean print();
    }

    public static class InkjetPrinter extends Printer {
        public InkjetPrinter(String model, int printedCount) {
            super(model, printedCount);
        }
        public boolean print() {
            if(getAvailableCount() >= 1)
            {
                incrementPrintedCount();
                decrementAvailableCount();
                return true;
            }
            else
            {
                System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 잉크부족");
                return false;
            }
        }
    }

    public static class LaserPrinter extends Printer {
        public LaserPrinter(String model, int printedCount) {
            super(model, printedCount);
        }
        public boolean print() {
            if(getAvailableCount() >= 1)
            {
                incrementPrintedCount();
                decrementAvailableCount();
                return true;
            }
            else
            {
                System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 토너.");
                return false;
            }
        }
    }
}
