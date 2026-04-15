class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode root = new ListNode(); 
        ListNode tail = root;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return root.next;
    }
}