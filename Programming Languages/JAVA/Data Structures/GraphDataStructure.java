import java.util.*;
import java.util.LinkedList;

class GraphDataStructure{
	static class Graph{
		int vertices;
		LinkedList<Integer> adjacentListArray[];

		Graph(int v){
			vertices=v;
			adjacentListArray =new LinkedList[vertices];
			for(int i=0;i<vertices;i++){
				adjacentListArray[i]=new LinkedList<Integer>();
			}
		}
	}
	void addEdge(Graph graph,int src,int dest){
		graph.adjacentListArray[src].add(dest);
		graph.adjacentListArray[dest].add(src);
	}
	void printGraph(Graph graph){

		for(int v=0;v<graph.vertices;v++){
			int p=0;
			for(Integer i : graph.adjacentListArray[v]){
				if(p++==0)
					System.out.println("\nAdjacent list of vertex\t"+v);
				System.out.print(" -> "+i);
			}
		}
	}
	void DepthFirstSearch(int v, boolean visited[],Graph graph){
		visited[v]=true;
		System.out.print(v+"\t");

		Iterator<Integer> i=graph.adjacentListArray[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n])
				DepthFirstSearch(n,visited,graph);
		}
	}
	void DFS(int v, Graph graph){
		System.out.println("\nDepth First Search Transversl(from "+v+"): ");
		boolean visited[]=new boolean[graph.vertices];

		DepthFirstSearch(v,visited,graph);
	}
	void DFS(Graph graph){
		//disconnected graph
		//System.out.println("\nDepth First Search Transversl: ");
		boolean visited[]=new boolean[graph.vertices];
		for(int i=0;i<graph.vertices;i++){
			if(visited[i]==false)
				DepthFirstSearch(i,visited,graph);
		}
	}
	void BFS(int s,Graph graph){
		boolean visited[]=new boolean[graph.vertices];
		LinkedList<Integer> queue=new LinkedList<Integer>();

		visited[s]=true;
		queue.add(s);

		while(queue.size()!=0){
			s=queue.poll();
			System.out.print(s+"\t");
			Iterator<Integer> i=graph.adjacentListArray[s].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}	
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		System.out.println("Enter the graph size ");
		Graph g=new Graph(in.nextInt());

		GraphDataStructure ob=new GraphDataStructure();
		System.out.println("Enter the edge from DESTINATION to SOURCE -1 to exit");
		ob.addEdge(g,in.nextInt(),in.nextInt());
		while(!in.hasNext("-1")){
			ob.addEdge(g,in.nextInt(),in.nextInt());
		}
		in.nextInt();
		ob.printGraph(g);
		System.out.println("\nEnter the starting point of DFS Transversl");
		ob.DFS(in.nextInt(),g);
		System.out.println("\nDFS Transversl for disconnected graph");
		ob.DFS(g);
		System.out.println("\nEnter the starting point of BFS Transversl");
		ob.BFS(in.nextInt(),g);
	}
}