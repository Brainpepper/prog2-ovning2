package se.su.ovning2;

import java.util.Collection;
import java.util.Set;

public class Recording implements Comparable<Recording> {
  private final int year;
  private final String artist;
  private final String title;
  private final String type;
  private final Set<String> genre;

  public Recording(String title, String artist, int year, String type, Set<String> genre) {
    this.title = title;
    this.year = year;
    this.artist = artist;
    this.type = type;
    this.genre = genre;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Recording)) {
      return false;
    }

    Recording r = (Recording) obj;
    return (this.year == r.getYear() && this.artist.equals(r.getArtist())
        && this.title.equals(r.getTitle()));
  }

  @Override
  public int compareTo(Recording r) {
    if (this.year == r.getYear()) {
      return 0;
    } else {
      return this.year > r.getYear() ? 1 : -1;
    }
  }

  @Override
  public int hashCode() {
    int c = 17;
    c += year;
    c += artist.hashCode();
    c += title.hashCode();
    return 37 * c;
  }

  public String getArtist() {
    return artist;
  }

  public Collection<String> getGenre() {
    return genre;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return String.format("{ %s | %s | %s | %d | %s }", artist, title, genre, year, type);
  }
}
