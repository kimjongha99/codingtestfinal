//너비우선 탐색 BFS

// 정점들과 같은 레벨에 있는 노드들 먼저 탐색하는방식.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bfs {
    //큐를 두개를 만든후 (탐색한노드 , 탐색이 필요한노드)
    //시작노드 설정. A
    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> grpah, String startNode){


        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needvisited = new ArrayList<String>();
        needvisited.add(startNode);

        while (needvisited.size()>0){
            String node = needvisited.remove(0);
            if (!visited.contains(node)){
                visited.add(node);
                needvisited.addAll(grpah.get(node));
            }
        }
       return visited;

    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<>(Arrays.asList("B","C")));
        graph.put("B", new ArrayList<>(Arrays.asList("A","D")));
        graph.put("C", new ArrayList<>(Arrays.asList("A","G","H","I")));
        graph.put("D", new ArrayList<>(Arrays.asList("B","E","F")));
        graph.put("E", new ArrayList<>(Arrays.asList("D")));
        graph.put("F", new ArrayList<>(Arrays.asList("C")));
        graph.put("G", new ArrayList<>(Arrays.asList("C")));
        graph.put("H", new ArrayList<>(Arrays.asList("C")));
        graph.put("I", new ArrayList<>(Arrays.asList("C","J")));
        graph.put("J", new ArrayList<>(Arrays.asList("I")));




       bfs test =new bfs();
       String result = String.valueOf(test.bfsFunc(graph,"A"));

        System.out.println(result);
    }
}
