public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // length() method
        int length = str.length();
        System.out.println("Length: " + length); // Outputs: Length: 13
        
        // charAt() method
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch); // Outputs: Character at index 7: W
        
        // substring() method
        String substr = str.substring(7, 12);
        System.out.println("Substring: " + substr); // Outputs: Substring: World
        
        // replace() method
        String newStr = str.replace('o', 'a');
        System.out.println("Replaced String: " + newStr); // Outputs: Replaced String: Hella, Warld!
    }
}
