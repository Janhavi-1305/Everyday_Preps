import java.util.Arrays;
class LinearSerach{
    public static void main(String[] args){
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56,12},
            {7,5,2}
        };
        int target=18;
        int[] result=search(arr,target); 
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] search(int[][] matrix,int target){
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==target){
                   return new int[]{i,j};
               }
           }
       }       return new int[]{-1,-1};
    }
}