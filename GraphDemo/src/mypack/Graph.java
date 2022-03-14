package mypack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph 
{
	int noOfVertices;
	LinkedList<Integer> va[];
	
	public Graph(int noOfVertices) 
	{
		this.noOfVertices=noOfVertices;
		va = new LinkedList[noOfVertices];
		
		for (int i = 0; i < noOfVertices; i++)
		{
		   va[i]= new LinkedList<Integer>();	
		}
	}
	
	public void addEdge(int o, int d)
	{
		va[o].add(d);
	}
	
	public void display(int v)
	{
		Iterator<Integer> i = va[v].iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	 public void BFT(int v) 
	 {
	        boolean[] visited=new boolean[noOfVertices];
	        LinkedList<Integer> tl=new LinkedList<Integer>();
	
	        tl.add(v);
	        visited[v]=true;
	       
	        while(!tl.isEmpty()) 
	        {
	            int n=tl.poll();
	            System.out.print(n+" ");
	           
	            Iterator<Integer> i=va[n].iterator();
	            while(i.hasNext()) 
	            {
	                int c=i.next();
	                if(!visited[c]) 
	                {
	                    visited[c]=true;
	                    tl.add(c);
	                }
	            }
	        }
	  }
	 
	public void DFT(int v)
	 {
	        boolean[] visited=new boolean[noOfVertices];
	        Stack<Integer> t1=new Stack<Integer>();
	        t1.add(v);
	        visited[v]=true;
	        while(!t1.isEmpty())
	        {
	            int n=t1.pop();
	            System.out.print(n+" ");
	            
	            Iterator<Integer> i =va[n].iterator();
	             while(i.hasNext()) 
	            {
	                int c=i.next();
	                if(!visited[c]) 
	                {
	                    visited[c]=true;
	                    t1.push(c);
	                }
	            }
	  }
   }
}
