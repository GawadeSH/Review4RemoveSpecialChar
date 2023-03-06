package review.practice;

import java.util.Scanner;

public class SpecialCharInString
{
    public static void main(String[] args)
    {
        String str,finalStr = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) > 64 && str.charAt(i) <= 122)
            {
                finalStr = finalStr + str.charAt(i);
            }
        }
        System.out.println("After removing special character:"+finalStr);

    }
}
