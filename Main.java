
public class Main {
    public static void main(String[] args) {

        Figther f1 = new Figther("Muhammed Ali",10,120,100,100);
        Figther f2 =new Figther("Mike Tayson",20,85,85,50);

        Match match = new Match(f1,f2,85,100);
        match.start();


    }
}