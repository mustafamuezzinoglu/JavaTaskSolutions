package day31;

public class  MovieTest{
    public static void main(String[] args) {

        Movie movie = new Movie("USA"," Journey to SDET: Cydeo Batch 25","10/25/2021","Kuzzat Altay");
        String[] array = {"Asiya", "Adam", "Muhtar", "Asiya", "Adam", "Muhtar"};
        movie.addCast("Mustafa");
        movie.addCast(array);
        System.out.println(movie);


    }
}
/*
   title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group
 */