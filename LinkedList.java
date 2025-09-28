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
    public void insert(int d)
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
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.delete(7);
        l.display();
    }
}
