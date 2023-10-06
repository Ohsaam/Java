package com.calc;

import java.util.List;

public class Student { // Student 라는 불변객체를 만듦
	private int HTML;
	private int Java;
	private int Oracle;
	private String name;
	private int rank;

	
	public Student(String name,int HTML, int JAVA, int Oracle)
	{
		this.name = name;
		this.HTML = HTML;
		this.Java = JAVA;
		this.Oracle = Oracle;
	}

	public int getHTML() {
		return HTML;
	}
	public void setHTML(int hTML) {
		HTML = hTML;
	}
	public int getJava() {
		return Java;
	}
	public void setJava(int java) {
		Java = java;
	}
	public int getOracle() {
		return Oracle;
	}
	public void setOracle(int oracle) {
		Oracle = oracle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
	    // HTML, Java, Oracle 점수의 평균을 반환
	    return (HTML + Java + Oracle) / 3.0;
	}
	
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
	
    public String calculateGrade() {
        double average = (HTML + Java + Oracle) / 3.0;
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
	
	@Override
	public String toString() {
		return "Student [HTML=" + HTML + ", Java=" + Java + ", Oracle=" + Oracle + ", name=" + name + "]";
	}
	
	

}
