import java.time.LocalDate

// Here we have a method and a function that does the same thing, generating a LocalDate
// Method
def createDate(year: Int, month: Int, day: Int): LocalDate = LocalDate.of(year, month, day)
createDate(2022, 2, 6)

// Function
val createDateVal: (Int, Int, Int) => LocalDate = (year, month, day) => LocalDate.of(year, month, day)
createDateVal(2022, 2, 6)

// The key difference here is how the Ides or Scaladoc will help you with the autocompletion
// If you start to write `createDate`, you'll see that the ide is able to tell you the name
// and the type of the parameters
// As with the val function, you have to guess the order of the parameters as its only tell you the type of the parameters
// create

// You can easily convert a method into a val function
val newCreateDateVal = createDate
newCreateDateVal(2022, 2, 6)

// You can also create List with method, they will automatically be converted to val function
val functions = List(createDate, createDateVal)

functions(0)(2020, 1, 1)
functions(1)(2020, 1, 1)