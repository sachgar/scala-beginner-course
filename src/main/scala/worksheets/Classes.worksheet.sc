// How to declare a simple class
class Sentence(pronoun: String, complement: String):
    def addVerb(verb: String) = println(pronoun + " " + verb + " " + complement)

val newSentence = Sentence("I", "apple")
newSentence.addVerb("Love")

//How to declare a case class
case class Animal(category: String, name: String)
val Pipou = Animal("Dog", "Pipou")
val Garfield = Animal("Cat", "Garfield")
val Jerry = Animal("Mouse", "Jerry")
println(s"This is a ${Garfield.category} and his name is ${Garfield.name}")