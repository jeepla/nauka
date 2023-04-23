public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
       comedyMovie.WatchComedy();

       var airplane = Movie.getMovie("C", "airplane");
       airplane.watchMovie();

       var plane = new Comedy("Airplane");
       plane.WatchComedy();

       Object unknownObject = Movie.getMovie("S","Star Wars");
       if(unknownObject.getClass().getSimpleName() == "Comedy"){
           Comedy c = (Comedy) unknownObject;
           c.WatchComedy();
       }else if(unknownObject instanceof Adventure){
           ((Adventure)unknownObject).WatchAdventure();
       }else if(unknownObject instanceof ScienceFiction syfy){
           syfy.WatchScienceFiction();
       }
    }
}
