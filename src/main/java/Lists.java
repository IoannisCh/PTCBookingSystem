package ptcmanagement_system;

public class Lists {
    private ListNodes head;
    private int count;
    public Lists () {
        head = null;
        count = 0;
    }
    
    public void join (Student data) {
        if (head == null) {      
            head = new ListNodes (null, data);
            return;              
        } else {
            head.join (data);
            count ++;
        }
    }

    public Student leave () {
        if (head == null) {
            return null;
        } else {
            Student result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public Student get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }

    public void set (Student data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set (data, index);
        }
    }

    public void insert (Student data, int index) {  
        if (head == null) {
            join (data);
        } else {
            head = head.insert (data, index);
        }
    }

    public void delete (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            count--;
            head = head.delete (index);
        }
    }

    public String toString () {
        if (head == null) {
            return "[]";
        } else {
            return head.toString ();
        }
    }
    
    public int size (){
        if (head == null){
            return 0;
        } else {
            return count;
        }
    }
    
    public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid].compareTo(x) > 0) {
                low = mid + 1;
                
            } else if (a[mid].compareTo(x) < 0) {
                high = mid - 1;
                
            } else {
                return mid;
            }
        }

        return -1;
    }
}