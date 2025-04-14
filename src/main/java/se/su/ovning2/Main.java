package se.su.ovning2;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");

        Recording r = new Recording("A Love Supreme", "John Coltrane", 1965, "CD", Set.of("Jazz"));
        // System.out.println(r.getArtist());

        Recording r2 = new Recording("A Love Supreme", "John Coltrane", 1965, "CD", Set.of("Jazz"));
        // System.out.println(r2.getArtist());

        System.out.println(r.hashCode());
        System.out.println(r2.hashCode());
    }
}
