package JFang;

public class JFangLib {
    /**
     * isPalindrome a word and returns true if it is a palindrome
     * isPalindrome("racecar") would return true
     *
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word)
    {
        String flipped = "";
        for (int i = word.length() - 1; i > -1; i--)
        {
            flipped += word.substring(i,i+1);
        }
        if (flipped.equals(word)) return true;
        return false;
    }

    /**
     * fooBarBaz makes a list of numbers from 1 to the given number, then replaces multiples of 3 with foo, multiples of 5 with ba, and multiples of both 3 and 5 with baz.
     * fooBarBaz(10) would return "1, 2, foo, 4, bar, foo, 7, 8, foo, bar"
     *
     * @param num1
     */
    public static void fooBarBaz(int num1)
    {
        String numList = "";
        for (int i = 1; i <= num1; i++)
        {
            if(i % 3 == 0 && i % 5 != 0) numList += "foo, ";
            else if(i % 5 == 0 && i % 3 != 0) numList += "bar, ";
            else if (i % 3 == 0 && i % 5 == 0) numList += "baz, ";
            else numList += i + ", ";
        }
        numList = numList.substring(0, numList.length()-2);
        System.out.println(numList);
    }

    /**
     * multiplicationTable prints a list of numbers from 0 to the range by base in the format: 0*n, 1*n, 2*n, etc. where n is the base and the numbers increment by 1 until it is the same as the range
     * multiplicationTable(2,3) would be 0*2, 1*2, 2*2, 3*2, which would return 0 2 4 6
     *
     * @param base
     * @param range
     * @return
     */
    public static void multiplicationTable(int base, int range)
    {
        String theList = "";
        for (int n = 0; n <= range; n++)
            theList += base * n + " ";
        System.out.println(theList);
    }



    /**
     * sumUpTo adds all of the numbers from 0 to the input number.
     * sumUpTo(9) would be 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9, which would return 45
     *
     * @param num
     * @return
     */
    public static int sumUpTo (int num)
    {
        int total = 0;
        for (int i = 0; i <= num; i++)
        {
            total += i;
        }
        return total;
    }

    /**
     * dateStr will turn a date of the mm/dd/yyyy into dd – mm - yyyy
     * for example, dateStr("02/03/2002") will return "03 - 02 - 2002"
     *
     * @param date
     * @return
     */
    public static String dateStr(String date)
    {
        String month = date.substring(0,2) + " - ";
        String day = date.substring(3,5) + " - ";
        String year = date.substring(6,10);
        return day + month + year;
    }

    public static String quadSolver (Double a, Double b, Double c) //b^2 - 4ac
    {
        if (b*b - 4*a*c < 0) return "The quadratic equation has imaginary roots";
        double sqRoot = Math.sqrt(b*b - 4*a*c);
        int root1 = (-1*b + sqRoot)/ 2a;
        int root2 = (-1*b - sqRoot)/ 2a;
        return root1 + " " + root2;
    }
}
