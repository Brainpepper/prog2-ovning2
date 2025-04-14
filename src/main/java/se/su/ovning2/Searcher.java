package se.su.ovning2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Searcher implements SearchOperations {

  private final Collection<Recording> recordings;

  public Searcher(Collection<Recording> data) {
    this.recordings = data;
  }

  @Override
  public long numberOfArtists() {
    // använder hashset för att vi inte bryr oss om sortering
    Set<String> uniqueArtists = new HashSet<>();

    for (Recording r : recordings) {
      uniqueArtists.add(r.getArtist());
    }

    return uniqueArtists.size();
  }

  @Override
  public long numberOfGenres() {
    // använder hashset för att vi inte bryr oss om sortering
    Set<String> uniqueGenres = new HashSet<>();

    for (Recording r : recordings) {
      uniqueGenres.addAll(r.getGenre());
    }

    return uniqueGenres.size();
  }

  @Override
  public long numberOfTitles() {
    // använder hashset för att vi inte bryr oss om sortering
    Set<String> uniqueTitles = new HashSet<>();

    for (Recording r : recordings) {
      uniqueTitles.add(r.getTitle());
    }

    return uniqueTitles.size();
  }

  @Override
  public boolean doesArtistExist(String name) {
    // hashSet för att vi bryr oss inte om sortering och för att vi behöver hitta
    // ett namn
    Set<String> uniqueArtists = new HashSet<>();

    for (Recording r : recordings) {
      uniqueArtists.add(r.getArtist());
    }

    return uniqueArtists.contains(name);

  }

  @Override
  public Collection<String> getGenres() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}
