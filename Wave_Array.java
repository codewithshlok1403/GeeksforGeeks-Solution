class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
        int temp;
        for(int i=0;i<arr.length;i+=2){
            if(i==n-1)break;
            else{
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
