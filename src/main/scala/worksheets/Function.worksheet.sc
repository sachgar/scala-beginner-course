// We can create an anonymous function (a function with no name, also called a lambda)
(x: Float) => x

// We can give it a name
val getYourSize = (size: Float) => size
getYourSize(185)

// We can create function without parameters
val getDevSize = () => 176
getDevSize()

// To specify the return type of a function
val getDevSizeFloat = () => 176: Float
getDevSizeFloat()

// Function can have more than one parameters
val getYourSizeTimeX = (size: Float, time: Int) => size * time
getYourSizeTimeX(185, 2)

// The classic function syntax is
val getYourFullNameClassic = (firstName: String, surname: String) => {
    val fullName = firstName + " " + surname
    fullName
}
getYourFullNameClassic("Didier", "De Jong")

// To declare a function with the indented syntax (new scala 3 feature)
val getYourFullNameIndentation = (firstName: String, surname: String) =>
    val fullName = firstName + " " + surname
    fullName
getYourFullNameIndentation("Bob", "Dupond")