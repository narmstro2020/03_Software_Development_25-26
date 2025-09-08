# Assignment 2: Rectangle Calculator - Template

## Overview
Create a `Rectangle` class that performs geometric calculations and demonstrates advanced constructor usage, initializer blocks, and mathematical operations. This assignment builds on the concepts from Assignment 1 and introduces more complex validation and calculation methods.

## Instructions

### Part 1: Create the Rectangle Class
Create a file called `Rectangle.java` with the following requirements:

#### Instance Variables (all should be private):
- `length` (double) - the length of the rectangle
- `width` (double) - the width of the rectangle
- `id` (String) - a unique identifier for the rectangle
- `units` (String) - the unit of measurement (e.g., "inches", "cm", "meters")

#### Initializer Block:
Create an initializer block that:
- Generates a unique ID using "RECT" + a random number between 1000-9999
- Sets the default units to "units" if not specified
- Prints a message: "Rectangle [ID] created"

#### Constructors:
1. **Full Constructor**: Takes length, width, and units (ID generated in initializer block)
2. **Basic Constructor**: Takes length and width (units default to "units", ID generated in initializer block)
3. **Square Constructor**: Takes one side measurement and units (creates a square where length = width)
4. **Default Constructor**: Sets length and width to 1.0, uses default units

#### Methods:

##### Getters and Setters:
- `getLength()`, `getWidth()`, `getId()`, `getUnits()`
- `setLength(double length)` - validate length > 0
- `setWidth(double width)` - validate width > 0  
- `setUnits(String units)` - validate not null/empty
- Note: No setter for ID (should remain constant after creation)

##### Calculation Methods:
- `calculateArea()` - returns length × width
- `calculatePerimeter()` - returns 2 × (length + width)
- `calculateDiagonal()` - returns √(length² + width²) using Math.sqrt()
- `isSquare()` - returns true if length equals width (use Math.abs for comparison with small tolerance)

##### Comparison Methods:
- `isLargerThan(Rectangle other)` - compares areas
- `isSameSize(Rectangle other)` - compares areas with small tolerance for doubles
- `compareDimensions(Rectangle other)` - returns String describing size relationship

##### Utility Methods:
- `scale(double factor)` - multiplies both dimensions by factor (validate factor > 0)
- `getInfo()` - returns detailed formatted string with all measurements
- `toString()` - returns concise string representation

### Part 2: Create the Demo Class
Create a file called `RectangleDemo.java` with a main method that demonstrates:

1. **Constructor Testing**: Create rectangles using all 4 constructors
2. **Calculation Testing**: Test all calculation methods on different rectangles
3. **Validation Testing**: Test setters with invalid values
4. **Comparison Testing**: Compare rectangles of different sizes
5. **Scaling Testing**: Scale rectangles by different factors
6. **Edge Case Testing**: Test with very small and very large values

## Sample Output
Your program should produce output similar to this:

```
=== Rectangle Calculator Demo ===

Creating rectangles with different constructors:
Rectangle RECT1234 created
Rectangle RECT5678 created  
Rectangle RECT9012 created
Rectangle RECT3456 created

Rectangle 1: Rectangle{id='RECT1234', length=5.0, width=3.0, units='inches'}
Rectangle 2: Rectangle{id='RECT5678', length=4.0, width=4.0, units='cm'}
Rectangle 3: Rectangle{id='RECT9012', length=7.0, width=7.0, units='meters'}
Rectangle 4: Rectangle{id='RECT3456', length=1.0, width=1.0, units='units'}

=== Calculation Tests ===
Rectangle RECT1234 (5.0 x 3.0 inches):
  Area: 15.0 square inches
  Perimeter: 16.0 inches
  Diagonal: 5.83 inches
  Is Square: false

Rectangle RECT5678 (4.0 x 4.0 cm):
  Area: 16.0 square cm
  Perimeter: 16.0 cm
  Diagonal: 5.66 cm  
  Is Square: true

=== Comparison Tests ===
Is RECT1234 larger than RECT5678? false
Are RECT1234 and RECT5678 the same size? false
Dimension comparison: RECT1234 is smaller than RECT5678

=== Scaling Tests ===
Original RECT1234: 5.0 x 3.0 inches
After scaling by 2.0: 10.0 x 6.0 inches
New area: 60.0 square inches

=== Validation Tests ===
Testing invalid length: Invalid length provided
Testing invalid width: Invalid width provided
Testing invalid scale factor: Invalid scale factor provided
```

## Detailed Requirements

### Initializer Block Specifications:
```java
{
    // Generate unique ID
    id = "RECT" + (int)(Math.random() * 9000 + 1000);
    
    // Set default units if not set by constructor
    if (units == null) {
        units = "units";
    }
    
    // Print creation message
    System.out.println("Rectangle " + id + " created");
}
```

### Validation Rules:
- Length and width must be positive (> 0)
- Scale factor must be positive (> 0)
- Units cannot be null or empty
- Use tolerance of 0.001 for double comparisons

### Mathematical Precision:
- Round diagonal calculations to 2 decimal places for display
- Use `Math.round(value * 100.0) / 100.0` for rounding
- Use `Math.abs(a - b) < 0.001` for comparing doubles

## Grading Criteria

### Rectangle Class (75 points)
- **Instance Variables (10 points)**: All 4 variables properly declared as private
- **Initializer Block (10 points)**: Correctly generates ID and sets defaults
- **Constructors (15 points)**: All 4 constructors implemented correctly
- **Getters/Setters (15 points)**: All accessor methods with proper validation
- **Calculation Methods (15 points)**: Area, perimeter, diagonal, isSquare work correctly
- **Comparison Methods (10 points)**: Size comparison methods work accurately

### RectangleDemo Class (15 points)
- **Comprehensive Testing (10 points)**: Tests all major functionality including edge cases
- **Clear Output (5 points)**: Well-formatted, informative output

### Code Quality (10 points)
- **Comments and Documentation**: Clear explanations of complex logic
- **Error Handling**: Proper validation with helpful error messages
- **Code Organization**: Well-structured, readable code following conventions

## Advanced Features (Optional - Extra Credit)
- Add a `rotate()` method that swaps length and width
- Create a `fitInside(Rectangle container)` method that checks if rectangle fits
- Add area conversion methods between different units
- Implement a `resize(double newArea)` method that maintains aspect ratio

## Common Challenges and Tips

### Working with Doubles:
- Never use `==` to compare doubles
- Always use a small tolerance for equality checks
- Be careful with rounding display values vs. internal calculations

### Initializer Block Timing:
- Remember initializer blocks run BEFORE constructors
- Don't rely on constructor parameters in initializer blocks
- Use initializer blocks for common setup code

### ID Generation:
- Make sure IDs are truly unique (consider using System.currentTimeMillis() for uniqueness)
- IDs should not change after object creation

### Math Operations:
- Use Math.sqrt() for square root calculations
- Use Math.abs() for absolute value comparisons
- Consider using Math.pow(x, 2) for squaring

## Submission Instructions
1. Create `Rectangle.java` and `RectangleDemo.java`
2. Test thoroughly with various input values
3. Verify all calculations are mathematically correct
4. Commit with descriptive message: "Complete Assignment 2: Rectangle Calculator"
5. Push to GitHub repository

## Testing Checklist
- [ ] All constructors create valid rectangles
- [ ] Initializer block generates unique IDs
- [ ] Area calculations are correct
- [ ] Perimeter calculations are correct  
- [ ] Diagonal calculations are accurate
- [ ] Square detection works for equal sides
- [ ] Validation rejects negative values
- [ ] Scaling works with various factors
- [ ] Comparisons handle edge cases
- [ ] toString provides clear representation

Good luck with your rectangle calculations!