package lab2.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab2.model.Student;

import java.io.File;
import java.io.IOException;

/**
 * Класс для чтения информации о студентах из файлов
 */
public class StudentDataReader {

    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @return список студентов-бакалавров
     */
    public Student[] readBachelorStudentData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
    }

    /**
     * @return список студентов-магистров
     */
    public Student[] readMasterStudentData() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
    }

}
