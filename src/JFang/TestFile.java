package JFang;


import static JFang.JFangLib.dateStr;
import static JFang.JFangLib.sumUpTo;
import static JFang.JFangLib.multiplicationTable;
import static JFang.JFangLib.fooBarBaz;
import static JFang.JFangLib.isPalindrome;

public class TestFile {
    public static void main(String[] args)
    {
        boolean palindromeTest = isPalindrome("racecar");
        System.out.println(palindromeTest);
        fooBarBaz(15);
        multiplicationTable(2,3);
        int sumTest = sumUpTo(9);
        System.out.println(sumTest);
        String dateTest = dateStr("02/03/2002");
        System.out.println(dateTest);
    }
}
