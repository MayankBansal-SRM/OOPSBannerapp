import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // HashMap to store Character Patterns
    private static Map<Character, String[]> bannerPatternMap = new HashMap<>();

    /**
     * Initializes the HashMap with STRICTLY 5x5 ASCII art patterns.
     * Every single string contains exactly 5 characters (including spaces) for perfect alignment.
     */
    public static void loadCharacterPatterns() {
        String[] letterO = {
            " *** ",
            "* *", // Exactly 5 chars: 1 star, 3 spaces, 1 star
            "* *",
            "* *",
            " *** "
        };

        String[] letterP = {
            "**** ", // Exactly 5 chars: 4 stars, 1 space
            "* *",
            "**** ",
            "* ", // Exactly 5 chars: 1 star, 4 spaces
            "* "
        };

        String[] letterS = {
            " ****",
            "* ",
            " *** ",
            "    *", // Exactly 5 chars: 4 spaces, 1 star
            "**** "
        };

        // Populate the Map
        bannerPatternMap.put('O', letterO);
        bannerPatternMap.put('P', letterP);
        bannerPatternMap.put('S', letterS);
    }

    /**
     * Builds and displays the banner for the provided message.
     */
    public static void displayBanner(String message) {
        // We know our patterns are 5 rows high
        int bannerHeight = 5; 

        // Outer loop: Iterate through each row (0 to 4)
        for (int i = 0; i < bannerHeight; i++) {
            
            // StringBuilder constructs the current row across all letters
            StringBuilder rowBuilder = new StringBuilder();

            // Inner loop: Iterate through the characters 'O', 'O', 'P', 'S'
            for (char ch : message.toUpperCase().toCharArray()) {
                String[] pattern = bannerPatternMap.get(ch);
                
                if (pattern != null) {
                    // Append the exact 5-character string, plus 3 spaces between each letter
                    rowBuilder.append(pattern[i]).append("   ");
                }
            }
            
            // Print the perfectly aligned row to the console
            System.out.println(rowBuilder.toString());
        }
    }

    public static void main(String[] args) {
        // Step 1: Load the patterns into the HashMap
        loadCharacterPatterns();

        // Step 2: Render the message "OOPS"
        System.out.println("Displaying Banner:\n");
        displayBanner("OOPS");
    }
}