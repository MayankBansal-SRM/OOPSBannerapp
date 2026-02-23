public class OOPSBannerUC5 {
    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC5");

        // Inline array initialization using String.join()
        String[] banner = {
            String.join("", "*****", "  ", "*****", "  ", "*****", "  ", "*****"),
            String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "*   *"),
            String.join("", "*   *", "  ", "*   *", "  ", "*   *", "  ", "*   *"),
            String.join("", "*****", "  ", "*****", "  ", "*****", "  ", "*****"),
            String.join("", "*     ", "  ", "*   *", "  ", "*   *", "  ", "    *"),
            String.join("", "*     ", "  ", "*   *", "  ", "*   *", "  ", "    *"),
            String.join("", "*     ", "  ", "*****", "  ", "*****", "  ", "*****")
        };

        // Enhanced for loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
