package mypack;

public class Launcher 
{
	public static void main(String[] args) 
	{
		Graph g = new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,3);
		
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		g.addEdge(4, 0);
		g.addEdge(4,1);
		
		for (int i = 0; i < g.noOfVertices; i++)
		{
			System.out.println("Vertex "+i);
			//g.display(i);
			g.BFT(i);
			System.out.println();
		}
		
		System.out.println();
		

		for (int i = 0; i < g.noOfVertices; i++)
		{
			System.out.println("Vertex "+i);
			//g.display(i);
			g.DFT(i);
			System.out.println();
		}
	}

}
