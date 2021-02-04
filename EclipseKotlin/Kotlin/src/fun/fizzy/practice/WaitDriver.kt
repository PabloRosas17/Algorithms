package `fun`.fizzy.practice

/** @desc wait driver is meant for exploring kotlin grammar of the language */
class WaitDriver {

    /* kotlin enum iterating */
    fun showEnum(){
        for (i in 0..ColorsEnum.values().size-1){
            print("Color:${ColorsEnum.values()[i]} ")
        }
        print("\n")
    }

    /* kotlin return label */
    fun showReturnLabel(){
        for(i in 0..100) lift@{
            if(i == 10){
                print("\n") //pay close attention to what this does, putting it after the for statement won't work
                return@lift //"local return to the caller of the lambda i.e. lift"
            }
            print("i:$i ")
        }
    }

    /* kotlin inheritance */
    fun showInheritance(){
        Derived().derived()
    }

    /* kotlin show lateinit and lazy */
    fun showLateAndLazy(){
        Derived().showLate()
        Derived().showLazy()
    }
}

/* inheritance base class */
open class Base {
    fun base(){ println("i am ${this.javaClass.superclass}") }
}

/* inheritance derived class */
class Derived : Base() {
    private lateinit var mLate: String

    private val mLazy:String by lazy<String> { "mLazy" }

    fun derived(){
        super.base()
        println("i am ${this.javaClass.canonicalName}")
    }

    fun showLate(){
        this.mLate = "mLate"
        println(mLate)
    }

    fun showLazy(){
        println(mLazy)
    }
}