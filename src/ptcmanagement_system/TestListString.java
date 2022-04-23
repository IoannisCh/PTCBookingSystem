package ptcmanagement_system;

public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists();
        Student stud1 = new Student ("");
        
       
       
        ls.join(stud1);
       
        
        
        return ls;
    }
    
   /* public static String[] getTitlesFromList(Lists ls){
        String[] titles = new String[ls.size()+1];
        System.out.println(ls.size());
        for (int i=0; i<=ls.size(); i++){
            titles[i] = ls.get(i).getTitle();
        }
        return titles;
    }*/
    
   /* public static void printList(Lists ls){
        for (int i=0; i<=ls.size(); i++){
            if (ls.get(i).getOnLoan() == true){
                 System.out.println ("Item: " + ls.get(i).getId());
            } else {
                 System.out.println ("Item: " + ls.get(i).getId());
            }
        }
        System.out.println(ls.size());
    }*/
    
    /*public static void testAdd (String[] args) 
    {
        Lists ls = populateList();
        String[] titles = getTitlesFromList(ls);
        printList(ls);
    }*/
    
    /*public static void testDelete (String[] args){
       Lists ls = populateList();
       printList(ls);
       String[] titles = getTitlesFromList(ls);
       int index = ls.binarySearch(titles, "");
       ls.delete(index);
       printList(ls);
    }*/
}
