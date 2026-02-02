package leetcode.slidingwindow;

public class FruitsIntoBasket2 {

    public static int numOfUnplacedFruits(int []fruits, int []baskets){

        int n = fruits.length;
        int unplaced = 0;
        boolean []used = new boolean[n];

        for(int i=0; i<n; i++){

            boolean placed = false;
            for(int j=0; j<n; j++){

                if(!used[j] && baskets[j] >= fruits[i]){
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                unplaced++;
            }
        }
        return unplaced;
    }

    public static void main(String[] args) {

        int []a = {4, 2, 5};
        int []b = {3, 5, 4};

        int result = numOfUnplacedFruits(a, b);
        System.out.println(result);
    }
}
