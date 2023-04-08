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
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        
        
         ListNode l3= new ListNode(0);
        ListNode head=l3;
        int carry=0;
        while(first!=null && second!=null)
        {
            int value= first.val+second.val+carry;
            carry=value/10;
            l3.next=new ListNode(value%10);
            l3=l3.next;
            first=first.next;
            second=second.next;
        }
        
        while(first!=null)
        {
            int value=first.val+carry;
            carry=value/10;
            l3.next=new ListNode(value%10);
            l3=l3.next;
            first=first.next;
        }
         while(second!=null)
        {
            int value=second.val+carry;
            carry=value/10;
            l3.next=new ListNode(value%10);
            l3=l3.next;
            second=second.next;
        }
        if(carry!=0)
        {
            l3.next=new ListNode(carry);
        }
        return head.next;
        
    }
}