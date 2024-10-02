class multi_array {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];//decleration and instantiation
         arr[0][0] = 1;
         arr[0][1] = 2;   //inititalization
         arr[0][2] = 3;
         arr[0][3] = 4;
         arr[1][0] = 5;
         arr[1][1] = 6;
         arr[1][2] = 7;
         arr[1][3] = 8;
         arr[2][0] = 9;
         arr[2][1] = 10;
         arr[2][2] = 11;
         arr[2][3] = 12;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}

// class multi_array {
//     public static void main(String[] args) {
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};//decleration instantiation and initialization at the same time
//         for(int i=0; i<3; i++ ){
//             for(int j = 0; j<3; j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }