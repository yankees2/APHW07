import java.io.*;
import java.util.*;

public class makeLake{
    private int [][] lake;
    private int elevation;
    private int [][] instructions;

    public  void importFile(String fileName) throws FileNotFoundException{
	Scanner s = null;
	s = new Scanner(new BufferedReader (new FileReader(fileName)));
	//supposedly BufferedReaders read files one line at a time
	lake = new int[Integer.parseInt(s.next())][Integer.parseInt(s.next())];
	//first two integers set up row and col of lake
	elevation = Integer.parseInt(s.next());
	//third number is the target elevation
	//testing purposes: System.out.println(elevation);
	instructions = new int [Integer.parseInt(s.next())][3];
	//the next number describes how many instructions there are
	//set rows = the number of instructions
	//set cols = 3 (row, col, and by what number to stomp)
	for(int a = 0; a < lake.length;a++){
	    for(int b = 0; b < lake[0].length;b++){
		lake[a][b] = Integer.parseInt(s.next());
	    }
	}
	//after we previously set up the size of the lake
	//now we want to add the given values to it 
	for(int a = 0; a < instructions.length;a++){
	    for(int b = 0; b < instructions[0].length;b++){
		instructions[a][b] = Integer.parseInt(s.next());
	    }
	}
	//now we fill in the commands 
    }

    public String toString(){
	String ans = "";
	for(int a=0;a<lake.length;a++){
	    for(int b=0;b<lake[0].length;b++){
		ans += lake[a][b] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }

    public int getAnswer(){
	int total = 0;
	for(int a=0;a<lake.length;a++){
	    for(int b=0; b< lake[0].length;b++){
		if(lake[a][b] < elevation){
		    total += (elevation - lake[a][b]);
		}
	    }
	}
	return total * 72 * 72;
    }

    public void cowStomp(){
	//we read the instructions first
	//we'll start from lake[row][col]
	//third number will tell us how much to stomp
	//we'll go throw the affected parts of the land first
	//we'll go down three rows and right three cols 
	//and try to document the largest value 
	//the target value = largest value - stomp-digging
	//numbers that meet or are less than the target value will be unchanged
	/*
	for(int a = 0; a < instructions.length;a++){
	    //if three rows, loop three times
	    //this for loop wraps around everything else
	    //you have to keep running it while there are still instructions
	    //number of instructions dictated by number of rows
	    int max = 0;
	    //we want to store the largest number here
	    for(int b = instructions[a][0] -1; b < instructions[a][0] + 2;b++){
		for(int c = instructions[
	*/

    public makeLake(String fileName)throws FileNotFoundException{
	importFile(fileName);
    }

    public static void main(String[]args)throws FileNotFoundException{
	makeLake A = new makeLake("makeLake.in");
	System.out.println(A);
	System.out.println(A.getAnswer());
    }





}