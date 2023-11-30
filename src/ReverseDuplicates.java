public class ReverseDuplicates {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("Первоначальная строка: " + inputString);
        System.out.println("Перевернутая строка: " + reversedString);
    }
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}


