package MediumProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SecondProblem {

    public List<Integer> MediumProblem(TreeNode root1, TreeNode root2){
        List<Integer> result = new ArrayList<>();
        recorrerArrbol(root1, result);
        recorrerArrbol(root2, result);
        Collections.sort(result);
        return result;
    }

    public List<Integer> recorrerArrbol(TreeNode root, List<Integer> result){
        if(root == null){
            return result;
        }else{
            result.add(root.val);
            recorrerArrbol((root.left), result);
            recorrerArrbol((root.right), result);
        }
        return result;
    }

/*      TreeNode root1 = new TreeNode(0);
        root1.right = new TreeNode(59);
        root1.right.left = new TreeNode(57);
        root1.right.right = new TreeNode(90);


        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(0);
        root2.left.right = new TreeNode(2);

        SecondProblem solution = new SecondProblem();

        List<Integer> elements = solution.MediumProblem(root1,root2);

        System.out.println("elements: " + elements);
        */


}
