public class Coordinate{

    private int row, col;
    //[row][col]
    public void setRow(int row){
	this.row = row;
    }

    public void setCol(int col){
	this.col = col;
    }

    public int getRow(){
	return row;
    }

    public int getCol(){
	return col;
    }

    public static void main(String[]args){
	Coordinate A = new Coordinate();
	A.setRow(4);
	A.setCol(5);
	System.out.println(A.getRow());
	System.out.println(A.getCol());
    }
}