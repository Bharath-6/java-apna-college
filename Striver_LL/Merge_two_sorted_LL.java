package Striver_LL;

public class Merge_two_sorted_LL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dumm = new ListNode(-1);
        ListNode temp = dumm;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            temp.next = t1;
        }
        else{
            temp.next = t2;
        }
        return dumm.next;
    }
}
