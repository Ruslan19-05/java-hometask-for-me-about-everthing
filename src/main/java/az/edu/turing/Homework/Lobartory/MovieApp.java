package az.edu.turing.Homework.Lobartory;

import java.util.Scanner;

public class MovieApp {


        Movie[] movies = new Movie[0];

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MovieApp app = new MovieApp();
            boolean isRunning = true;

            while (isRunning) {
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

                int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            app.inputMovies(scanner);
                            break;
                        case 2:
                            app.displayMovies();
                            break;
                        case 3:
                            app.addMoreMovies(scanner);
                            break;
                        case 4:
                            app.displayStatistics();
                            break;
                        case 5:
                            app.searchMovie(scanner);
                            break;
                        case 6:
                            app.updateMovieRating(scanner);
                            break;
                        case 7:
                            app.deleteMovie(scanner);
                            break;
                        case 8:
                            app.sortMoviesByRating();
                            break;
                        case 0:
                            app.exitProgram();
                            isRunning = false;
                            break;
                        default:
                            System.out.println("Invalid choice! Please try again.");
                            break;

                    }
            }

                scanner.close();
            }


        public void inputMovies(Scanner scanner) {
            Movie[] newMovies = new Movie[movies.length + 3];
            for (int i = 0; i < movies.length; i++) {
                newMovies[i] = movies[i];
            }

            for (int i = movies.length; i < newMovies.length; i++) {
                scanner.nextLine();
                System.out.print("Enter the name of movie " + (i + 1) + ": ");
                String name = scanner.nextLine();

                System.out.print("Enter the rating for \"" + name + "\": ");
                double rating = scanner.nextDouble();
                while (rating < 0 || rating > 10) {
                    System.out.print("Enter rating for " + name + " (0.0 - 10.0): ");
                    rating = scanner.nextDouble();
                }

                newMovies[i] = new Movie(name, rating);
            }

            movies = newMovies;
            System.out.println("3 Movies have been added successfully!");
        }

        public void addMoreMovies(Scanner scanner) {
            System.out.print("How many additional movies would you like to add? ");
            int additionalCount = scanner.nextInt();

            Movie[] newMovies = new Movie[movies.length + additionalCount];
            for (int i = 0; i < movies.length; i++) {
                newMovies[i] = movies[i];
            }

            for (int i = movies.length; i < newMovies.length; i++) {
                scanner.nextLine();
                System.out.print("Enter the name of movie " + (i + 1) + ": ");
                String name = scanner.nextLine();
                double rating = scanner.nextDouble();
                while (rating < 0 || rating > 10) {
                    System.out.print("Enter rating for " + name + " (0.0 - 10.0): ");
                    rating = scanner.nextDouble();
                }

                newMovies[i] = new Movie(name, rating);
            }

            movies = newMovies;
            System.out.println("Additional movies have been added successfully!");
        }

        public void displayMovies() {
            if (movies.length == 0) {
                System.out.println("No movies have been added yet. Please add movies first.");
                return;
            }

            System.out.println("\nMovies and Ratings:");
            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i].name + " - Rating: " + movies[i].rating);
            }
        }

        public void displayStatistics() {
            if (movies.length == 0) {
                System.out.println("No movies have been added yet. Please add movies first.");
                return;
            }

            double totalRating = 0;
            Movie maxRatedMovie = movies[0];
            Movie minRatedMovie = movies[0];

            for (Movie movie : movies) {
                totalRating += movie.rating;

                if (movie.rating > maxRatedMovie.rating) {
                    maxRatedMovie = movie;
                }
                if (movie.rating < minRatedMovie.rating) {
                    minRatedMovie = movie;
                }
            }

            double averageRating = totalRating / movies.length;

            System.out.println("\nStatistics:");
            System.out.printf("Average Rating: %.2f%n", averageRating);
            System.out.println("Movie with Maximum Rating: " + maxRatedMovie.name + " (" + maxRatedMovie.rating + ")");
            System.out.println("Movie with Minimum Rating: " + minRatedMovie.name + " (" + minRatedMovie.rating + ")");
        }

        public void searchMovie(Scanner scanner) {
            if (movies.length == 0) {
                System.out.println("No movies have been added yet. Please add movies first.");
                return;
            }

            scanner.nextLine();
            System.out.print("Enter the name of the movie to search for: ");
            String searchName = scanner.nextLine();

            for (Movie movie : movies) {
                if (movie.name.equalsIgnoreCase(searchName)) {
                    System.out.println("Movie found: " + movie.name + " - Rating: " + movie.rating);
                    return;
                }
            }
            System.out.println("Movie not found.");
        }

        public void updateMovieRating(Scanner scanner) {
            if (movies.length == 0) {
                System.out.println("No movies have been added yet. Please add movies first.");
                return;
            }

            scanner.nextLine();
            System.out.print("Enter the name of the movie to update its rating: ");
            String movieName = scanner.nextLine();

            for (Movie movie : movies) {
                if (movie.name.equalsIgnoreCase(movieName)) {
                    System.out.print("Enter the new rating for \"" + movie.name + "\": ");
                    double newRating = scanner.nextDouble();
                    movie.rating = newRating;
                    while (newRating < 0 || newRating > 10) {
                        System.out.print("Enter rating for " + movieName + " (0.0 - 10.0): ");
                        newRating = scanner.nextDouble();
                    }
                    System.out.println("Rating updated successfully!");
                    return;
                }
            }

            System.out.println("Movie not found.");
        }

        public void deleteMovie(Scanner scanner) {
                if (movies.length == 0) {
                    System.out.println("No movies have been added yet.");
                    return;
                }

                scanner.nextLine();
                System.out.print("Enter the name of the movie to delete: ");
                String movieToDelete = scanner.nextLine();

                int count = 0;
                for (Movie movie : movies) {
                    if (movie.name.equalsIgnoreCase(movieToDelete)) {
                        count++;
                    }
                }

                if (count == 0) {
                    System.out.println("Movie not found.");
                    return;
                }

                Movie[] newMovies = new Movie[movies.length - count];
                int index = 0;

                for (Movie movie : movies) {
                    if (!movie.name.equalsIgnoreCase(movieToDelete)) {
                        newMovies[index++] = movie;
                    }
                }

                movies = newMovies;
                System.out.println("All movies with the name \"" + movieToDelete + "\" have been deleted successfully.");
            }


            public void sortMoviesByRating() {
            if (movies.length == 0) {
                System.out.println("No movies have been added yet. Please add movies first.");
                return;
            }

            for (int i = 0; i < movies.length-1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < movies.length; j++) {
                    if (movies[j].rating > movies[minIndex].rating) {
                        minIndex = j;
                    }
                }
                Movie temp = movies[minIndex];
                movies[minIndex] = movies[i];
                movies[i] = temp;
            }

            System.out.println("Movies sorted by rating in ascending order:");
            displayMovies();
        }

        public void exitProgram() {
            System.out.println("Exiting the program. Goodbye!");
        }
    }
