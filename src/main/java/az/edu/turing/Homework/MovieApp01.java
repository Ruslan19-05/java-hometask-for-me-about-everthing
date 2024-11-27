package az.edu.turing.Homework;

import java.util.Scanner;

public class MovieApp01 {

    MovieMan[] movies = new MovieMan[0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieApp01 app = new MovieApp01();
        
        boolean b=true;
        while (b) {
            System.out.println("\nMenu:");
            System.out.println("1. Input 3 movies");
            System.out.println("2. Display movies and ratings");
            System.out.println("3. Input more movies");
            System.out.println("4. Find statistics");
            System.out.println("5. Search for a movie");
            System.out.println("6. Update movie ratings");
            System.out.println("7. Delete movie from the list");
            System.out.println("8. Sort movies by rating");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    app.inputMuvie(scanner);
                    break;
                case 2:
                    app.showMovie();
                    break;
                case 3:
                    app.inputMoreMovies(scanner);
                    break;
                case 4:
                    app.faindSticis();
                    break;
                case 5:
                    app.searchMovie(scanner);
                    break;
                case 6:
                    app.updateMovie(scanner);
                    break;
                case 0:
                    app.exitApp(scanner);
                     b = false;
                    break;
            }
        }
    }

    public void inputMuvie(Scanner scanner) {

        MovieMan[] newMovies = new MovieMan[movies.length + 3];
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i];
        }

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter " + (i + 1) + " movie name:");

            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Enter " + (i + 1) + " movie rating:");

             double ratings=checkRating(scanner);

            newMovies[movies.length + i] = new MovieMan(name,ratings);
        }
        movies = newMovies;
        System.out.println("3 Movies have been added successfully!");
    }
    public static double checkRating(Scanner scanner){

        double rating= scanner.nextDouble();

        while(rating<0 || rating>10){

                System.out.print("Wrong rating!\n"+"Try again:");
                    rating= scanner.nextDouble();
            }
        return rating;
        }

    public  void showMovie(){
        if(movies.length==0){
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }
        System.out.println("Movie and Raitings:");
        for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i].name + " = rating " + movies[i].rating);

                System.out.println((i + 1) + ". No movie data available.");
        }
    }

    public void inputMoreMovies(Scanner scanner){

        System.out.print("How many you will add?");

        int n= scanner.nextInt();

        MovieMan[] newMovi=new MovieMan[movies.length+n];
        for(int i=0;i< movies.length;i++){
            newMovi[i]=movies[i];
        }
        System.out.println("Add new movies names: ");

        for(int i= movies.length;i< newMovi.length;i++){
            scanner.nextLine();

            System.out.print("Enter "+(i+1)+" movie name:");
            String name=scanner.nextLine();

            System.out.print("Enter "+(i+1)+" movie rating:");
            double rating=checkRating(scanner);

            newMovi[i]=new MovieMan(name,rating);
        }
        movies = newMovi;
        System.out.println("Additional movies have been added successfully!");
    }

    public void faindSticis() {
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }
        double totalMovieR = 0;
        MovieMan maxMovie = movies[0];
        MovieMan minMovir = movies[0];

        for (MovieMan movie : movies) {
            totalMovieR += movie.rating;

            if (maxMovie.rating < movie.rating) {
                maxMovie=movie;
            }

            if(minMovir.rating >movie.rating){
                minMovir=movie;
            }
        }
        double average=totalMovieR/movies.length;

        System.out.println("Max rating: "+maxMovie.rating);
        System.out.println("Min rating: "+minMovir.rating);
        System.out.printf("Rating average: %.1f%n"+average );
    }

    public void searchMovie(Scanner scanner){
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }
        scanner.nextLine();
        System.out.println("Which movie want you?");
        String whichName=scanner.nextLine();
        for(MovieMan whichMovie:movies){
            if(whichMovie.name.equals(whichName)){
                System.out.print("This rating"+whichMovie.rating);
                return;
            }
        }
        System.out.println("This Movie Not Found! ");

    }
    
    public void updateMovie(Scanner scanner){
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }
        scanner.nextLine();
        System.out.print("Which movie updates rating:");
        String whName= scanner.nextLine();
        for(MovieMan movie:movies){
            if(movie.name.equals(whName)){
                System.out.print("Enter new rating:");
                movie.rating= scanner.nextInt();
                System.out.print( movie.name+" new rating "+movie.rating);
                return;
            }
        }

    }

    public void exitApp(Scanner scanner) {
        System.out.println("Goodbye!");
    }
}
























