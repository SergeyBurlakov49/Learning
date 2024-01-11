package leetcode.No83RemoveDuplicatesFromSortedList;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        head.next = deleteDuplicates(head.next, head.val);
        return head;
    }

    public static ListNode deleteDuplicates(ListNode head, int x) {
        if (head.next == null && head.val == x) return null;
        if (head.val == x) return deleteDuplicates(head.next, x);
        if (head.next != null) head.next = deleteDuplicates(head.next, head.val);
        return head;
    }



    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(2))));
    }
}
