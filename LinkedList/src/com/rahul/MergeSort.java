package com.rahul;

public class MergeSort {

    private ListNode head;
    private ListNode tail;
    private int size;
    private MergeSort next;

    public MergeSort(){
        this.size = 0;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(head);

        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(list1 != null && list2 != null){
            if(list1.value < list2.value){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        //if one of the list gets complete then add the another list to the new list(i.e., we've' created to store sorted values).
        if(list1 != null){
            tail.next = list1;
        }else if(list2 != null){
            tail.next = list2;
        }
        return dummyHead.next;
    }

    ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }



    public class ListNode {

        private int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }

        public ListNode() {

        }
    }
}
