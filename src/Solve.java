import java.util.Stack;

public class Solve {

    public int[] previosSmall(int[] arr ) {

        Stack<Integer> stack = new Stack<>();
        int n=arr.length;
        int[] ans =new int[n];

        for(int i=0;i< arr.length ; i++){

            while(!stack.empty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.empty()){
                ans[i]=-1;
            }
            else {
                ans[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;


    }

    public static void main(String[] args) {

        Solve solve = new Solve();
        int[] arr = {4,5,2,10,6,8,7};

        int[] result = solve.previosSmall(arr);
        for(int i=0;i< result.length ;i++){
            System.out.println(result[i]);
        }

    }
}

