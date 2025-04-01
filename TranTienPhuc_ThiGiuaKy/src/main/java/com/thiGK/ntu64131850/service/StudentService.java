package com.thiGK.ntu64131850.service;

import com.thiGK.ntu64131850.model.Student;
import com.thiGK.ntu64131850.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<Student>(Arrays.asList(
            new Student("S001", "Nguyễn Văn A", "G001"),
            new Student("S002", "Trần Thị B", "G001"),
            new Student("S003", "Lê Văn C", "G002"),
            new Student("S004", "Phạm Minh D", "G002"),
            new Student("S005", "Hoàng Thu E", "G003"),
            new Student("S006", "Bùi Thanh F", "G003"),
            new Student("S007", "Đỗ Quang G", "G004"),
            new Student("S008", "Ngô Hữu H", "G004"),
            new Student("S009", "Vũ Ngọc I", "G005"),
            new Student("S010", "Mai Thảo J", "G005")
    ));

    public List<Student> getAllStudents() {
        return students;
    }
    public boolean addStudent(Student student) {
        return students.add(student);
    }
    public Student getStudent(String id) {
        for (Student st : students) {
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }
    public boolean deleteStudent(String id) {
        for (Student st : students) {
            if (st.getId().equals(id)) {
                return students.remove(st);
            }
        }
        return false;
    }
}
