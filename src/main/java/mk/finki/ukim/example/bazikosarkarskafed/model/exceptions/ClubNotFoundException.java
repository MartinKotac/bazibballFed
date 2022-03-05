package mk.finki.ukim.example.bazikosarkarskafed.model.exceptions;

public class ClubNotFoundException extends RuntimeException{
    public ClubNotFoundException(int id) {
        super(String.format("Club with %d club id is not found",id));
    }
}
