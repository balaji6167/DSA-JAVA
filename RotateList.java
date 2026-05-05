// (leetcode): 61. Rotate List
// Given the head of a linked list, rotate the list to the right by k places.

// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// Example 2:

// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 
// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 10^9

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 1;
        if(head==null || k==0) return head;
        ListNode tail = head;
        while(tail.next!=null){
            length++;
            tail = tail.next;
        }
        if(k%length==0) return head;
        k = k%length;
        tail.next = head;
        ListNode newLastnode = findkthnode(head,length-k);
        head = newLastnode.next;
        newLastnode.next = null;
        return head;
    }
    public ListNode findkthnode(ListNode temp,int k){
        int count = 1;
        while(temp!=null){
            if(count==k) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }
}