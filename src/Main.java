import HardProblem.ThirdProblem;

public class Main {
    public static void main(String[] args) {
        int[][] routes = {{1, 2, 7},
                {3, 6, 7}};
        int source = 1;
        int target = 6;

        ThirdProblem thirdProblem = new ThirdProblem();
        thirdProblem.segundaPrueba(routes,source,target);


    }
}