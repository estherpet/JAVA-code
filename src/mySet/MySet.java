package mySet;

import List.Mylist;

public class MySet{

    Mylist mylist = new Mylist(5);


    public void add(String element) {

       if (!mylist.contains(element)) {
        mylist.add(element);}
    }


    public int getSize() {
        return mylist.size();
    }

    public void clear() {
        mylist.clear();
    }

    public boolean contain(String element) {
        mylist.contains(element);
        return true;
    }

    public boolean isEmpty() {
        mylist.isEmpty();
        return true;
    }

    public String[] toArray() {
        String [] setArray  = new String[mylist.size()];
        for (int count = 0; count < mylist.size(); count++) {
            setArray [count] = mylist.getElement(count);
        }
        return setArray;

    }
}
