 package services;

import data.models.Entry;
import data.repositories.EntryRepositories;
import data.repositories.EntryRepositoriesImpementation;
import dto.Response;

public class EntryServiceImplementation implements EntryServices{
   private  EntryRepositories entryRepositories = new EntryRepositoriesImpementation();
    @Override
    public void addEntry(Response entryDto) {
        Entry entry = new Entry();
        entry.setTitle(entryDto.getTitle());
        entry.setBody(entryDto.getBody());
        entryRepositories.save(entry);
//        System.out.println(entry.getId());


    }
    @Override
    public void deleteEntry(int id) {
        Entry entry = entryRepositories.findById(id);
        entryRepositories.delete(entry);

    }

    @Override
    public Response findEntryByTitle(Response title) {
        for (Entry entry: entryRepositories.findAll()){
            if (entry.getTitle() == title)
        }
        return null;
    }

    @Override
    public void updateEntry() {

    }

    @Override
    public int numberOfEntry() {
        return entryRepositories.count();
    }
}
