package com.calc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calc {

	/*
	 * ArrayList의 객체를 따로 생성해서 SungJukView의 값들을 List에 저장한다.(파라미터로 값을 받아온다.)
	 */
	
    private List<Student> students;
    private double averageScore;
    private int totalScore;
    private Map<String, List<Student>> coursecredit;
    
    

    public void averageScoreMethod() {
        if (students != null && !students.isEmpty()) {
            double total = 0;
            for (Student student : students) {
                total += student.getScore(); // 학생 객체에서 점수를 가져와서 더함
            }
            averageScore = total / students.size();
        } else {
            averageScore = 0; // 학생 정보가 없을 경우 평균 점수를 0으로 설정
        }
    }

    public void totalScoreMethod() {
        if (students != null && !students.isEmpty()) {
            int total = 0;
            for (Student student : students) {
                total += student.getScore(); // 학생 객체에서 점수를 가져와서 더함
            }
            totalScore = total;
        } else {
            totalScore = 0; // 학생 정보가 없을 경우 총점을 0으로 설정
        }
    }
    
    public void calculateGradeScore() {
        if (students != null && !students.isEmpty()) {
            coursecredit = new HashMap<>(); // 학점 정보를 저장할 Map 초기화

            for (Student student : students) {
                String grade = student.calculateGrade(); // 학점 계산 메소드 호출
                List<Student> studentsWithGrade = coursecredit.getOrDefault(grade, new ArrayList<>());
                studentsWithGrade.add(student);
                coursecredit.put(grade, studentsWithGrade);
            }
        } else {
            coursecredit = Collections.emptyMap(); // 학생 정보가 없을 경우 빈 Map으로 설정
        }
    }
    
    public void calculateRank() {
        if (students != null && !students.isEmpty()) {
            // 평균 점수를 기준으로 학생들을 정렬 (내림차순)
            Collections.sort(students, Comparator.comparingDouble(Student::getScore).reversed());

            // 각 학생에게 석차 부여
            int rank = 1;
            students.get(0).setRank(rank); // 첫 번째 학생은 1등

            for (int i = 1; i < students.size(); i++) {
                if (students.get(i).getScore() == students.get(i - 1).getScore()) {
                    // 평균 점수가 같으면 이전 학생과 동일한 석차
                    students.get(i).setRank(rank);
                } else {
                    // 평균 점수가 다르면 현재 순서에 따른 석차 부여
                    rank = i + 1;
                    students.get(i).setRank(rank);
                }
            }
        } else {
            // 학생 정보가 없을 경우 아무 작업도 하지 않음
        }
    }
    
    
    public void setStudents(List<Student> students) {
    	this.students = students;
    	
    }
    
    public List<Student> getStudents()
    {
    	return students;
    }

}
	
    
    
    
    
		
    
	
	

