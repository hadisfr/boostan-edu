package main.java.Model;

import java.util.HashMap;

public class CourseOfferingRepository {
    private static HashMap<String, CourseOffering> database;

    static {
        database = new HashMap<String, CourseOffering>();
    }

    public static void save(CourseOffering courseOffering) {
        if (database.containsKey(courseOffering.toString())) {
            CourseOffering currentCourseOffering = database.get(courseOffering.toString());
            if (!courseOffering.equals(currentCourseOffering))
                throw new IllegalArgumentException();
        }
        database.put(courseOffering.toString(), courseOffering);
    }

    public static CourseOffering get(String key) {
        if (database.containsKey(key))
            return database.get(key);
        else
            throw new IllegalArgumentException();
    }

//    public CourseOffering create(){
//        CourseOffering newCourseOffering = new CourseOffering()
//    }
}
