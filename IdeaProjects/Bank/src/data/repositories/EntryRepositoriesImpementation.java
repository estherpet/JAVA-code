package data.repositories;

import data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoriesImpementation implements EntryRepositories{
   private  List <Entry> entries = new ArrayList<>();
    private int counter =1;
    @Override
    public Entry save(Entry entry) {
        if (entry.getId()==0) {
        entries.add(entry);
        entry.setId(generateID());
        }
        else {
            entries.set(entry.getId(), entry);
        }
        return entry;
    }
    @Override
    public Entry findById(int id) {
        for (Entry entry: entries) {
            if (entry.getId() == id)return  entry;}
        return null;
    }

    private int generateID () {
        return  counter++;
    }

    @Override
    public List<Entry> findAll() {
        return entries;
    }

    @Override
    public void delete(int id) {
        for (Entry entry : entries) {
            if (entry.getId()==id) {
                entries.remove(id);

            }
        }
    }
    public void delete(Entry entry) {
        Entry entry1 = findById(entry.getId());
        entries.remove(entry1);
    }

    @Override
    public void deleteAll() {
entries.clear();
    }

    @Override
    public int count() {
        return entries.size();
    }
}
