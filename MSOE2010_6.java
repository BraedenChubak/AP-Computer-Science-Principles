import java.util.*;

class Vertex {
    int x;
    int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MSOE2010_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many vertices? ");
        int numVerts = input.nextInt();
        Vertex[] vertexes = new Vertex[numVerts];
        for (int i = 0; i < numVerts; i++) {
            System.out.print("Vertex " + (i+1) + " X coordinate: ");
            int curX = input.nextInt();
            System.out.print("Vertex " + (i+1) + " Y coordinate: ");
            int curY = input.nextInt();
            Vertex curV = new Vertex(curX, curY);
            vertexes[i] = curV;
        }
        double Area = 0;
        for (int i = 0; i < numVerts; i++) {
            Vertex v1 = vertexes[i];
            Vertex v2;
            if (i == numVerts-1) { v2 = vertexes[0]; }
            else { v2 = vertexes[i+1]; }
            int curArea = ((v1.x * v2.y) - (v2.x * v1.y));
            Area += curArea;
            System.out.println("curArea:" + curArea);
        }
        Area /= 2;
        Area = Math.abs(Area);
        System.out.println("The area is: " + Area);
    }
}
/*
How many vertices? 4
Vertex 1 X coordinate: 0
Vertex 1 Y coordinate: 0
Vertex 2 X coordinate: 2
Vertex 2 Y coordinate: 0
Vertex 3 X coordinate: 2
Vertex 3 Y coordinate: 2
Vertex 4 X coordinate: 0
Vertex 4 Y coordinate: 2
curArea:0
curArea:4
curArea:4
curArea:0
The area is: 4.0
*/