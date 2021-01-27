

package dinamic;


public class Main {
    
    public static void main(String[] args) {
        
        String[] mass = new String[] {"1","2","3"};
        
        DinamicMassive dm = new DinamicMassive(0);
        
        for(int i=0; i < mass.length; i++) {
            dm.add(mass[i]);
        }
        
        for(int i=0; i < dm.getSize(); i++) {
            System.out.println(dm.get(i));
        }
    }
    
}
