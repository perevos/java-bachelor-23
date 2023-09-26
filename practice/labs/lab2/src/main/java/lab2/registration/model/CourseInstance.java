package lab2.model;

import java.time.LocalDate;

/**
 * Класс с данными о проведении курса. Один курс (например, дискретная математика) может быть проведен несколько раз.
 */
public class CourseInstance {
    
    /**
     * идентификатор проведения курса
     */
    private long id;

    /**
     * идентификатор курса, соответствующий CourseInfo.id
     */
    private long courseId;

    /**
     * идентификатор преподавателя
     */
    private long instructorId;

    /**
     * дата начала курса
     */
    private LocalDate startDate;

    /**
     * ограничение на число студентов курса
     */
    private int capacity;

    // TODO: добавить геттеры и сеттеры
    
}
