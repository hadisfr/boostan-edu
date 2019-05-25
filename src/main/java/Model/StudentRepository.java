package main.java.Model;

import java.util.HashMap;

public class StudentRepository {
    private static HashMap<StudentID, Student> database;

    static {
        database = new HashMap<StudentID, Student>();
    }

    public static void save(Student student) {
        if (database.containsKey(student.getSid())) {
            Student currentStudent = database.get(student.getSid());
            if (!student.equals(currentStudent))
                throw new IllegalArgumentException();
        }
        database.put(student.getSid(), student);
    }

    public static Student get(StudentID key) {
        if (database.containsKey(key))
            return database.get(key);
        else
            throw new IllegalArgumentException();
    }
}
