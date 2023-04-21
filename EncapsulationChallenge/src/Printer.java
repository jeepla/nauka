public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel= (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }
    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
