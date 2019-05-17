//493. Reverse Pairs
 public int reversePairs(int[] nums) {
        if(nums==null||nums.length<=0) return 0;
        return mergesort_and_count(nums,0, nums.length - 1);
    }

int mergesort_and_count(int[] nums, int start, int end)
{
    if (start == end) 
    {
     return 0;
    }
        int mid = (end+start) / 2;
        int count = mergesort_and_count(nums,start, mid)+mergesort_and_count(nums,mid + 1, end);
      int i=mid,j=end;
    while (i >= start&& j>=mid+1) {
        
            if ( nums[i] > nums[j] * 2L)
            {  count += j - mid;
                i--;}
        else
            j--;
        }
        
    merge(nums,start,mid,end);
        return count;
    
}
void merge(int[] nums ,int start,int mid,int end){
    int[] L=new int[mid-start+1];
     int[] R=new int[end-mid];
    
    for(int i=0;i<mid-start+1;i++){
        L[i]=nums[start+i];
    }
    for(int i=0;i<end-mid;i++){
        R[i]=nums[i+mid+1];
    }
    int i=0,j=0,k=start;
        while(i<mid-start+1 &&j<end-mid)
        {  if(L[i]<R[j])
        nums[k++]=L[i++];
        else 
            nums[k++]=R[j++];
        }
         while(i<mid-start+1)
        { 
        nums[k++]=L[i++];
        }
        while(j<end-mid)
        { 
        nums[k++]=R[j++];
    }
     
}
