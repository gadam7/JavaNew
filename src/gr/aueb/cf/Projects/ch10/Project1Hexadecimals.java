package gr.aueb.cf.Projects.ch10;

import java.io.*;
import java.util.*;

/**
 * Project 01
 * Develop a program in Java that reads from a file (p1-input.txt) integers until it finds the value -1 (the file must
 * contain more than 6 numbers and at most 49 numbers) with values from 1 to 49. It inserts these numbers into an array,
 * which it sorts (eg with Arrays.sort()). The program then produces all possible hexadecimals (combinations of
 * 6 numbers). At the same time and immediately after producing each hexadecimal it 'filters' each hexadecimal to
 * meet the following criteria: 1) Contain at most 4 evens, 2) contain at most 4 odd ones, 3) contain at most 2
 * consecutive ones, 4) contain at most 3 identical endings, 5) contain at most 3 numbers in the same ten.
 * Finally, it prints the final hexes to a file (p1-output.txt).
 * Hint. Follow the procedure we saw for the production of 4s. Each generated hex can be stored in an array which
 * can then be checked by each of the mentioned methods (filters). If, for example, a hex has been stored in the
 * arr table, then in order to 'pass' the filters which are also restrictions, it should be checked.
 * E.g. if (!isEven(arr)) && (!isOdd(arr)) && (!isContiguous(arr)) && (!isSameEnding(arr)) && (!isSameTen), write
 * the hex to the output file.
 */

public class Project1Hexadecimals {

    public static void main(String[] args) {
        // File path to read integers
        String filePath = "/Users/adminmacbook/IdeaProjects/p1-input.txt";

        // Read integers from the file
        List<Integer> numbers = readIntegersFromFile(filePath);

        // Convert the list to an array
        Integer[] array = numbers.toArray(new Integer[0]);

        // Sort the array
        Arrays.sort(array);

        // Generate and filter hexadecimals
        List<String> hexadecimals = generateAndFilterHexadecimals(array);

        // File path to write the final hexadecimals
        String outputFilePath = "/Users/adminmacbook/IdeaProjects/p1-output.txt";

        // Write the final hexadecimals to the file
        writeHexadecimalsToFile(hexadecimals, outputFilePath);
    }

    // Read integers from a file
    private static List<Integer> readIntegersFromFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numberStrings = line.split(" ");
                for (String numberString : numberStrings) {
                    int number = Integer.parseInt(numberString);
                    if (number == -1) {
                        break;
                    }
                    numbers.add(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    // Generate and filter hexadecimals
    private static List<String> generateAndFilterHexadecimals(Integer[] array) {
        List<String> hexadecimals = new ArrayList<>();

        // Generate all possible combinations of 6 numbers
        List<List<Integer>> combinations = generateCombinations(array, 6);

        // Check each combination and apply filters
        for (List<Integer> combination : combinations) {
            Integer[] hexArray = combination.toArray(new Integer[0]);

            if (isEven(hexArray) && isOdd(hexArray) && isContiguous(hexArray) &&
                    isSameEnding(hexArray) && isSameTen(hexArray)) {
                String hexadecimal = convertToHexadecimal(hexArray);
                hexadecimals.add(hexadecimal);
            }
        }

        return hexadecimals;
    }

    // Generate all possible combinations of size k from the given array
    private static List<List<Integer>> generateCombinations(Integer[] array, int k) {
        List<List<Integer>> combinations = new ArrayList<>();

        generateCombinationsHelper(array, k, 0, new ArrayList<>(), combinations);

        return combinations;
    }

    // Helper function to generate combinations recursively
    private static void generateCombinationsHelper(Integer[] array, int k, int start, List<Integer> current,
                                                   List<List<Integer>> combinations) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            generateCombinationsHelper(array, k, i + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }

    // Check if the array contains at most 4 even numbers
    private static boolean isEven(Integer[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
                if (count > 4) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if the array contains at most 4 odd numbers
    private static boolean isOdd(Integer[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
                if (count > 4) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if the array contains at most 2 consecutive numbers
    private static boolean isContiguous(Integer[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] == 1) {
                count++;
                if (count > 2) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    // Check if the array contains at most 3 identical endings
    private static boolean isSameEnding(Integer[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 10 == array[i - 1] % 10) {
                count++;
                if (count > 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    // Check if the array contains at most 3 numbers in the same ten
    private static boolean isSameTen(Integer[] array) {
        int[] count = new int[5];
        for (int num : array) {
            int ten = num / 10;
            count[ten]++;
            if (count[ten] > 3) {
                return false;
            }
        }
        return true;
    }

    // Convert an array of integers to a hexadecimal string
    private static String convertToHexadecimal(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(Integer.toHexString(num));
        }
        return sb.toString().toUpperCase();
    }

    // Write the final hexadecimals to a file
    private static void writeHexadecimalsToFile(List<String> hexadecimals, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String hexadecimal : hexadecimals) {
                writer.write(hexadecimal);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

