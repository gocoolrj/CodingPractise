import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

}


class Edge
{
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Dijkstra
{
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
        if (distanceThroughU < v.minDistance) {
            vertexQueue.remove(v);

            v.minDistance = distanceThroughU ;
            v.previous = u;
            vertexQueue.add(v);
        }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {
        // mark all the vertices 
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
      
        // set the edges and weight
        A.adjacencies = new Edge[]{ new Edge(B, 3) };
        B.adjacencies = new Edge[]{ new Edge(A, 3) };
        A.adjacencies = new Edge[]{ new Edge(D, 6) };
        B.adjacencies = new Edge[]{ new Edge(C, 7) };
        C.adjacencies = new Edge[]{ new Edge(D, 8) };
        D.adjacencies = new Edge[]{ new Edge(E, 9) };
        E.adjacencies = new Edge[]{ new Edge(D, 9) };
        D.adjacencies = new Edge[]{ new Edge(C, 9) };
        D.adjacencies = new Edge[]{ new Edge(B, 5) };
        C.adjacencies = new Edge[]{ new Edge(E, 3) };
        


        computePaths(A); // run Dijkstra Start node
        System.out.println("Distance to " + E + ": " + E.minDistance);
        List<Vertex> path = getShortestPathTo(E);// End node
        System.out.println("Path: " + path);
    }
}