public class OOPSBannerAppUC6 {

    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC6: Refactor Banner Logic into Functions\n");

        // Step 1: Build banner lines using helper methods
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("",
                    getOPattern()[i],  // O
                    getOPattern()[i],  // O
                    getPPattern()[i],  // P
                    getSPattern()[i]   // S
            );
        }

        // Step 2: Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for O pattern
    public static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Helper method for P pattern
    public static String[] getPPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                " *****  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Helper method for S pattern
    public static String[] getSPattern() {
        return new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        };
    }
}
