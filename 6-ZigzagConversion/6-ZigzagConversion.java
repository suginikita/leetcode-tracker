// Last updated: 7/9/2026, 10:07:19 AM
class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if only one row, return the string as is
        if (numRows == 1) {
            return s;
        }
        
        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        // Variables to track current row and direction
        int currentRow = 0;
        boolean goingDown = false;
        
        // Distribute each character to its appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            
            // Change direction at top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            // Move to next row
            currentRow += goingDown ? 1 : -1;
        }
        
        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }
}