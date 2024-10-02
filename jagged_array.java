 class jagged_array {
    public static void main(String[] args) {
        //array decleration and instantiation
        int jaggedArr [][] = new int[3][]; //only need to give the number of rows

        jaggedArr[0] = new int[2];
        jaggedArr[1] = new int[4];
        jaggedArr[2] = new int[3];

        jaggedArr[0][0] = 1;
        jaggedArr[0][1] = 2;
        jaggedArr[1][0] = 3;
        jaggedArr[1][1] = 4;
        jaggedArr[1][2] = 5;
        jaggedArr[1][3] = 6;
        jaggedArr[2][0] = 7;
        jaggedArr[2][1] = 8;
        jaggedArr[2][2] = 9;
        
        for(int i=0;i<jaggedArr.length; i++){
            for(int j=0;j<jaggedArr[i].length; j++){
                System.out.print(jaggedArr[i][j]);
            }
            System.out.println();
        }
    }    
}
