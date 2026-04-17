class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int index = length - n - 1;

        if (index < 0) {
            return head.next;
        }

        temp = head;
        while (index-- > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}