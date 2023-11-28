package com.bridgzelabz.maxfinder;
/*
@desc :
The MaxMin class is designed to find the maximum and minimum values among three elements of different data types - integers, floats, and strings. It employs the compareTo method to compare objects and determine the maximum value. The class includes three methods, each tailored for a specific data type.

findMax for Integers:
        Parameters: Three integers (num1, num2, num3).
        Returns: The maximum of the three integers.
        Implementation: Converts integers to Integer objects and uses compareTo for comparison.

findMax for Floats:
        Parameters: Three floats (num1, num2, num3).
        Returns: The maximum of the three floats.
        Implementation: Converts floats to Float objects and utilizes compareTo for comparison.

findMax for Strings:
    Parameters: Three strings (str1, str2, str3).
    Returns: The lexicographically maximum of the three strings.
    Implementation: Uses compareTo to compare strings.
The class includes a main method with test cases for each data type, demonstrating the functionality of the findMax methods.
 */
public class MaxMin {


    /*
      @desc : Finds the maximum among three integers using Integer objects and compareTo method.

     @param num1 The first integer
     @param num2 The second integer
     @param num3 The third integer
     @return The maximum of the three integers
     */
    public static int findMax(int num1, int num2, int num3) {
        Integer integer1 = num1;
        Integer integer2 = num2;
        Integer integer3 = num3;

        // Use compareTo to compare Integer objects

        return integer1.compareTo(integer2) > 0 ? (integer1.compareTo(integer3) > 0 ? num1 : num3)
                : (integer2.compareTo(integer3) > 0 ? num2 : num3);
    }

    /*
      @desc : Finds the maximum among three floats using Float objects and compareTo method.

      @param num1 The first integer
      @param num2 The second integer
      @param num3 The third integer
      @return The maximum of the three integers
     */
    public static float findMax(float num1, float num2, float num3) {
        Float float1 = num1;
        Float float2 = num2;
        Float float3 = num3;

        // Use compareTo to compare Integer objects

        return float1.compareTo(float2) > 0 ? (float1.compareTo(float3) > 0 ? num1 : num3)
                : (float2.compareTo(float3) > 0 ? num2 : num3);
    }


    /*
     @desc :  Finds the maximum among three strings.

      @param str1 The first string
      @param str2 The second string
      @param str3 The third string
      @return The maximum of the three strings
     */
    public static String findMax(String str1, String str2, String str3) {
        System.out.println("4");
        // Use compareTo to compare strings lexicographically

        return str1.compareTo(str2) > 0 ? (str1.compareTo(str3) > 0 ? str1 : str3)
                : (str2.compareTo(str3) > 0 ? str2 : str3);
    }

    public static void main(String[] args) {
        System.out.println("!!! welcome to generics !!!");
        // Test Case 1: Maximum at 1st position
        int maxInt1 = findMax(10, 5, 3);
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxInt1);
        // Test Case 2: Maximum at 2nd position
        int maxInt2 = findMax(4, 8, 2);
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxInt2);
        // Test Case 3: Maximum at 3rd position
        int maxInt3 = findMax(1, 3, 7);
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxInt3);


        // Test Case 1: Maximum at 1st position
        float maxFloat1 = findMax(10.0F, 5.0F, 3.0F);
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxFloat1);

        // Test Case 2: Maximum at 2nd position
        float maxFloat2 = findMax(4.1F, 8.2F, 2.4F);
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxFloat2);

        // Test Case 3: Maximum at 3rd position
        float maxFloat3 = findMax(1.1F, 3.1F, 7.8F);
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxFloat3);

        // Test Case 1: Maximum at 1st position
        String maxString1 = findMax("Apple", "Peach", "Banana");
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxString1);

        // Test Case 2: Maximum at 2nd position
        String maxString2 = findMax("Orange", "Grapes", "Cherry");
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxString2);

        // Test Case 3: Maximum at 3rd position
        String maxString3 = findMax("Lemon", "Kiwi", "Watermelon");
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxString3);
    }


}