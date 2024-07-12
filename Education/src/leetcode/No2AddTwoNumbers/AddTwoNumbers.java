package leetcode.No2AddTwoNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class AddTwoNumbers {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            List<ListNode> listNodes = new ArrayList<>();
//            addTwoNumbers(l1,l2,listNodes);
//            for (int i = 0; i < listNodes.size() - 1; i++){
//                if (listNodes.get(i).val >= 10){
//                        listNodes.get(i).val -= 10;
//                        listNodes.get(i + 1).val++;
//                }
//            }
//            if(listNodes.get(listNodes.size() - 1).val >= 10){
//                listNodes.get(listNodes.size() - 1).val -= 10;
//                listNodes.get(listNodes.size() - 1).next = new ListNode(1);
//            }
//            return listNodes.get(0);
//        }
//
//        public static ListNode addTwoNumbers(ListNode l1, ListNode l2, List<ListNode> listNodes) {
//            ListNode listNode = new ListNode(l1.val + l2.val);
//            listNodes.add(listNode);
//            if (l1.next != null && l2.next != null) listNode.next = addTwoNumbers(l1.next,l2.next,listNodes);
//            else if (l1.next != null) {
//                listNode.next = l1.next;
//                listNodeLoop(l1.next, listNodes);
//            }
//            else if (l2.next != null) {
//                listNode.next = l2.next;
//                listNodeLoop(l2.next, listNodes);
//            }
//            return listNode;
//        }



    public static void main(String[] args) {
        printNode(new AddTwoNumbers().addTwoNumbers(listNodeGenerate(9,9,9,9,9,9,9), listNodeGenerate(9,9,9,9)));
    }

    public static void printNode(ListNode listNode){
        System.out.print(listNode.val + " ");
        if (listNode.next != null) printNode(listNode.next);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return addTwoNumbers(l1,l2,0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        ListNode listNode = new ListNode(l1.val + l2.val + add);
        if (l1.next != null && l2.next != null) {
            if (listNode.val >= 10) {
                listNode.val -= 10;
                listNode.next = addTwoNumbers(l1.next, l2.next, 1);
            } else {
                listNode.next = addTwoNumbers(l1.next, l2.next, 0);
            }
        } else if (l1.next != null) {
            if (listNode.val >= 10) {
                listNode.val -= 10;
                listNode.next = listNodeLoop(l1.next, 1);
            } else {
                listNode.next = listNodeLoop(l1.next, 0);
            }
        } else if (l2.next != null) {
            if (listNode.val >= 10) {
                listNode.val -= 10;
                listNode.next = listNodeLoop(l2.next, 1);
            } else {
                listNode.next = listNodeLoop(l2.next, 0);
            }
        } else {
            if (listNode.val >= 10) {
                listNode.val -= 10;
                listNode.next = new ListNode(1);
            }
            return listNode;
        }
        return listNode;
    }

    public static ListNode listNodeLoop(ListNode l, int add){
        ListNode listNode = new ListNode(l.val + add);
        if (l.next == null) {
            if(listNode.val >= 10){
                listNode.next = new ListNode(1);
                listNode.val -= 10;
            }
        }
        else{
            if(listNode.val >= 10) {
                listNode.next = listNodeLoop(l.next, 1);
                listNode.val-=10;
            }
            else {
                listNode.next = listNodeLoop(l.next, 0);
            }

        }
        return listNode;
    }

    public static ListNode listNodeGenerate(Integer ... vals){
        ListNode listNode = new ListNode(vals[0]);
        if (vals.length > 1){
            listNode.next = listNodeGenerate(Stream.of(vals).skip(1).toArray(Integer[]::new));
        }
        return listNode;
    }
}
