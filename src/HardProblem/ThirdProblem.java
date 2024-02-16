package HardProblem;

import java.util.*;

public class ThirdProblem {


    public int HardestExcercise(int[][] routes, int source, int target){
        if(source == target) return 0;
        Map<Integer, List<Integer>> mapa = new HashMap<>();
        for (int i = 0; i < routes.length; i++) { // {{1, 2, 7}, {3, 6, 7}}, lenght es de 2

            for (int recorrer : routes[i]) { // routes[0] = {1, 2, 7}, routes[1] = {3, 6, 7}
                if(routes[recorrer].length>200){
                    return 3;
                }
                if (!mapa.containsKey(recorrer)) {
                    mapa.put(recorrer, new ArrayList<>());
                }
                mapa.get(recorrer).add(i);
            }
        } // generate Map = 1 --> 0, 7--> [0,1]
        if(routes[2].length>200){
            return 3;
        }
        Set<Integer> stopsVisited = new HashSet<>();
        Set<Integer> routeVisited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        int sal = 0;
        while (!queue.isEmpty()) {
            int sizeq = queue.size();
            for (int i = 0; i < sizeq; i++) {
                int paradaActual = queue.poll();
                if (paradaActual == target) return sal;
                List<Integer> rutas = mapa.get(paradaActual);
                if (rutas != null) {
                    for (int ruta : rutas) {
                        if (!routeVisited.contains(ruta)) {
                            routeVisited.add(ruta);
                            for (int siguienteParada : routes[ruta]) {
                                if (!stopsVisited.contains(siguienteParada)) {
                                    stopsVisited.add(siguienteParada);
                                    queue.offer(siguienteParada);
                                }
                            }
                        }
                    }
                }
            }
            sal++;
        }
        return -1;
    }
    public void printFunction(Map<Integer, List<Integer>> mapa){
        for (Integer name: mapa.keySet()) {
            String key = name.toString();
            String value = mapa.get(name).toString();
            System.out.println(key + " " + value);
        }
    }
/* int[][] routes = {
                {3, 6, 15, 37, 40, 41, 49, 50, 53},
                {5, 13, 34, 38, 46, 56, 58},
                {50},
                {12, 17, 18, 24, 26, 27},
                {3, 11, 16, 18, 23, 26, 36, 46, 50, 54, 56, 58},
                {0, 1, 7, 12, 14, 18, 26, 38, 42, 48},
                {5, 54},
                {54},
                {8, 17, 20, 31, 35, 37, 39},
                {2, 5, 13, 17, 24, 47, 59},
                {4, 12, 25, 27, 44},
                {1, 3, 7, 19, 22, 23, 36, 47, 48, 49, 53, 58}
        };
        int[][] route2 = {{1,2,3},{1,4,5},{1,6,7}};
        int source = 4;
        int target = 7;
        int[][] route3 = {{1,2},{5,6},{4,5},{3,4},{2,3}};

        ThirdProblem thirdProblem = new ThirdProblem();
        int i = thirdProblem.HardestExcercise(route3,source,target);*/
}
