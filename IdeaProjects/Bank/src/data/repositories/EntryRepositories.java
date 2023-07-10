package data.repositories;

import data.models.Entry;

import java.util.List;

public interface EntryRepositories {
Entry save(Entry entry);
Entry findById(int id);
List<Entry> findAll();
void  delete(int id);
void  delete(Entry entry);
void deleteAll();

int count();
}
