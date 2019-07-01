import com.rsk.Person

/*
fun main(args: Array<String>) {
    println("Hello, World");

    val kevin = Person()

    kevin.Name = "Kevin"

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    // kevin = Person()             // This line will have error since val cannot be reassigned

}*/

fun main(args: Array<String>) {
    println("Hello, World");

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}