
215. Kth Largest Element in an Array
230. Kth Smallest Element in a BST
347. Top K Frequent Elements


Solution one：
quicksort
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
