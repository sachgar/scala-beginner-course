/**
    * Trait are abstract data types containing certain fields and methods
    * To declare a simple traits
    */
trait AnimalColor:
    def category(category: String): String
    def name(name: String): String

// It's also possible to have a default implementation
trait AnimalWithDefaultImplementation: 
    def color(color: String): String =
        color.toLowerCase()


/**
    * A class can only extend one other class however it can extend multiple traits
    * To extend a class we should use "extends"
    * If we want extend our class to multiple traits we should use "with"
    * It's possible to override an implementation with "override"
    */

class MyAnimal extends AnimalColor with AnimalWithDefaultImplementation :
    var animalCategory: String = "UNKNOW"
    var animalName: String = "Unknow"
    var animalColor: String = "unknow"
    override def category(category: String): String = 
        animalCategory = category.toUpperCase()
        animalCategory
    override def name(name: String): String = 
        animalName = name
        animalName
    override def color(color: String): String =
        animalColor = color.toLowerCase()
        animalColor

val myCat = MyAnimal()
myCat.category("Cat")
myCat.color("Blue")
println(myCat.animalCategory + " " + myCat.animalName + " " + myCat.animalColor)
