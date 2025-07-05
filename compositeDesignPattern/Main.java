package compositeDesignPattern;

public class Main {
  public static void main(String[] args) {

    Directory movies = new Directory("Movies");

    Directory koreanMovies = new Directory("Korean Movies");
    Directory indianMovies = new Directory("Indian Movies");
    Directory hollywoodMovies = new Directory("Hollywood Movies");

    File parasite = new File("Parasite.mp4");
    File trainToBusan = new File("Train To Busan.mp4");
    File rrr = new File("RRR.mp4");
    File dangal = new File("Dangal.mp4");
    File inception = new File("Inception.mp4");

    movies.addFile(koreanMovies);
    movies.addFile(indianMovies);
    movies.addFile(hollywoodMovies);

    koreanMovies.addFile(parasite);
    koreanMovies.addFile(trainToBusan);

    indianMovies.addFile(rrr);
    indianMovies.addFile(dangal);

    hollywoodMovies.addFile(inception);
    File topLevelDoc = new File("Readme.txt");
    movies.addFile(topLevelDoc);

    System.out.println("--- Printing File System Details ---");
    movies.ls();
  }
}