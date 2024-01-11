package leetcode.No21MergeTwoSortedLists;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      @Override
      public String toString() {
            if (next == null) return Integer.toString(val);
            return Integer.toString(val).concat(" ").concat(next.toString());
      }
}
