package DEMO;
import java.util.*;

public class FloodFill {

    static void dfs(
            int[][] image,
            int row,
            int col,
            int oldColor,
            int newColor) {

        // Boundary check
        if (row < 0 ||
            row >= image.length ||
            col < 0 ||
            col >= image[0].length) {
            return;
        }

        // If the current pixel is not the old color
        if (image[row][col] != oldColor) {
            return;
        }

        // Change the color
        image[row][col] = newColor;

        // Visit all 4 directions
        dfs(image, row + 1, col, oldColor, newColor);
        dfs(image, row - 1, col, oldColor, newColor);
        dfs(image, row, col + 1, oldColor, newColor);
        dfs(image, row, col - 1, oldColor, newColor);
    }

    static int[][] floodFill(
            int[][] image,
            int sr,
            int sc,
            int color) {

        int oldColor = image[sr][sc];

        // If old and new colors are same
        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    public static void main(String[] args) {

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] result = floodFill(image, sr, sc, color);

        // Print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
