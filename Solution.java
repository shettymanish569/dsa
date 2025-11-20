public class Solution{
public static int secondMaxUniqueElem(int nums[], int n){
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(nums[i]>max){
            secondMax=max;
            max=nums[i];
        }
        else if(nums[i]>secondMax && nums[i]!=max){
            secondMax=nums[i];
        }
        
    }
    if(secondMax==Integer.MIN_VALUE){
        return -1;
    }
    return secondMax;
}

public static void main(String[] args) {
    int nums[]={3, 5, 2, 5, 6, 6, 1};  // output is 5
    int n=7;
    int max1=secondMaxUniqueElem(nums, n);
    System.out.println(max1);
}
}