public class OOPSBannerAppUC4 {
public static void main(String[] args){
        int height = 7;
        int width = 5;

        // Outer loop runs exactly 7 times (for 7 horizontal lines)
        for (int row = 0; row < height; row++) {
            
            // 1. Print the first 'O'
            for (int col = 0; col < width; col++) {
                // Top/Bottom edges OR Left/Right edges
                if (((row == 0 || row == height - 1) && (col > 0 && col < width - 1)) || 
                    ((col == 0 || col == width - 1) && (row > 0 && row < height - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("   "); // Gap between letters

            // 2. Print the second 'O'
            for (int col = 0; col < width; col++) {
                if (((row == 0 || row == height - 1) && (col > 0 && col < width - 1)) || 
                    ((col == 0 || col == width - 1) && (row > 0 && row < height - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("   "); // Gap between letters

            // 3. Print the letter 'P'
            for (int col = 0; col < width; col++) {
                // Left edge OR Top/Middle horizontal lines OR Right upper edge
                if (col == 0 || 
                   ((row == 0 || row == height / 2) && col < width - 1) || 
                   (col == width - 1 && row > 0 && row < height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("   "); // Gap between letters

            // 4. Print the letter 'S'
            for (int col = 0; col < width; col++) {
                // Top/Middle/Bottom horizontals OR Top-Left edge OR Bottom-Right edge
                if (((row == 0 || row == height / 2 || row == height - 1) && (col > 0 && col < width - 1)) || 
                    (col == 0 && row > 0 && row < height / 2) || 
                    (col == width - 1 && row > height / 2 && row < height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to the next line after finishing the current row for ALL letters
            System.out.println();
        }
    }
}
