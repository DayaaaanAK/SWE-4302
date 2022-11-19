package Task1;

public class Bottles {
    public String verse(int number)
    {
        if(number == 0)
        {
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
        else if(number == 1)
        {
            return "1 bottle of beer on the wall, 1 bottle of beer.\n"+
                    "Take one down and pass it around, no more bottles of beer on the wall.\n";
        }
        else if (number == 2)
        {
            return "2 bottles of beer on the wall, 2 bottles of beer.\n"+
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        }
        else if (number > 2 && number <= 99)
        {
            return number + " bottles of beer on the wall, " +
                    number + " bottles of beer.\n"+
                    "Take one down and pass it around, " +
                    (number-1) + " bottles of beer on the wall.\n";
        }
        else return null;
    }

    public String Verses(int upper_limit, int lower_limit)
    {
        String verses = "";
        for(int i = upper_limit; i >= lower_limit; i--)
        {
            verses += verse(i);
        }
        return verses;
    }

    public String song()
    {
        String song = "";
        song = Verses(99,0);
        return song;
    }
}
