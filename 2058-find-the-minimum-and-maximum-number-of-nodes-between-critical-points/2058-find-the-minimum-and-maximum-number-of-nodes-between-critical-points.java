/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        {
            return new int[]{-1,-1};
        }
       ListNode prev=null;
       ListNode h=head;
       ListNode next=head.next;
       int i=1;
       List<Integer>list=new ArrayList<>();
       while(next!=null)
       {
        if(prev!=null&&next!=null)
        {
            if((h.val>prev.val&&h.val>next.val)||h.val<prev.val&&h.val<next.val)
            {
                list.add(i);
            }
        }
        prev=h;
        h=next;
        next=next.next;
        i++;
       }
       if(list.size()<2)
       {
         return new int[]{-1,-1};
       }
       int maxi=list.get(list.size()-1)-list.get(0);
       int mini=Integer.MAX_VALUE;
       for(int j=0;j<list.size()-1;j++)
       {
        mini=Math.min(mini,list.get(j+1)-list.get(j));
       }
       return new int[]{mini,maxi}; 
    }
}