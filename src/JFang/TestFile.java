package JFang;


import static JFang.JFangLib.dateStr;
import static JFang.JFangLib.quadSolver;
import static JFang.JFangLib.multiplicationTable;
import static JFang.JFangLib.fooBarBaz;
import static JFang.JFangLib.isPalindrome;
import static JFang.JFangLib.leastCommonMultiple;

public class TestFile {
    public static void main(String[] args)
    {
        boolean palindromeTest = isPalindrome("racecar");
        System.out.println(palindromeTest);
        fooBarBaz(15);
        multiplicationTable(2,3);
        int multipleTest = leastCommonMultiple(6,2,3);
        System.out.println(multipleTest);
        String dateTest = dateStr("02/03/2002");
        System.out.println(dateTest);
        String quadraticTest = quadSolver(1.0,1.0,-6.0);
        System.out.println(quadraticTest);
    }
}
