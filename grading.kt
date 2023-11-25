import java.util.Scanner
fun main(args: Array<String>){
    var number = Scanner(System.`in`)
    var mark = number.nextInt()

    if (mark>=0 && mark<=32){
        println("Result is = F")
    }
    else if (mark>= 33 && mark<= 39){
        println("Result is = D")
    }
    else if (mark>=40 && mark<= 49){
        println("Result is = C")
    }
    else if (mark>= 50 && mark<=59){
        println("Result is = B")
    }
    else if (mark>= 60 && mark<=59){
        println("Result is = A-")
        }
    else if (mark>= 60 && mark<= 69){
        println("Result is = A")
    }
    else if (mark>= 70 && mark<=79){

    }
    else {
        println("Result is = golden")
    }
}