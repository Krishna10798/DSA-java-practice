package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
	public static void main(String[] args) {
       System.out.println(count(4,4));
       System.out.println("*********************");
       pathDR("", 3, 3);
       System.out.println("*********************");
       System.out.println(pathDRReturn("", 3, 3));
       System.out.println("*********************");
       System.out.println(pathDRDiagonalReturn("", 3, 3));
       System.out.println("*********************");
       System.out.println(pathDRDiagonalReturn("", 3, 3).size());
       System.out.println("*********************");
       
       
       boolean[][] board= {
    		   {true,true,true},
    		   {true,false,true},
    		   {true,true,true}
       };
       pathWithRestrictions("", board, 0, 0);
       System.out.println("*********************");
       
       
       
       
       boolean[][] board1= {
    		   {true,true,true},
    		   {true,true,true},
    		   {true,true,true}
       };
       allPathWithOrWithoutRestrictions("", board1, 0, 0);
       System.out.println("*********************");
       
       
       boolean[][] board2= {
    		   {true,true,true},
    		   {true,true,true},
    		   {true,true,true}
       };
       int[][] path=new int[board2.length][board2[0].length];
       allPathPrintWithOrWithoutRestrictions("", board2, 0, 0,path,1);
       System.out.println("*********************");

	}
	
	
	
	
	static int count(int r,int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=count(r-1,c);
		int right=count(r,c-1);
		return left+right;
	}
	
	static void pathDR(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		if(r>1) {
			pathDR(p+'D', r-1, c);
		}
		if(c>1) {
			pathDR(p+'R', r, c-1);
		}
	}
	
	
	static ArrayList<String> pathDRReturn(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		if(r>1) {
			list.addAll(pathDRReturn(p+'D', r-1, c));
		}
		if(c>1) {
			list.addAll(pathDRReturn(p+'R', r, c-1));
		}
		return list;
	}
	
	
	static ArrayList<String> pathDRDiagonalReturn(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		if(r>1) {
			list.addAll(pathDRDiagonalReturn(p+'V', r-1, c));
		}
		if(c>1) {
			list.addAll(pathDRDiagonalReturn(p+'H', r, c-1));
		}
		if(r>1 && c>1) {
			list.addAll(pathDRDiagonalReturn(p+'D', r-1, c-1));
		}
		return list;
	}
	
	
	
	static void pathWithRestrictions(String p, boolean[][] maze,int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		if(r<maze.length-1) {
			pathWithRestrictions(p+'D',maze, r+1, c);
		}
		if(c<maze[0].length-1) {
			pathWithRestrictions(p+'R',maze, r, c+1);
		}
	}
	
	static void allPathWithOrWithoutRestrictions(String p, boolean[][] maze,int r,int c) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		maze[r][c]=false;
		if(r<maze.length-1) {
			allPathWithOrWithoutRestrictions(p+'D',maze, r+1, c);
		}
		if(c<maze[0].length-1) {
			allPathWithOrWithoutRestrictions(p+'R',maze, r, c+1);
		}
		if(r>0) {
			allPathWithOrWithoutRestrictions(p+'U',maze, r-1, c);
		}
		if(c>0) {
			allPathWithOrWithoutRestrictions(p+'L',maze, r, c-1);
		}
		maze[r][c]=true;
	}
	
	
	
	static void allPathPrintWithOrWithoutRestrictions(String p, boolean[][] maze,int r,int c,int[][] path,int step) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			path[r][c]=step;
			for (int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		maze[r][c]=false;
		path[r][c]=step;
		if(r<maze.length-1) {
			allPathPrintWithOrWithoutRestrictions(p+'D',maze, r+1, c,path,step+1);
		}
		if(c<maze[0].length-1) {
			allPathPrintWithOrWithoutRestrictions(p+'R',maze, r, c+1,path,step+1);
		}
		if(r>0) {
			allPathPrintWithOrWithoutRestrictions(p+'U',maze, r-1, c,path,step+1);
		}
		if(c>0) {
			allPathPrintWithOrWithoutRestrictions(p+'L',maze, r, c-1,path,step+1);
		}
		maze[r][c]=true;
		path[r][c]=0;
	}
}
