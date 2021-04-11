/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhanushaDommati
 */
public class Lib {
    
  private String books;
  private int numberOfBooks;

    public Lib(String books, int numberOfBooks) {
        this.books = books;
        this.numberOfBooks = numberOfBooks;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "Lib{" + "books=" + books + ", numberOfBooks=" + numberOfBooks + '}';
    }
  
  
}
