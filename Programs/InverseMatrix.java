package jj.kk.ll;

public class InverseMatrix {
public static void main(String[] args) {
	int row=2,column=3;
	int[][]matrix= {{2,3,4},{5,6,4}};
	int[][]transpose=new int[column][row];
	display(matrix);
	for(int i=0;i<row;i++) {
	for(int j=0;j<column;j++) {
		transpose[i][j]=matrix[i][j];
}
}
	display(transpose);
}
public static void display(int[][]matrix) {
System.out.println("the matrix is:");
for(int[]row:matrix) {
	for(int column:row)
	{
		System.out.print(column+" ");
	}
	System.out.println();
	}
}
}