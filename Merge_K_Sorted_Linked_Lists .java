class Solution {
    public static Node merge(Node head1, Node head2) {
        Node d1 = new Node(-1);
        Node t = d1;
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                t.next = t1;
                t = t.next;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            t.next = t1;
        } else if (t2 != null) {
            t.next = t2;
        }
        return d1.next;
    }

    Node mergeKLists(Node[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        
        while (n > 1) {
            Node a = arr[n - 1];
            Node b = arr[n - 2];
            Node c = merge(a, b);
            arr[n - 2] = c; 
            n = n - 1;
        }
        
        return arr[0];
    }
}
