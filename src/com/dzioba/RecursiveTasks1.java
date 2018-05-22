package com.dzioba;

public class RecursiveTasks1 {

    public int factorial(int n) {
        if(n == 1)
            return n;
        return n*factorial(n-1);
    }

    public int bunnyEars2(int bunnies) {
        int ears = 0;
        if(bunnies == 0)
            return 0;
        if((bunnies % 2) == 0)
            ears = 3;
        if((bunnies % 2) == 1)
            ears = 2;

        return ears + bunnyEars2(bunnies - 1);
    }

    public int count7(int n) {
        int sevens = 0;
        if((n % 10) == 7)
            sevens = 1;
        if(n < 10)
            return sevens;
        return sevens + count7(n / 10);
    }

    public int countX(String str) {
        int xCount = 0;
        if(str.contains("x") == false)
            return 0;
        else{
            xCount = 1;
            str = str.replaceFirst("x", "y");
        }
        return xCount + countX(str);
    }

    public String changePi(String str) {
        return str.replace("pi", "3.14");
    }

    public int array11(int[] nums, int index) {
        if(index == nums.length)
            return 0;
        int counter = 0;
        if(nums[index] == 11)
            counter = 1;
        return counter + array11(nums, index + 1);
    }

    public String pairStar(String str) {
        int changeCounter = 0;
        if(str.length() < 2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public int countAbc(String str) {
        int counter = 0;
        if(str.length() < 3)
            return 0;
        if(str.contains("abc")) {
            counter++;
            str = str.replaceFirst("abc", "ayc");
        }
        if(str.contains("aba")) {
            counter++;
            str = str.replaceFirst("aba", "aya");
        }
        if(counter == 0)
            return 0;

        return counter + countAbc(str);

    }

    public int countHi2(String str) {
        int counter = 0;
        if(str.length() < 2)
            return 0;
        if(str.length() == 2)
            return (str.equals("hi")) ? 1 : 0;
        if(str.charAt(0) == 'x')
        {
            if(str.substring(1, 3).equals("hi"))
                return countHi2(str.substring(3));
            return countHi2(str.substring(1));
        }
        if(str.substring(0, 2).equals("hi")){
            counter ++;
            return counter + countHi2(str.substring(2));
        }

        if(str.substring(1, 3).equals("hi")) {
            counter ++;
            return counter + countHi2(str.substring(3));
        }

        return countHi2(str.substring(2));
    }

    public int strCount(String str, String sub) {
        if(str.length() < sub.length())
            return 0;
        if(str.length() == sub.length()) {
            if(str.equals(sub))
                return 1;
        }
        if(str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public int bunnyEars(int bunnies) {
        if(bunnies == 0)
            return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int triangle(int rows) {
        if(rows == 0)
            return 0;
        if(rows == 1)
            return 1;
        return rows + triangle(rows -1);
    }

    public int count8(int n) {
        if(n == 0)
            return 0;
        int counter = 0;
        if(n == 8)
            return 1;
        if((n % 10) == 8) {
            counter = 1;
            if((n/10 % 10) == 8)
                counter = 2;
        }
        return counter + count8(n / 10);
    }

    public int countHi(String str) {
        if(str.length() < 2)
            return 0;
        if(str.contains("hi")){
            str = str.replaceFirst("hi", "yy");
            return 1 + countHi(str);
        }
        return 0;
    }

    public String noX(String str) {
        return str.replace("x", "");
    }

    public boolean array220(int[] nums, int index) {
        if(index >= nums.length - 1)
            return false;
        if(nums.length < 2)
            return false;
        if(nums[index] * 10 == nums[index+1] )
            return true;
        return array220(nums, index+1);
    }

    public String endX(String str) {
        if(str.length() == 0)
            return str;
        if(str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }

    public int count11(String str) {
        if(str.length() < 2)
            return 0;
        if(str.equals("11"))
            return 1;
        if(str.substring(0,2).equals("11"))
            return 1 + count11(str.substring(2));
        if(str.charAt(1) != '1')
            return count11(str.substring(2));
        return count11(str.substring(1));
    }

    public String parenBit(String str) {
        if(str.length() == 0)
            return str;
        if(!(str.contains("(") || str.contains(")")))
            return str;
        int indexOfOpeningParenthesis = str.indexOf("(");
        int indexOfClosingParenthesis = str.indexOf(")");
        return str.substring(indexOfOpeningParenthesis, indexOfClosingParenthesis+1);
    }

    public boolean strCopies(String str, String sub, int n) {
        if(n == 0)
            return true;
        if(str.length() < sub.length())
            return false;
        if(str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);
        return strCopies(str.substring(1), sub, n);
    }

    public int fibonacci(int n) {
        if(n < 2)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumDigits(int n) {
        if(n == 0)
            return 0;
        return n % 10 + sumDigits(n/10);
    }

    public int powerN(int base, int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return base;
        return base * powerN(base, n-1);
    }

    public String changeXY(String str) {
        return str.replace("x", "y");
    }

    public boolean array6(int[] nums, int index) {
        if(index > nums.length-1)
            return false;
        if(nums.length == 0)
            return false;
        if(nums[index] == 6)
            return true;
        return array6(nums, index+1);

    }

    public String allStar(String str) {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public int countPairs(String str) {
        if(str.length() < 3)
            return 0;
        if(str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }

    public String stringClean(String str) {
        if(str.length() < 2)
            return str;
        if(str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        return str.substring(0, 1) + stringClean(str.substring(1));
    }

    public boolean nestParen(String str) {
        if((str.length() % 2) == 1)
            return false;
        if(str.length() == 0)
            return true;
        if(str.equals("()"))
            return true;
        if(str.startsWith("(") && str.endsWith(")"))
            return nestParen(str.substring(1, str.length()-1));
        return false;
    }

    public int strDist(String str, String sub) {
        if(str.length() < sub.length())
            return 0;
        if(str.equals(sub))
            return sub.length();
        if(!str.contains(sub))
            return 0;
        int startIndex = str.indexOf(sub);
        int endIndex = str.lastIndexOf(sub);
        if(startIndex != endIndex)
            return endIndex - startIndex + sub.length();
        if(str.contains(sub))
            return sub.length();
        return 0;
    }








}
