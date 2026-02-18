/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 * Uses String.join() to construct each line of the banner.
 */

public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        // Each println builds one row of the banner
        // Letters: O  O  P  S

        System.out.println(String.join(" ",
                "  *  ",  // O
                "  *  ",  // O
                " *** ",  // P
                " *** "   // S
        ));

        System.out.println(String.join(" ",
                " *   * ", 
                " *   * ", 
                " *   * ", 
                " **      "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " ***  ",
                " ***  "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " **      ",
                "      ** "
        ));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " **      ",
                "      ** "
        ));

        System.out.println(String.join(" ",
                "  *  ",
                "  *  ",
                " **     ",
                " **    "
        ));

        System.out.println(String.join(" ",
                "        ",
                "        ",
                "        ",
                " ***  "
        ));
    }
}