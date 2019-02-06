// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
        int edges = 0;
        int verticies = 0;
        boolean selfLoop = false;
        for(int i = 0; i<a; i++){
            verticies = in.nextInt();
            edges = in.nextInt();
            
            Graph g = new Graph(verticies);

            for(int j = 0; j < edges; j++){
                int e1 = in.nextInt();
                int e2 = in.nextInt();

                g.addEdge(e1,e2);
            }

            System.out.println(g.DFS(0));
            
        }
	}

}

class Graph{
    private int numOfVerticies;
    private LinkedList<Integer> adj[];
    public Graph(int numOfVerticies){
        this.numOfVerticies = numOfVerticies;
        adj = new LinkedList[numOfVerticies];
        for(int i = 0; i < numOfVerticies; i++){
            adj[i] = new LinkedList();
        }
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }
    public int getNumOfVerticies(){
        return numOfVerticies;
    }
        public LinkedList<Integer> getAdjList(int vertex){
        return adj[vertex];
    }
        public int DFS(int vertex){
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> visited = new ArrayList();
        int count = 0;
        boolean[] isConnected = new boolean[this.numOfVerticies];
        int connectionCount  = 0;
        for(int i = 0; i < this.numOfVerticies; i++){
            List<Integer> list = this.getAdjList(i);
            if(list.size() > 0) isConnected[i] = true; 
        }
        int i = 0;
        while(i < this.numOfVerticies){
            if(isConnected[i]){
                stack.add(i);
                visited.add(i);
                i++;
            }
            else {
                i = i + 1;
                continue;
            }
            while(!stack.isEmpty()){
                int current = stack.pop();
                List<Integer> list = this.getAdjList(current);
                for(Integer v : list){
                    if(current == v) return 1;
                    if(!visited.contains(v)){
                        stack.add(v);
                        visited.add(v);
                    }
                    else if(stack.contains(v)){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

}