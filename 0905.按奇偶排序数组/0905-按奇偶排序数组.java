class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length == 1){return A;}
        int i = 0;
        int j = A.length - 1;
        while(i < j){
            if(A[i] % 2 == 0){
                i++;
                continue;
            }
            if(A[j] % 2 != 0){
                j--;
                continue;
            }
            
            int tem = A[i];
            A[i] = A[j];
            A[j] = tem;
            i++;
            j--;
        }
		return A;
    }
}