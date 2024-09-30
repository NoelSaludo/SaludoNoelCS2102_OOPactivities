import java.util.Scanner;

class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String album, genre, title, artist;
        int year;
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter genre: ");
        genre = scanner.nextLine();
        System.out.print("Enter album: ");
        album = scanner.nextLine();
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter artist: ");
        artist = scanner.nextLine();
        
        //Prints details
        String songDetail = """
        ----------------------------------------------
        SONG DETAILS
        ----------------------------------------------
                """;
        System.out.print(songDetail);
        System.out.println("Year Released: "+year);
        System.out.println("Genre: "+genre);
        System.out.println("Album: "+album);
        System.out.println("title: "+title);
        System.out.println("Artist: "+artist);
        scanner.close();
    }
}