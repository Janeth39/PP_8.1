public class twelveDays
{
    String[] line = new String[]{
            "And a partridge in a pear tree",
            "Two turtle doves",
            "Three French hens",
            "Four calling birds",
            "Five golden rings",
            "Six geese a-laying",
            "Seven swans a-swimming",
            "Eight maids a-milking",
            "Nine ladies dancing",
            "Ten lords a-leaping",
            "Eleven pipers piping",
            "Twelve drummers drumming"
    };
    String[] days = new String[] {
            "first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"
    };

    public twelveDays( int day)
    {

    }

    public static void verse(int day)
    {
        System.out.println("\nOn the " + days[day] + " day of Christmas\nMy true love sent to me" + d(day));

    }

    public String d(int day)
    {
        return " " + line[day] + d(day-1);
    }
}
