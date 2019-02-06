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
        //stack.add(vertex);
        //visited.add(vertex);
        boolean[] isConnected = new boolean[this.numOfVerticies];
        int connectionCount  = 0;
        for(int i = 0; i < this.numOfVerticies; i++){
            List<Integer> list = this.getAdjList(i);
            if(list.size() > 0) isConnected[i] = true; 
            //connectionCount++;
            //System.out.println(isConnected[i]);
        }
        int i = 0;
        while(i < this.numOfVerticies){
            if(isConnected[i]){
                //count = i;
                //poo
                //System.out.println("Using Index " + i);
                stack.add(i);
                visited.add(i);
                i++;
            }
            else {
                //System.out.println("Continuing from index " + i);
                i = i + 1;
                continue;
            }
            while(!stack.isEmpty()){
                int current = stack.pop();
                //System.out.println("Popping: " + current);
                List<Integer> list = this.getAdjList(current);
                //System.out.println("Current NOde: " + current);
                //System.out.println (list);
                for(Integer v : list){
                    if(current == v) return 1;
                    //System.out.println("Attempts to visit: " + v);
                    if(!visited.contains(v)){
                        //System.out.println("Vists: " + v);
                        stack.add(v);
                        visited.add(v);
                        //System.out.println("Count: " + count);
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