public class OOPSBannerAppUC7 {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

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

    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC7: Store Character Pattern in a Class\n");

        CharacterPatternMap oPattern = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap pPattern = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap sPattern = new CharacterPatternMap('S', getSPattern());

        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(oPattern.getPattern()[i]);
            sb.append(oPattern.getPattern()[i]);
            sb.append(pPattern.getPattern()[i]);
            sb.append(sPattern.getPattern()[i]);
            bannerLines[i] = sb.toString();
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
