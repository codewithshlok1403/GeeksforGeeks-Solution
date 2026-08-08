class Solution {
	public ArrayList<Integer> spirallyTraverse(int[][] matrix) {
		ArrayList<Integer>ans = new ArrayList<>();
		int fRow = 0;
		int lRow = matrix.length - 1;
		int fColumn = 0;
		int lColumn = matrix[0].length - 1;
		while (fRow <= lRow && fColumn <= lColumn) {
			
			for (int j = fColumn; j <= lColumn; j++) {
				ans.add(matrix[fRow][j]);
			}
			fRow++;
			if (fRow > lRow || fColumn > lColumn)
				break;
			for (int j = fRow; j <= lRow; j++) {
				ans.add(matrix[j][lColumn]);
			}
			lColumn--;
			if (fRow > lRow || fColumn > lColumn)
				break;
			for (int j = lColumn; j >= fColumn; j--) {
				ans.add(matrix[lRow][j]);
			}
			lRow--;
			if (fRow > lRow || fColumn > lColumn)
				break;
			for (int j = lRow; j >= fRow; j--) {
				ans.add(matrix[j][fColumn]);
			}
			fColumn++;
		}
		return ans; 
		
	}
}
