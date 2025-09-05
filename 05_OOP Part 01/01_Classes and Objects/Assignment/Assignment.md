# Mini Assignment: Simple Pet System - TODO Instructions

## 📋 How to Complete This Assignment

Follow the TODOs in order across the three files. Each TODO has clear instructions and hints to guide you.

### **Step 1**: Complete Pet.java (TODOs 1-8)
### **Step 2**: Complete PetOwner.java (TODOs 9-14) 
### **Step 3**: Complete PetDemo.java (TODOs 15-21)
### **Step 4**: Test your complete program

---

## Pet.java Template

```java
/**
 * Pet class represents a simple pet animal.
 * Complete the TODOs below to create a working Pet class.
 */
public class Pet {
    
    // TODO 1: Add four public instance fields:
    // - String name (pet's name)
    // - String type (what kind of animal - dog, cat, bird, etc.)
    // - boolean isHappy (whether the pet is happy)
    // - PetOwner owner (reference to who owns this pet)
    
    
    /**
     * Constructor creates a new pet
     * @param name the pet's name
     * @param type what kind of animal (dog, cat, bird, etc.)
     */
    public Pet(String name, String type) {
        // TODO 2: Set this pet's name to the name parameter
        // HINT: this.name = name;
        
        // TODO 3: Set this pet's type to the type parameter
        
        // TODO 4: Set isHappy to true (new pets start happy)
        
        // TODO 5: Set owner to null (no owner initially)
        // HINT: this.owner = null;
        
    }
    
    /**
     * Feeds the pet, making them happy
     */
    public void feed() {
        // TODO 6: Set isHappy to true
        
        // TODO 7: Print a message: "[pet name] has been fed!"
        // HINT: System.out.println(name + " has been fed!");
        
    }
    
    /**
     * Sets who owns this pet
     * @param newOwner the person who will own this pet
     */
    public void setOwner(PetOwner newOwner) {
        // TODO 8: Set this pet's owner to newOwner, then print a message
        // Set: this.owner = newOwner;
        // Print: "[pet name] now belongs to [owner's full name]!"
        // HINT: Use newOwner.getFullName() to get the owner's name
        
    }
    
    /**
     * Displays all information about this pet
     */
    public void displayInfo() {
        // This method is provided for you - no TODO needed
        System.out.print("Name: " + name + ", Type: " + type + ", Happy: " + isHappy + ", Owner: ");
        if (owner == null) {
            System.out.println("None");
        } else {
            System.out.println(owner.getFullName());
        }
    }
}
```

---

## PetOwner.java Template

```java
/**
 * PetOwner class represents a person who can own and care for pets.
 * Complete the TODOs below to create a working PetOwner class.
 */
public class PetOwner {
    
    // TODO 9: Add two public instance fields:
    // - String firstName (owner's first name)
    // - String lastName (owner's last name)
    
    
    /**
     * Constructor creates a new pet owner
     * @param firstName owner's first name
     * @param lastName owner's last name
     */
    public PetOwner(String firstName, String lastName) {
        // TODO 10: Set this owner's firstName to the firstName parameter
        // HINT: this.firstName = firstName;
        
        // TODO 11: Set this owner's lastName to the lastName parameter
        
    }
    
    /**
     * Returns the owner's full name
     * @return first name + " " + last name
     */
    public String getFullName() {
        // TODO 12: Return the first name + " " + last name
        // HINT: return firstName + " " + lastName;
        
    }
    
    /**
     * Adopts a pet by setting this person as the pet's owner
     * @param pet the pet to adopt
     */
    public void adoptPet(Pet pet) {
        // TODO 13: Call pet.setOwner(this) to make this person the pet's owner
        // HINT: pet.setOwner(this);
        
        // Then print: "[owner's full name] adopted [pet name]!"
        // HINT: Use getFullName() and pet.name
        
    }
    
    /**
     * Feeds a pet, but only if this person owns it
     * @param pet the pet to feed
     */
    public void feedPet(Pet pet) {
        // TODO 14: Check if this person owns the pet
        // IF pet.owner == this (this person owns the pet):
        //    Call pet.feed()
        // ELSE (this person doesn't own the pet):
        //    Print "[owner's full name] cannot feed [pet name] - not their pet!"
        
        // HINT: Use an if-else statement
        // if (pet.owner == this) {
        //     pet.feed();
        // } else {
        //     System.out.println(getFullName() + " cannot feed " + pet.name + " - not their pet!");
        // }
        
    }
}
```

---

## PetDemo.java Template

```java
/**
 * PetDemo demonstrates the Pet and PetOwner classes working together.
 * Complete the TODOs below to create a working demonstration.
 */
public class PetDemo {
    public static void main(String[] args) {
        System.out.println("=== Simple Pet System ===\n");
        
        // TODO 15: Create two Pet objects
        // Create a dog named "Buddy": Pet buddy = new Pet("Buddy", "dog");
        // Create a cat named "Fluffy": Pet fluffy = new Pet("Fluffy", "cat");
        
        
        // TODO 16: Create two PetOwner objects
        // Create Alice Smith: PetOwner alice = new PetOwner("Alice", "Smith");
        // Create Bob Jones: PetOwner bob = new PetOwner("Bob", "Jones");
        
        
        // Show initial status
        System.out.println("=== Initial Pet Status ===");
        // TODO 17: Display info for both pets
        // Call buddy.displayInfo();
        // Call fluffy.displayInfo();
        
        System.out.println();
        
        // Demonstrate adoptions
        System.out.println("=== Adoptions ===");
        // TODO 18: Have Alice adopt Buddy and Bob adopt Fluffy
        // Call alice.adoptPet(buddy);
        // Call bob.adoptPet(fluffy);
        
        System.out.println();
        
        // Show updated status
        System.out.println("=== Updated Pet Status ===");
        // TODO 19: Display info for both pets again (should show owners now)
        // Call buddy.displayInfo();
        // Call fluffy.displayInfo();
        
        System.out.println();
        
        // Demonstrate feeding with ownership validation
        System.out.println("=== Feeding Time ===");
        // TODO 20: Try three feeding scenarios:
        // 1. Alice feeds Buddy (should work - Alice owns Buddy)
        // 2. Alice tries to feed Fluffy (should fail - Alice doesn't own Fluffy)  
        // 3. Bob feeds Fluffy (should work - Bob owns Fluffy)
        // Call alice.feedPet(buddy);
        // Call alice.feedPet(fluffy);
        // Call bob.feedPet(fluffy);
        
        
        // TODO 21: Add a final message
        System.out.println("\n=== Demo Complete ===");
    }
}
```

---

## 📝 Step-by-Step Instructions

### **Getting Started**
1. Create three new Java files with the names above
2. Copy the template code into each file
3. Complete the TODOs in order (1-21)

### **Tips for Success**
- **Read each TODO carefully** - they contain specific instructions and hints
- **Test frequently** - compile and run after completing each class
- **Use the hints** - they show you exactly what to type
- **Ask for help** if you get stuck on any TODO

### **How to Test Your Progress**

**After completing Pet.java (TODOs 1-8):**
```java
// Test in main method:
Pet testPet = new Pet("Max", "dog");
testPet.displayInfo(); // Should show: Name: Max, Type: dog, Happy: true, Owner: None
```

**After completing PetOwner.java (TODOs 9-14):**
```java
// Test in main method:
PetOwner testOwner = new PetOwner("Test", "Person");
System.out.println(testOwner.getFullName()); // Should print: Test Person
```

**After completing PetDemo.java (TODOs 15-21):**
- Run the complete program
- Should see the expected output with adoptions and feeding

### **Expected Final Output**
```
=== Simple Pet System ===

=== Initial Pet Status ===
Name: Buddy, Type: dog, Happy: true, Owner: None
Name: Fluffy, Type: cat, Happy: true, Owner: None

=== Adoptions ===
Buddy now belongs to Alice Smith!
Alice Smith adopted Buddy!
Fluffy now belongs to Bob Jones!
Bob Jones adopted Fluffy!

=== Updated Pet Status ===
Name: Buddy, Type: dog, Happy: true, Owner: Alice Smith
Name: Fluffy, Type: cat, Happy: true, Owner: Bob Jones

=== Feeding Time ===
Buddy has been fed!
Alice Smith cannot feed Fluffy - not their pet!
Fluffy has been fed!

=== Demo Complete ===
```

### **Submission Checklist**
- [ ] All 21 TODOs completed
- [ ] Code compiles without errors
- [ ] Program produces expected output
- [ ] All three classes work together correctly

**Total estimated time: 45-60 minutes**

This guided approach ensures students understand each step while building confidence through small, achievable tasks!