package lcwu;

public class Solution167 {

        public int[] twoSum(int[] numbers, int target) {
            for(int i =0;i<numbers.length;i++){
                for(int j =i+1;j<numbers.length;j++){
                    if(target-numbers[j]==numbers[i])return new int[]{i+1,j+1};
                }
            }
            return null;
        }
}

