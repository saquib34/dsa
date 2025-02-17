class Solution {
    public int[] reverse(int [] arr){
        int n=arr.length;
        for (int i=0;i<arr.length/2;i++){
            int t= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        return arr;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i]=reverse(matrix[i]);
        }        
    }
}