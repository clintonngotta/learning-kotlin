//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")
    println("Hello, ${name}!")
    println("Hello, $name!")


    // declared with var and val keywords
    var techstack: String = "KMM"
    val launched: Int = 2017
    println("Did you know that ${techstack} was launched in $launched")

}