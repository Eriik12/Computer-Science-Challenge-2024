import HardProblem.ThirdProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[][] routes = {
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
        int i = thirdProblem.HardestExcercise(route3,source,target);
        System.out.println(i);
    }
}