/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.vn.bai6.lb02.lb03;

import java.util.Scanner;

/**
 *
 * @author manh
 */
public class main {

    public static void main(String[] args) {
        studentlb03 student1 = new studentlb03("Hoang Hung Manh", "at20d");
        student1.Show();
        studentlb03 student2 = new studentlb03("Hoang Manh", "at20d");
        student2.setDefaultName(student2);
        student2.Show();
    }
}
