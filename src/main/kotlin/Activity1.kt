fun main(){

    for(i in 1..5){

        print("Enter the first name of Student $i: ")
        var firstName:String? = readLine()

        print("Enter the middle name of Student $i: ")
        var middleName:Char? = System.`in`.read().toChar()
        readLine()

        print("Enter the last name of Student $i:")
        var lastName:String? = readLine()

        print("Enter the age of Student $i: ")
        val age:Int = readLine()!!.toInt()?:0

        println("The name of Student is $i $firstName $middleName. $lastName")
        println("The age is $age")

    }

}