public class Printer {
    private int sheets;
    private int pages;
    private int copies;
    private int volume;

    public Printer(int sheets, int pages, int copies, int volume) {
        this.sheets = sheets;
        this.pages = pages;
        this.copies = copies;
        this.volume = volume;
    }

    public int checkNumberOfSheetsLeft() {
        return sheets;
    }

    public boolean checkEnoughPagesToPrint() {
        if (pages * copies <= sheets) {
            return true;
        } else {
            return false;
        }
    }


    public void addPages(int number) {
        this.pages = number;
    }

    public void addCopies(int number) {
        this.copies = number;
    }

    public int checkPages() {
        return pages;
    }

    public int checkCopies() {
        return copies;
    }

    public int reduce() {
        if (pages * copies <= sheets) {
            sheets -= pages * copies;
        }
        return sheets;

    }

    public int tonerVolume(){
        volume -= 1;
        return volume;
    }

}



