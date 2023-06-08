package List;

public class Mylist {
    private int count;
    private String [] listElement;

    public Mylist(int size) {
        listElement = new String[size];
    }

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    public void add(int index, String element) {
        listElement[index] = element;
        count++;
    }

    public void add(String element) {
        listElement[count] = element;
        count++;
    }

    public int size() {
        return count;
    }

    public void clear() {
        listElement[count] = String.valueOf(0);
        count = 0;

        }

    public void removeIndex(int index) {
        listElement[index] = String.valueOf(0);
        count--;

    }

    public void removeElement(String element) {
        for (int index = 0; index < listElement.length; index++) {
            if (element ==listElement[index] ){
                element = String.valueOf(0);
                count--;
            }
        }
    }

    public String getIndex(int index) {
    return listElement[index];
    }

    public void setList(int index, String element) {
        listElement[index] = element;
    }

    public int indexOf(String element) {
        for (int count = 0; count < listElement.length; count++) {
        if (listElement[count] == element) {
            return count;
        }}
        return -1;
    }

    public int lastIndexOf(String element) {
        for (int count = listElement.length -1; count > 0; count--) {
            if (listElement[count] == element){
                return count;
            }}
            return -1;

        }

    public boolean equalElement(String element) {
        for (int count = 0; count < listElement.length; count++) {
        if (listElement[count] == element) {
        }}
        return true;
    }

    public boolean contains(String element) {
        for (int count = 0; count < listElement.length; count++) {
            if (listElement[count] == element)return true;
        }
        return false;
    }
    public String getElement(int index){
        return listElement[index];
    }
}


