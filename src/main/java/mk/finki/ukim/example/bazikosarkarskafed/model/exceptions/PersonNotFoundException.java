package mk.finki.ukim.example.bazikosarkarskafed.model.exceptions;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(String embg) {
        super(String.format("Person with %s embg is not found",embg));
    }
}
