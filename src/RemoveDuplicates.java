import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String inputString = "Строка с дубликатами";
        String result = removeDuplicates(inputString);
        System.out.println("Первоначальная строка: " + inputString);
        System.out.println("Строка без дубликатов: " + result);
    }

    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            uniqueChars.add(currentChar);
        }
        StringBuilder result = new StringBuilder();
        for (Character uniqueChar : uniqueChars) {
            result.append(uniqueChar);
        }
        return result.toString();

    }
}