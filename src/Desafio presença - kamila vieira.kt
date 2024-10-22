open class Animal(name:String){
    open fun makeSound(){
        println("sound")
    }
}

class Dog(var name:String): Animal(name){
        override fun makeSound() {
        println("Woof!")
    }
}
class Cat(var name:String): Animal(name){
    override fun makeSound(){
        println("Meow!")
}
}

fun main() {
    var d:Dog = Dog("Cachorro")
    d.makeSound()
    var c:Cat = Cat("Gato")
    c.makeSound()

}
