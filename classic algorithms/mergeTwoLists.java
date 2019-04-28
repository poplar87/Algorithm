/**

21. Merge Two Sorted Lists
*/
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<l2.val){
            ListNode ll1=l1.next;
            l1.next=mergeTwoLists(ll1,l2);
            return l1;
        }
        else{
            ListNode ll2=l2.next;
            l2.next=mergeTwoLists(l1,ll2);
            return l2;
        }
    }
/**

88. Merge Sorted Array
*/
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]<=nums2[j])nums1[k--]=nums2[j--];
            else nums1[k--]=nums1[i--];
        }
         // while(i>=0){
         //    nums1[k--]=nums1[i--]; 
         // }
        while(j>=0){
            nums1[k--]=nums2[j--]; 
         }
    }
