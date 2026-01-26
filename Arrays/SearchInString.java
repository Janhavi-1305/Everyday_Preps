class SearchInString {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming.";
        String searchTerm = "Java";

        int index = str.indexOf(searchTerm);
        if (index != -1) {
            System.out.println("The term \"" + searchTerm + "\" was found at index: " + index);
        } else {
            System.out.println("The term \"" + searchTerm + "\" was not found in the string.");
        }
    }
}