public class aniket{
  public static String toUpperCase(String str) {
      // Use StringBuilder for efficient string manipulation
      StringBuilder sb = new StringBuilder();
      
      // Start with the first character, capitalize if it's not a space
      sb.append(Character.toUpperCase(str.charAt(0)));
      
      for (int i = 1; i < str.length(); i++) {
          // Check if the current character is a space and the next character is within bounds
          if (str.charAt(i) == ' ' && i < str.length() - 1) {
              sb.append(str.charAt(i)); // Append the space
              i++; // Move to the next character
              sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize the next character
          } else {
              sb.append(str.charAt(i)); // Append the character as is
          }
      }
      
      // Convert the StringBuilder back to a String and return
      return sb.toString();
  }

  public static void main(String[] args) {
      String str = "my name is aniket i am studying in computer science";
      System.out.println(toUpperCase(str));
  }
}

