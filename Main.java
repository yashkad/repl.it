class Main {
  public static void main(String[] args) {
    
    BinarySearch b = new BinarySearch();
    
    int[] arr = {1,2,3,4,5,10,100,200,400};
    int size = arr.length;
    int target = 100;

    int indexResult= b.binarySearch(arr,size,0,size-1,target);

    if(indexResult!=-1)
      System.out.println(target+" found at index : "+indexResult);
    else
    System.out.println(target+" Not found in arrray");

  }
}