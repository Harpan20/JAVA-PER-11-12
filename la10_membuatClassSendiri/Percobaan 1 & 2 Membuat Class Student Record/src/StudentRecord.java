/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    /**
     * Menghasilkan nama dari siswa
     */
    public String getName(){
        return name;
    }
    /**
     * Mengubah nama siswa
     */
    public void setName(String temp){
        name = temp;
    }
    // area penulisan kode lain
    
    /**
     * Menghitung rata - rata nilai Matematika, Bahasa Inggris, Ilmu pasti 
     */
    public double getAverage(){
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }
    /**
     * Menghasilkan jumlah instance StudentRecord
     */
    
    public static int getStudentCount(){
        return studentCount;
    }
}
