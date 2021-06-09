class BinarySearch {
  public BinarySearch() {
    System.out.println("Binary Search Started : ");
  }
  public int binarySearch(int[] arr , int size , int left , int right , int target) {
    int mid = left + (right -left)/2;

    if (arr[mid] == target)
      return mid;
    
    if ( arr[mid] < target )
      return binarySearch(arr,size,mid+1,right,target);

    if ( arr[mid] > target )
      return binarySearch(arr,size,left,mid-1,target);
    
    return -1;
  }
  
}