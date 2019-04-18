package Hashing;

public class HashMap {

    class Node{

        //Node next;
        Integer key;
        String data;
        final int hash;
        Node(String v,Integer k){
            key = k;
            data = v;
            hash = k.hashCode();

        }
    }

    Node[] table = new Node[16];

    public Object put(Integer k,String d) {
        Node newnode = new Node(d, k);
        if (k == null) {
            //putForNullKey();
            return null;
        }

        int index = newnode.hash % 16;
        Node obj;
        if(table[index] == null){

            table[index] = newnode;
        return null;
        }

        for(obj = table[index];obj.next != null;obj = obj.next)
        {
            if(((Node) obj).hash == newnode.hash && obj.key == newnode.key || k.equals(obj.key)){
                String oldvalue = obj.data;
                obj.data = d;
                return oldvalue;
            }

        }




            obj.next = newnode;

        return null;
    }

    public Node get(Integer k){

        Node obj;
        int hash = k.hashCode();
        for(obj = table[hash % 16];obj != null;obj = obj.next)
        {
            if(obj.key == k){return obj;}
        }
        return null;

    }
public static void main(String[] args){

        HashMap hm = new HashMap();
        hm.put(4,"Four");
        hm.put(1,"one");
}
}
