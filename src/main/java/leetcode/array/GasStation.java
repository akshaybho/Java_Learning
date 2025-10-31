package leetcode.array;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;

        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalCost > totalGas){
            return -1;
        }
        int pos = 0;
        int sum = 0;
        for(int i=0; i<gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                sum = 0;
                pos = i+1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {

        int []a = {1, 2, 3, 4, 5};
        int []b = {3, 4, 5, 1, 2};

        int result = canCompleteCircuit(a, b);
        System.out.println(result);
    }
}
