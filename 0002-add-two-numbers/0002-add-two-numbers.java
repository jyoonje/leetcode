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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        while (l1 != null) {
            num1.insert(0, l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            num2.insert(0, l2.val);
            l2 = l2.next;
        }

        String s1 = num1.toString();
        String s2 = num2.toString();

        StringBuilder sum = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int x = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int cur = x + y + carry;

            sum.append(cur % 10);
            carry = cur / 10;

            i--;
            j--;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for (int k = 0; k < sum.length(); k++) {
            cur.next = new ListNode(sum.charAt(k) - '0');
            cur = cur.next;
        }

        return dummy.next;
    }
}