/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;


public class Student {
  private String name;
    
    public Student(String newName) {
        this.name = newName;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }
}  

