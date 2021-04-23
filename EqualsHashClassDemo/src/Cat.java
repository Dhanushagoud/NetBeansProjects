/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhanushaDommati
 */
public class Cat {
    private String CatName;
    private int age;

    public Cat(String CatName, int age) {
        this.CatName = CatName;
        this.age = age;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String CatName) {
        this.CatName = CatName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "CatName=" + CatName + ", age=" + age + '}';
    }
    
}
