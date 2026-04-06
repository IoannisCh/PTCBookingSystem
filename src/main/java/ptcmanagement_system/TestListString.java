package ptcmanagement_system;

public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists();
        Student s = new Student("TestName", "Other", 20000101, "123 Test St", 000, 1);
        
       
       
        ls.join(s);
       
        
        
        return ls;
    }
    
   
}
