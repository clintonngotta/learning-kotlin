//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// const should be defined outside the function and will never change , value must be know before execution

fun main() {


var greetings = """
    Hello
        How Are
    You
""".trimIndent()

    println(greetings)


    var greetingsWithParams = """
    Hello %S
        How Are
    You
""".trimIndent()

    println(greetingsWithParams.format("Clinton"))


}