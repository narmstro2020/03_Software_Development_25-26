/**
 * Book class - Student Assignment
 * 
 * Complete all the TODO sections to create a fully functional Book class.
 * This class represents a book with title, author, number of pages, and price.
 * 
 * Test your implementation using the BookDemo class.
 * 
 * @author [Your Name]
 * @version 1.0
 */
public class Book {
    
    // TODO 1: Declare private instance variables
    // Hint: You need String title, String author, int pages, double price
    
    
    
    
    
    /**
     * Default constructor - creates a book with default values
     * TODO 2: Initialize all fields with default values:
     * - title: "Unknown Title"
     * - author: "Unknown Author"
     * - pages: 0
     * - price: 0.0
     */
    public Book() {
        
    }
    
    /**
     * Parameterized constructor
     * TODO 3: Create constructor that accepts title, author, pages, and price
     * Set title and author directly, but use setPages() and setPrice() 
     * methods for validation
     */
    public Book(String title, String author, int pages, double price) {
        
    }
    
    /**
     * Copy constructor
     * TODO 4: Create a constructor that copies values from another Book object
     */
    public Book(Book other) {
        
    }
    
    // GETTER METHODS
    // TODO 5: Create getter methods for all instance variables
    
    /**
     * Gets the book's title
     * @return the title of the book
     */
    public String getTitle() {
        return null; // Replace this line
    }
    
    /**
     * Gets the book's author
     * @return the author of the book
     */
    public String getAuthor() {
        return null; // Replace this line
    }
    
    /**
     * Gets the number of pages
     * @return the number of pages in the book
     */
    public int getPages() {
        return 0; // Replace this line
    }
    
    /**
     * Gets the book's price
     * @return the price of the book
     */
    public double getPrice() {
        return 0.0; // Replace this line
    }
    
    // SETTER METHODS WITH VALIDATION
    // TODO 6: Create setter methods with proper validation
    
    /**
     * Sets the book's title
     * TODO: Only set if title is not null and not empty (after trimming whitespace)
     * @param title the new title for the book
     */
    public void setTitle(String title) {
        
    }
    
    /**
     * Sets the book's author
     * TODO: Only set if author is not null and not empty (after trimming whitespace)
     * @param author the new author for the book
     */
    public void setAuthor(String author) {
        
    }
    
    /**
     * Sets the number of pages
     * TODO: Only set if pages is greater than or equal to 0
     * @param pages the new number of pages
     */
    public void setPages(int pages) {
        
    }
    
    /**
     * Sets the book's price
     * TODO: Only set if price is greater than or equal to 0.0
     * @param price the new price for the book
     */
    public void setPrice(double price) {
        
    }
    
    // UTILITY METHODS
    // TODO 7: Implement utility methods that provide useful functionality
    
    /**
     * Calculates estimated reading time in minutes
     * TODO: Use these assumptions:
     * - 250 words per page
     * - 200 words per minute reading speed  
     * - Formula: (pages * 250) / 200
     * @return estimated reading time in minutes
     */
    public double calculateReadingTime() {
        return 0.0; // Replace this line
    }
    
    /**
     * Determines if this book is expensive
     * TODO: Return true if price is greater than $25.00
     * @return true if the book costs more than $25.00
     */
    public boolean isExpensive() {
        return false; // Replace this line
    }
    
    /**
     * Determines if this book is long
     * TODO: Return true if pages is greater than 300
     * @return true if the book has more than 300 pages
     */
    public boolean isLongBook() {
        return false; // Replace this line
    }
    
    /**
     * Calculates the price per page
     * TODO: Return price divided by pages
     * IMPORTANT: If pages is 0, return 0.0 to avoid division by zero
     * @return price per page, or 0.0 if no pages
     */
    public double getPricePerPage() {
        return 0.0; // Replace this line
    }
    
    /**
     * Applies a discount to the book's price
     * TODO: Apply discount only if discountPercent is between 0 and 100 (inclusive)
     * Formula: newPrice = currentPrice * (1 - discountPercent/100)
     * Example: 20% discount means multiply price by 0.8
     * @param discountPercent the discount percentage (0-100)
     */
    public void applyDiscount(double discountPercent) {
        
    }
    
    // OVERRIDE METHODS
    // TODO 8: Override Object class methods
    
    /**
     * Returns a string representation of the book
     * TODO: Return format: Book: "Title" by Author (XXX pages, $X.XX)
     * Use String.format() to ensure price shows exactly 2 decimal places
     * Example: Book: "1984" by George Orwell (328 pages, $13.99)
     */
    @Override
    public String toString() {
        return ""; // Replace this line
    }
    
    /**
     * Checks if this book is equal to another object
     * TODO: Follow the standard equals() pattern:
     * 1. Check if obj is the same reference as this (this == obj)
     * 2. Check if obj is null or not the same class
     * 3. Cast obj to Book and compare all fields
     * 4. For price comparison, use Double.compare(price, other.price) == 0
     * 5. For String comparison, use the equals() method
     * @param obj the object to compare with
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        return false; // Replace this line
    }
}