package main.java.Model;

public class Semester {
    enum Term {Fall, Spring, Summer}

    private int year;
    private Term term;

    public Semester(int year, Term term) {
        this.year = year;
        this.term = term;
    }

    @Override
    public String toString() {
        return year + term.toString();
    }
}
