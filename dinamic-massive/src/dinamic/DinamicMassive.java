

package dinamic;

public class DinamicMassive {
    
    
    private String[] massive;
    private int size;

    public DinamicMassive(int size) {
        this.size = size;
        massive = new String[size];
    }

    public int getSize() {
        return size;
    }
    
    public String get(int index) {
        if(index >= size && index < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        return massive[index];
    }
    
    public void set(int index, String value) {
        if(index >= size && index < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        massive[index] = value;
    }
    
    public void add(String value) {
        if(size + 1 > massive.length) {
            resize(size+10);
        }
        massive[size++] = value;
    }
    
    private void resize(int size) {
        String[] buffer = new String[size];
        for(int i =0; i < massive.length; i++) {
            buffer[i] = massive[i];
        }
        massive = buffer;
    }
    
}
