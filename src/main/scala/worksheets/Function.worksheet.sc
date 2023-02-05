// We can declare a simple function without parameters like that
val getDevSize = () => 176
println(getDevSize())

// We can declare a function with one parameters like that
val getYourSize = (size: Float) => size
println(getYourSize(185))

// The classic function syntax is
val getYourFullNameClassic = (firstName: String, surname: String) => {
    val fullName = firstName + " " + surname
    fullName
}
println(getYourFullNameClassic("Didier", "De Jong"))

// To declare a function with the indented syntax (new feature with scala 3)
val getYourFullNameIndentation = (firstName: String, surname: String) =>
    val fullName = firstName + " " + surname
    fullName
println(getYourFullNameIndentation("Bob", "Dupond"))