/*
@desc : it is a max finder fo rthree variable and more than three variables using generic class and methods
 */

public class GenericMaxFinder<T extends Comparable<T>> {

        private final T var1;
        private final T var2;
        private final T var3;

        // Parameterized constructor
        /*
         @desc : Constructs a GenericMaxFinder with three input variables.

         @param var1 The first input variable of generic type T.
         @param var2 The second input variable of generic type T.
         @param var3 The third input variable of generic type T.
         @return : no return
         */
        public GenericMaxFinder(T var1, T var2, T var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }



    // Static method to find the maximum
        /*
         @desc : Finds the maximum among three variables of generic type T.
         @param  - var1 The first input variable of generic type T.
         @param  - var2 The second input variable of generic type T.
         @param  -var3 The third input variable of generic type T.
         @return The maximum variable among var1, var2, and var3.
         */
        public static <T extends Comparable<T>> T findMax(T var1, T var2, T var3) {
            T max = var1;
            if (var2.compareTo(max) > 0) {
                max = var2;
            }
            if (var3.compareTo(max) > 0) {
                max = var3;
            }
            return max;
        }

        // Method to internally call the static findMax method
        /*
         @desc : Calls the static findMax method internally to find the maximum among the three variables.
         @param : no param
         @return The maximum variable among var1, var2, and var3.
         */
        public void  testMaximum() {
            T max = findMax(var1, var2, var3);
            printMax(max);
        }
/*
    @desc ;  Generic method to print the maximum value
    @param - T - varaible
    @return : no return

 */
    private static <T> void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }

        /*
        @desc : it sorts the given array
        @param : array of datatype T as parameter
        @return : no return
         */
    private void insertionSort(T[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            T key = array[i];
            int j = i - 1;
            // Move elements of array[0..i-1] that are greater than key to one position ahead of their
            // current  position
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    /*
     @desc : Calls the static findMax method internally to find the maximum among array.
     @param : Array
     @return The maximum variable among array.
     */
        public T findMax(T[] array) {
            // Check for null or empty array
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty.");
            }

            // Sort the array
            insertionSort(array);

            // Return the maximum value (last element after sorting)
            return array[array.length - 1];
        }

        public static void main(String[] args) {
            // Test case using Integer
            GenericMaxFinder<Integer> integerGenericMaxFinder = new GenericMaxFinder<>(5, 9, 3);
            integerGenericMaxFinder.testMaximum();

            // Test case using Double
            GenericMaxFinder<Double> doubleGenericMaxFinder = new GenericMaxFinder<>(4.5, 2.3, 8.1);
            doubleGenericMaxFinder.testMaximum();

            //test case using string
            GenericMaxFinder<String> stringGenericMaxFinder = new GenericMaxFinder<>("Apple" , "Mango" , "Water");
            stringGenericMaxFinder.testMaximum();

            Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
            GenericMaxFinder<Integer> maxFinder = new GenericMaxFinder<>(5 , 4 , 8);
            Integer maxValue = maxFinder.findMax(intArray);
            System.out.println("Maximum value: " + maxValue);
        }
    }
