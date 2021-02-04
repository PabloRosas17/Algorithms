package `fun`.fizzy.principles

private val mPrinciplesDriver: PrinciplesDriver = PrinciplesDriver()

fun main(args: Array<String>){
    println("* * * * * Dependency Injection by constructor. * * * * *")
    mPrinciplesDriver.fireDiByConstructor()
    println("* * * * * Dependency Injection by interface. * * * * *")
    mPrinciplesDriver.fireDiByInterface()
    println("* * * * * Dependency Injection by setter. * * * * *")
    mPrinciplesDriver.fireDiBySetter()
    println("* * * * * Law of Demeter principle. * * * * *")
    mPrinciplesDriver.fireLawOfDemeter()
}