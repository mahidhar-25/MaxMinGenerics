package com.bridgzelabz.maxfinder;
/*
@desc :
        The MaxFinderApplication class is a Java program that demonstrates the functionality of finding the maximum among three elements for different data types.
        It includes both non-generic and generic approaches.

        The non-generic part is represented by the MaxMin class, which contains methods to find the maximum for integers,
        floats, and strings. It uses simple comparisons and compareTo method for string comparison.

        The generic part is represented by the GenericMaxFinder class, which introduces a generic method to find the maximum
        among three variables of the same type. It showcases the usage of a generic class to achieve type safety and code reusability.

        The main method of MaxFinderApplication initiates instances of both non-generic and generic classes,
         providing test cases for integers, floats, and strings.
         It demonstrates how the generic approach allows the user to find the maximum without duplicating code for different data types.
*/
public class MaxFinderApplication{
    public static void main(String[] args) {
        System.out.println("!!! welcome to generics !!!");
        MaxMin maxMinWithOutGeneric = new MaxMin();
        // Test Case 1: Maximum at 1st position
        int maxInt1 = maxMinWithOutGeneric.findMax(10, 5, 3);
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxInt1);
        // Test Case 2: Maximum at 2nd position
        int maxInt2 = maxMinWithOutGeneric.findMax(4, 8, 2);
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxInt2);
        // Test Case 3: Maximum at 3rd position
        int maxInt3 = maxMinWithOutGeneric.findMax(1, 3, 7);
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxInt3);


        // Test Case 1: Maximum at 1st position
        float maxFloat1 = maxMinWithOutGeneric.findMax(10.0F, 5.0F, 3.0F);
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxFloat1);

        // Test Case 2: Maximum at 2nd position
        float maxFloat2 = maxMinWithOutGeneric.findMax(4.1F, 8.2F, 2.4F);
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxFloat2);

        // Test Case 3: Maximum at 3rd position
        float maxFloat3 = maxMinWithOutGeneric.findMax(1.1F, 3.1F, 7.8F);
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxFloat3);

        // Test Case 1: Maximum at 1st position
        String maxString1 = maxMinWithOutGeneric.findMax("Apple", "Peach", "Banana");
        System.out.println("Test Case 1: Maximum at 1st position - Max is: " + maxString1);

        // Test Case 2: Maximum at 2nd position
        String maxString2 = maxMinWithOutGeneric.findMax("Orange", "Grapes", "Cherry");
        System.out.println("Test Case 2: Maximum at 2nd position - Max is: " + maxString2);

        // Test Case 3: Maximum at 3rd position
        String maxString3 = maxMinWithOutGeneric.findMax("Lemon", "Kiwi", "Watermelon");
        System.out.println("Test Case 3: Maximum at 3rd position - Max is: " + maxString3);

        GenericMaxFinder<Integer> integerGenericMaxFinder = new GenericMaxFinder<>(10 , 5 , 3);
        integerGenericMaxFinder.testMaximum();
        GenericMaxFinder<String> stringGenericMaxFinder = new GenericMaxFinder<>("Lemon", "Kiwi", "Watermelon");
        stringGenericMaxFinder.testMaximum();
    }

}
