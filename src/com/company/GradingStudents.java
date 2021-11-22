package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade: grades) {
            if(grade < 38 ){
                roundedGrades.add(grade);
                continue;
            }
            if(grade % 5 != 0 && (grade + 1) % 5 == 0 ){
                roundedGrades.add(grade + 1);
            }else if(grade % 5 != 0 && (grade + 2) % 5 == 0){
                roundedGrades.add(grade + 2);
            }else{
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;

    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(84);
        grades.add(29);
        grades.add(57);

        System.out.println(gradingStudents(grades));

    }
}
