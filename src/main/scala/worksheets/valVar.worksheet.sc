// How to assign a val
val age = 22

// How to assign a var
var apples = 10
var bananas = 14
var fruits = apples
println("I have " + fruits + " fruits")

// How to reassign a var
println("I have " + apples + " apples")
apples = 12
println("Now I have " + apples + " apples")
fruits = apples + bananas 
println("Finally I have : " + fruits + " fruits")

// We can also use the old value of our var to calculate the new one
bananas = bananas + 40
println("Now I have " + bananas + " bananas")