package ImposibleProblem;

import java.util.Stack;

public class ImposibleProblem {

    //don't work
    public void otherSolution(String a){

        char searchizq= '(';
        char searchder= ')';
        int izq=0; int der =0;

        for(int i = 0; i<a.length();i++){
            if(a.charAt(i)==searchizq){
                izq++;
                int j=i;
                if(j+1<a.length()){
                    j++;
                    while(a.charAt(j)==searchizq && j+1<a.length()){
                        izq++;
                        j++;
                    }
                    if(a.charAt(j)==searchder){
                        der++;
                        if(j+1<a.length()) {
                            j++;
                            while (a.charAt(j) == searchder  && j+1<a.length()) {
                                der++;
                                j++;
                            }
                            if(j+1==a.length()){
                                der++;
                            }

                        }
                    }
                    System.out.println(" ( son "+izq);
                    System.out.println(" ) son "+der);
                }
                i++;
            }

        }
        int c= 0;
        if(izq>der){
            c = izq-der;
            izq = izq-c;
            c= izq + der;
        }else if(izq<der){
            c= der-izq;
            der= der-c;
            c = der + izq;
        }else{
            c= izq + der;
        }
        System.out.println("la salida es "+c);
    }

    //don't work
    public void secondAlgorithm(String a){
        char searchizq= '(';
        char searchder= ')';
        int par=0;
        int n= a.length();
        int aux = n-1;
        for (int i =0;i<n;i++){
            if(a.charAt(i)==searchizq){
                if(a.charAt(aux)==searchder){
                    par=par+2;
                    i++;
                }
                if(i>2){
                    i--;
                }

                aux--;
            }

        }
        System.out.println("parejas "+par);

    }

    //don't work
    public int thirdSolution(String a, int start, int end, int res){
        System.out.println("start "+start);
        System.out.println("end "+end);
        System.out.println("sal "+res+"\n");
        char left = '(';
        char right = ')';

        if(start<end){
            if(a.charAt(start)==left && a.charAt(start+1)==left){
                if(a.charAt(end)==right){
                    res = res + 2;
                    res = thirdSolution(a,start+1,end-1, res);
                }else{
                    res = thirdSolution(a,start,end-1, 0);
                }
            }else{
                res = thirdSolution(a,start+1,end, res);
            }
        }

        return res;
    }

    //don't work
    public int ultimoultimo(String a, int start, int end, int res){
        System.out.println("start "+start);
        System.out.println("end "+end);
        System.out.println("sal "+res+"\n");
        char left = '(';
        char right = ')';

        if(start<end){
            if(a.charAt(start)==left && a.charAt(start+1)==left){
                if(a.charAt(end)==right){
                    res = res + 2;
                    res = ultimoultimo(a,start+1,end-1, res);
                }else{
                    res = ultimoultimo(a,start,end-1, 0);
                }
            }else if((a.charAt(start)==left && a.charAt(start+1)==right)){
                res = res + 2;
               res = ultimoultimo(a,start+2,end, res);
            }else{
                res = ultimoultimo(a,start+1,end, res);
            }
        }
        return res;
    }

    public int FinalProblem(String s){
        char left = '(';
        Stack<Integer> stack = new Stack<>();
        int sal= 0, start = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)==left){
                stack.push(i);
            }else{
                if (stack.empty()){
                    start= i+1;
                }else{
                    stack.pop();
                    if(stack.isEmpty()){
                        sal = Math.max(sal, i - start + 1);
                    }else{
                        sal = Math.max(sal, i - stack.peek());
                    }
                }
            }
        }
        return sal;
    }

    /*
        String s = "(()";
        ImposibleProblem imposibleProblem = new ImposibleProblem();
        int sal = imposibleProblem.FinalProblem(s);
        System.out.println("longest is: "+ sal);
    */





}
