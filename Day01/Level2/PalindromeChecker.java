class PalindromeChecker {
    // Attribute to store the text
     String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
         text = text.toLowerCase();
        int length = text.length();

        // Compare characters from both ends
        int start = 0, end = length-1;
     while(start<end){
        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }
        start++;
        end--;

     }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Test cases
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        PalindromeChecker checker3 = new PalindromeChecker("A man");

        // Display results
        checker1.displayResult();
        checker2.displayResult();
        checker3.displayResult();
    }
}
