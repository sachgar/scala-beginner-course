// How to declare a simple class
class Sentence(pronoun: String, complement: String):
    def addVerb(verb: String) = pronoun + " " + verb + " " + complement

// We don't need the new keyword anymore in Scala3
val newSentence = Sentence("I", "apple")
newSentence.addVerb("Love")

//How to declare a case class
case class Animal(category: String, name: String)

val Pipou = Animal("Dog", "Pipou")
val Garfield = Animal("Cat", "Garfield")
val anotherPipou = Animal("Dog", "Pipou")
println(s"This is a ${Garfield.category} and his name is ${Garfield.name}")

// Case classes are compared by value
Pipou == anotherPipou
Garfield == anotherPipou

// Classes are compared by reference
val anotherSentence = Sentence("I", "apple")
newSentence == anotherSentence
newSentence.addVerb("Hate") == anotherSentence.addVerb("Hate")