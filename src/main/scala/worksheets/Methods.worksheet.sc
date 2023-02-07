// How to declare a simple method
def multiplication(x: Int, y: Int): Int = x * y
multiplication(12 ,45)

// It's possible to pass multiple parameter lists to one method
def division(x: Int, y: Int)(divider: Int) = (x * y) / divider
division(5,10)(2)

// It's also possible to create methods without any parameter
def name: String = System.getProperty("user.name")
println("Hello I am " + name)

// To declare a method with the indented syntax (new feature with scala 3)
def getYourFullName(firstName: String, surname: String) =
    val fullName = firstName + " " + surname
    fullName.toUpperCase()
getYourFullName("Ron", "Baguette")

// Specify a default parameter so you don't have to pass it when calling the function
def add(a: Int = 4, b: Int = 2): Int = a + b

// Call the function without parameters
add()
// Pass parameters normally
add(3, 9)
// Only specify b by name
add(b = 10)
// Specify both parameters in reverse order
add(b = 1, a = 99)