class array_demo {
    public static void main(String args[]){
        int arr[] = new int[5]; //array declaration and instantiation
        arr[0] = 20;
        arr[1] = 21;
        arr[2] = 22;
        arr[3] = 23;
        arr[4] = 24;
       
        System.out.println("The array elemenys are: ");
        for(int x:arr){
            System.out.println(x);  //for each loop to print array elements
        }
    
    }    
}
