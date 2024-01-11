package leetcode.No21MergeTwoSortedLists;
import java.util.*;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        bullShit(arrayList, list1);
        bullShit(arrayList, list2);
        arrayList.sort(Integer::compareTo);
        Iterator <Integer> iterator = arrayList.iterator();
        if (!iterator.hasNext()) return null;
        ListNode head = new ListNode(iterator.next());
        bullshit2(head, iterator);
        return head;
    }

    public static void bullShit(ArrayList<Integer> arrayList, ListNode listNode){
        if (listNode != null) {
            arrayList.add(listNode.val);
            if (listNode.next != null) bullShit(arrayList, listNode.next);
        }
    }

    public static void bullshit2(ListNode listNode, Iterator<Integer> iterator){
        if (iterator.hasNext()){
            listNode.next = new ListNode(iterator.next());
            bullshit2(listNode.next, iterator);
        }
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4)))));
    }
}
