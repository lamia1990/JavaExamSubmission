package JavaExam;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        String[][] multiArray = {{"House1", "House2", "House3" }, {"John", "Bernard", "Katy" }, {"OnMarket1", "OnMarket2", "OnMarket3" }, {"Sold", "Pending", "StillOnMarket" }};
        for (String[] strings : multiArray) {
            for (String string : strings) System.out.print(string + "\t\t");
            System.out.println();
        }

    }
}
