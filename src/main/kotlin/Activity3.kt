fun main() {

    for(i in 1..5) {

        print("Enter your name person: ")
        val name: String? = readLine()!!

        print("Enter the age of $name: ")
        val age: Int = readLine()!!.toInt()

        if (age < 0) {
            println("Invalid age")

        } else {

            when {

                age in 1..17 -> println("$name is an Under age")

                age in 18..30 -> println("$name is a Young adults")

                age in 31..59 -> println("$name is an Adult")

                else -> println("$name is a senior")

            }

        }
    }
}