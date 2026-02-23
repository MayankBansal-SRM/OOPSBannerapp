public class OOPSBannerAppUC4 {
    public static void main(String[] args) {
        // Step 1: Create a String array to store banner lines
        String[] lines = new String[7];

        // Step 2: Populate each line with the banner text
        lines[0] = " **   **   **   *** ";
        lines[1] = "*    *  *    *  *    *  *     ";
        lines[2] = "*    *  *    *  *    *  *     ";
        lines[3] = "*    *  **   **   **  ";
        lines[4] = "*    *  *       *           * ";
        lines[5] = "*    *  *       *           * ";
        lines[6] = " **   *       *       *** ";

        // Step 3: Use enhanced for loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
