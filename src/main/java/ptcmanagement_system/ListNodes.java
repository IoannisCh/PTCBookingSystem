

package ptcmanagement_system;

public class ListNodes {
    private ListNodes next;
    private Student data;

    public ListNodes (ListNodes next, Student data) {
        this.next = next;
        this.data = data;
    }

    public ListNodes getNext () {
        return next;
    }

    public void setNext (ListNodes next) {
        this.next = next;
    }

    public Student getData () {
        return data;
    }

    public void join (Student data) {
        ListNodes current = this;

        while (current.getNext () != null) {
            current = current.getNext ();
        }

        current.setNext (new ListNodes (null, data));           
    }

    public Student get (int i) {
        ListNodes current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public void set (Student data, int i) {
        ListNodes current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        
        throw new ArrayIndexOutOfBoundsException (i);
    }

    public ListNodes insert (Student data, int index) {
        ListNodes current = this;
        int currentIndex = 0;
        if (index < 0) { 
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ListNodes (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ListNodes insertedNode = new ListNodes (current.getNext(), data); 
                current.next = insertedNode;                                    
                return this;    
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public ListNodes delete (int index) {
        ListNodes current = this;
        int currentIndex = 0;

        if (index == 0) { 
            return next;
        }

            while (current != null) {
            if (currentIndex+1 == index) {
                current.setNext ( current.getNext().getNext());
                return this; 
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        
        throw new ArrayIndexOutOfBoundsException (index);  
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNodes current = this;

        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }

        result += "]";

        return result;
    }
}