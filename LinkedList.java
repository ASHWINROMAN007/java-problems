public class LinkedList {
    class node{
        int data;
        node next;
        node(int d)
        {
            data = d;
            next = null;
        }
    }
    node head;
    public void inserte(int d)
    {
       node i = new node(d);
       if(head == null)
       {
        head = i;
        return;
       } 
       node c = head;
       while(c.next!=null)
       {
        c = c.next;
       }
       c.next = i;
    } public void insertm(int i , int d)
    {
        node n = new node(d);
        node c = head;
        int it = 0;
        while(it<i-1)
        {
            c=c.next;
            it++;
        }
        n.next = c.next;
        c.next=n;
    

    }
    public void inserts(int a)
    {
        node n = new node(a);
        node e = head;
        n.next=e;
        head=n;
    }
        public void change(int a, int b) {
    if (a == b) return;

    node prevA = null, currA = head;
    while (currA != null && currA.data != a) {
        prevA = currA;
        currA = currA.next;
    }

    node prevB = null, currB = head;
    while (currB != null && currB.data != b) {
        prevB = currB;
        currB = currB.next;
    }
    if (currA == null || currB == null) return;
    if (prevA != null) {
        prevA.next = currB;
    } else {
        head = currB;
    }
    if (prevB != null) {
        prevB.next = currA;
    } else {
        head = currA;
    }
    node temp = currA.next;
    currA.next = currB.next;
    currB.next = temp;
}
   
    public void reverse()
    {
        node p = null;
        node c = head;
        node n = null;
        while(c!=null)
        {
            n = c.next;
            c.next = p;
            p = c;
            c = n; 

        }
        head = p;
        display();

    }
    public void delete(int d)
    {
        node c = head,prev = null;
        if(c.data==d)
        {
            head = c.next;
            return;
        }
        while(c!=null && c.data!=d){
            prev=c;
            c=c.next;
        }
        prev.next = c.next;

    }
    public void display()
{
    node c = head;
    if(c==null)
    {
        System.out.println("empty");
        return;
    }
    while(c!=null)
    {
        System.out.print(c.data);
        c=c.next;

    }
}
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.inserte(4);
        l.inserte(5);
        l.inserte(6);
        l.inserte(7);
        l.insertm(2,8);
        l.inserts(12);
        l.display();
        l.change(4,8);
        System.out.println(" ");
        l.display();
    }
}
