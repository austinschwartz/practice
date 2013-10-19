public class MooresVotingAlgo {
    
    public static int findCandidate(int[] arr) {
        int majority_index = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[majority_index])
                count++;
            else
                count--;
            if (count == 0) {
                majority_index = i;
                count = 1;
            }
        }
        return arr[majority_index];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 10, 9, 10, 10, 2, 5, 4, 4, 10};
        System.out.println(findCandidate(arr));
    }
}