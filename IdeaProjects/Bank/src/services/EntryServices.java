package services;

import data.models.Entry;
import dto.Response;

public interface EntryServices {
void addEntry(Response entryDto);
void deleteEntry(int id);
Response findEntryByTitle(Response title);
void updateEntry();
int numberOfEntry();
}
