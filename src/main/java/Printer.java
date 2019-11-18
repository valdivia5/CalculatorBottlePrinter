public class Printer {
    private int sheets;
    private int toner;


    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int useSheets(int pages, int copies) {
        return this.sheets - (pages * copies);
    }

    public int useToner(int pages, int copies) {
        return this.toner - (pages * copies);
    }
}
