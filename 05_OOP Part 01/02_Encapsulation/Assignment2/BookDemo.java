/**
 * BookDemo - Test Class for Book Implementation
 * 
 * Use this class to test your Book class implementation.
 * Run this after completing all TODOs in the Book class.
 * 
 * Expected behavior:
 * - All tests should run without errors
 * - Output should be formatted and readable
 * - Validation should prevent invalid data from being set
 */
public class BookDemo {
    
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("           BOOK CLASS TESTING DEMO");
        System.out.println("===============================================\n");
        
        // Test 1: Default Constructor
        System.out.println("TEST 1: Default Constructor");
        System.out.println("----------------------------");
        Book defaultBook = new Book();
        System.out.println("Created with default constructor: " + defaultBook);
        System.out.println("✓ Default constructor test complete\n");
        
        // Test 2: Parameterized Constructor  
        System.out.println("TEST 2: Parameterized Constructor");
        System.out.println("----------------------------------");
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 14.99);
        Book book2 = new Book("1984", "George Orwell", 328, 13.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 12.99);
        
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);
        System.out.println("✓ Parameterized constructor test complete\n");
        
        // Test 3: Copy Constructor
        System.out.println("TEST 3: Copy Constructor");
        System.out.println("------------------------");
        Book bookCopy = new Book(book1);
        System.out.println("Original: " + book1);
        System.out.println("Copy:     " + bookCopy);
        System.out.println("Are they equal? " + book1.equals(bookCopy));
        System.out.println("✓ Copy constructor test complete\n");
        
        // Test 4: Getter Methods
        System.out.println("TEST 4: Getter Methods");
        System.out.println("----------------------");
        System.out.println("Title: '" + book1.getTitle() + "'");
        System.out.println("Author: '" + book1.getAuthor() + "'");
        System.out.println("Pages: " + book1.getPages());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("✓ Getter methods test complete\n");
        
        // Test 5: Setter Methods and Validation
        System.out.println("TEST 5: Setter Methods and Validation");
        System.out.println("--------------------------------------");
        Book testBook = new Book();
        System.out.println("Starting with: " + testBook);
        
        // Valid updates
        testBook.setTitle("Dune");
        testBook.setAuthor("Frank Herbert");  
        testBook.setPages(688);
        testBook.setPrice(16.99);
        System.out.println("After valid updates: " + testBook);
        
        // Test validation - these should NOT change the values
        System.out.println("\nTesting validation (these should be ignored):");
        testBook.setTitle("");          // Empty string - should be ignored
        testBook.setTitle(null);        // Null - should be ignored
        testBook.setAuthor("   ");      // Only whitespace - should be ignored
        testBook.setPages(-50);         // Negative pages - should be ignored
        testBook.setPrice(-5.99);       // Negative price - should be ignored
        
        System.out.println("After invalid updates (should be unchanged): " + testBook);
        System.out.println("✓ Setter validation test complete\n");
        
        // Test 6: Utility Methods
        System.out.println("TEST 6: Utility Methods");
        System.out.println("------------------------");
        
        // Reading time calculation
        System.out.printf("Reading time for '%s': %.1f minutes\n", 
                         book1.getTitle(), book1.calculateReadingTime());
        System.out.printf("Reading time for '%s': %.1f minutes\n", 
                         testBook.getTitle(), testBook.calculateReadingTime());
        
        // Expensive book test
        System.out.println("\nExpensive book test (>$25):");
        testExpensive(book1);
        testExpensive(book2); 
        testExpensive(testBook);
        
        Book expensiveBook = new Book("Expensive Textbook", "Dr. Smith", 800, 89.99);
        testExpensive(expensiveBook);
        
        // Long book test
        System.out.println("\nLong book test (>300 pages):");
        testLongBook(book1);
        testLongBook(book2);
        testLongBook(testBook);
        
        // Price per page
        System.out.println("\nPrice per page calculation:");
        System.out.printf("'%s': $%.3f per page\n", 
                         book1.getTitle(), book1.getPricePerPage());
        System.out.printf("'%s': $%.3f per page\n", 
                         testBook.getTitle(), testBook.getPricePerPage());
        
        // Test division by zero protection
        Book zeroPageBook = new Book("Empty Book", "No Author", 0, 10.00);
        System.out.printf("'%s' (0 pages): $%.3f per page (should be 0.000)\n", 
                         zeroPageBook.getTitle(), zeroPageBook.getPricePerPage());
        
        System.out.println("✓ Utility methods test complete\n");
        
        // Test 7: Discount Functionality
        System.out.println("TEST 7: Discount Functionality");
        System.out.println("-------------------------------");
        Book discountBook = new Book("Programming Guide", "Jane Doe", 450, 59.99);
        System.out.println("Before discount: " + discountBook);
        
        discountBook.applyDiscount(20);  // 20% discount
        System.out.println("After 20% discount: " + discountBook);
        
        discountBook.applyDiscount(10);  // Additional 10% discount
        System.out.println("After additional 10% discount: " + discountBook);
        
        // Test invalid discount (should be ignored)
        double priceBefore = discountBook.getPrice();
        discountBook.applyDiscount(-5);   // Negative discount - should be ignored
        discountBook.applyDiscount(150);  // Over 100% - should be ignored
        System.out.printf("After invalid discounts: " + discountBook + 
                         " (should be same as previous: $%.2f)\n", priceBefore);
        
        System.out.println("✓ Discount functionality test complete\n");
        
        // Test 8: Equals Method
        System.out.println("TEST 8: Equals Method");
        System.out.println("---------------------");
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 14.99);
        Book book5 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 15.99); // Different price
        
        System.out.println("book1: " + book1);
        System.out.println("book4: " + book4);
        System.out.println("book5: " + book5);
        System.out.println();
        
        System.out.println("book1.equals(book4): " + book1.equals(book4) + " (should be true)");
        System.out.println("book1.equals(book5): " + book1.equals(book5) + " (should be false)");
        System.out.println("book1.equals(book2): " + book1.equals(book2) + " (should be false)");
        System.out.println("book1.equals(null): " + book1.equals(null) + " (should be false)");
        System.out.println("book1.equals(\"not a book\"): " + book1.equals("not a book") + " (should be false)");
        System.out.println("✓ Equals method test complete\n");
        
        // Test 9: Working with Arrays
        System.out.println("TEST 9: Working with Book Arrays");
        System.out.println("---------------------------------");
        Book[] library = {book1, book2, book3, testBook, expensiveBook};
        
        System.out.println("Library Collection:");
        for (int i = 0; i < library.length; i++) {
            System.out.println((i + 1) + ". " + library[i]);
        }
        
        // Find most expensive book
        Book mostExpensive = findMostExpensive(library);
        System.out.println("\nMost expensive book: " + mostExpensive);
        
        // Calculate total library value
        double totalValue = calculateTotalValue(library);
        System.out.printf("Total library value: $%.2f\n", totalValue);
        
        // Count long books
        int longBooks = countLongBooks(library);
        System.out.println("Number of long books (>300 pages): " + longBooks);
        
        System.out.println("✓ Array operations test complete\n");
        
        // Final Summary
        System.out.println("===============================================");
        System.out.println("           ALL TESTS COMPLETED!");
        System.out.println("===============================================");
        System.out.println("If you see this message without any errors,");
        System.out.println("your Book class implementation is working!");
        System.out.println("===============================================");
    }
    
    // Helper methods for testing
    private static void testExpensive(Book book) {
        String result = book.isExpensive() ? "EXPENSIVE" : "affordable";
        System.out.printf("'%s' ($%.2f): %s\n", 
                         book.getTitle(), book.getPrice(), result);
    }
    
    private static void testLongBook(Book book) {
        String result = book.isLongBook() ? "LONG BOOK" : "normal length";
        System.out.printf("'%s' (%d pages): %s\n", 
                         book.getTitle(), book.getPages(), result);
    }
    
    private static Book findMostExpensive(Book[] books) {
        if (books.length == 0) return null;
        
        Book mostExpensive = books[0];
        for (Book book : books) {
            if (book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }
    
    private static double calculateTotalValue(Book[] books) {
        double total = 0.0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
    
    private static int countLongBooks(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book.isLongBook()) {
                count++;
            }
        }
        return count;
    }
}