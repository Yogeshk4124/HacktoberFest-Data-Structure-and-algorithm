import java.util.* ;
import java.util.Scanner;

public static Boolean binarySearch(int[] arr, int n){

int start=0 ,end=arr.length-1,mid=arr.length/2;

if(arr.length==0){
    return false;
}
for(int i=0;i<arr.length;i++){
    mid=(start+end)/2;
    if(n>arr[mid]) start=mid+1;
    
    else if(n<arr[mid]) end=mid-1;
    
    else return true;
}
return false;
}

