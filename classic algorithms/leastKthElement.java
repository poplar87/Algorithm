
215. Kth Largest Element in an Array
230. Kth Smallest Element in a BST
347. Top K Frequent Elements


Solution one：
quicksort
 public int findKthLargest(int[] nums, int k) {
        int l=0,h=nums.length-1;
        int j=partition(nums,nums.length,l,h);
        k=nums.length-k;
        while(j!=k){
            if(j<k)l=j+1;
            else if(j>k)h=j-1;
            j=partition(nums,nums.length,l,h);
        }
        return nums[k];
    }
    public int partition(int[] nums,int len,int l,int h){
        if(nums==null||len<=0||l<0||h>=len) return 0;
        //int pivort=nums[h];
        int pivort = new Random().nextInt(h-l+1) + l;
        swap(nums,pivort,h);
        int i=l-1;
        for(int j=l;j<h;j++){
            if(nums[j]<nums[h])
            {i++;
            swap(nums,i,j);
            }
        }
        ++i;
        swap(nums,i,h);
        return i;
    }
    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

Solution two：
public int findKthLargest(int[] nums, int k) {
    final PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length,new Comparator<Integer>(){
        @Override
       public int compare(Integer i1,Integer i2){
            return i2-i1;//maximum heap findLeastKElements;default is minheap i1-i2 min heap  findLargestKElements
        }
        
    });
    for(int val : nums) {
        pq.offer(val);

        if(pq.size() > k) {
            pq.poll();// remove the max element  for every poll action;
        }
    }// leave the least k elements
        int l=pq.size();
        for(int i=0;i<l;i++){
            System.out.println(pq.poll());
        }
        return 0;
   // return pq.peek();
    }
    


