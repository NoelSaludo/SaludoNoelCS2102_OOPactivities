public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Taylor Swift", "American", 34, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Bruno Mars", "American", 39, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("John Doe", "English", 29, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Bob Ross", "American", 52, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Hirohiko Akari", "Japanese", 64, "Manga", WritingStyle.FICTION);
        writer.displayInfo();


    }
}