class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode i = head;
        ListNode j = head.next;
        
        while(j!=null)
        {
            if(i.val<=j.val)
            {
                i = j;
                j = j.next;
            }
            else{
                ListNode cur = head;
                ListNode prev = null;
                i.next = j.next;
                while(cur.val<j.val)
                {
                    prev = cur;
                    cur = cur.next;
                }
                j.next = cur;
                if(prev==null)
                {
                    head = j;
                }
                else{
                    prev.next = j;
                }
                j = i.next;
            }
        }
        
        return head;
    }
}
