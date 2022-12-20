package JavaExam;

enum MonthsOfTheYear {January,
    February,
    March,
    April,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    public static MonthsOfTheYear[] Values() {
        return new MonthsOfTheYear[0];
    }
}
public class EnumFile {
    public static void main(String[] args) {
     MonthsOfTheYear Month = MonthsOfTheYear.June;
     if (Month == MonthsOfTheYear.June);
        System.out.println("This is my birthday Month");
    for (MonthsOfTheYear myMonth : MonthsOfTheYear.Values());
        String myMonth = ("June");
        System.out.println(myMonth);
    }









}
