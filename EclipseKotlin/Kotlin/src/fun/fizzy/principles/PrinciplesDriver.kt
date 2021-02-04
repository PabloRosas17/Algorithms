package `fun`.fizzy.principles

/** @desc principles driver is meant for exploring on principles in programming */
class PrinciplesDriver : D {

    /* di by constructor. */
    fun fireDiByConstructor() {
        val m1 = B(A(), C().mC)
        m1.printFromA()
        m1.printFromB()
        m1.printFromC()
    }

    /* di by interface. */
    fun fireDiByInterface(){
        this.printFromD()
        this.printFromE(E())
    }

    /* di by setter. */
    fun fireDiBySetter(){
        val m2 = F()
        m2.setG(G())
        m2.printFromF()
        m2.g.printFromG()
    }

    /* law of demeter. */
    fun fireLawOfDemeter(){
        val m3 = ClearH(I())
        val m4 = UnclearH(I())
    }
}

/**
 * Example used for di by constructor.
 */
class A {
    val mA: String = "i am mA from ${this.javaClass.simpleName}"
}

/**
 * Example used for di by constructor.
 */
class B(private val a: A, private val c: String) {
    private val mB: String = "i am mB from ${this.javaClass.simpleName}"

    fun printFromA() {
        println(this.a.mA)
    }
    fun printFromB(){
        println(this.mB)
    }

    fun printFromC(){
        println(this.c)
    }
}

/**
 * Example used for di by constructor.
 */
class C {
    val mC: String = "i am mC from ${this.javaClass.simpleName}"
}

/**
 * Example used for di by interface.
 */
interface D  {
    fun printFromD(){
        val mD: String = "i am mD from D"
        println(mD)
    }
    fun printFromE(type : E){
        println(type.mE)
    }
}

/**
 * Example used for di by interface.
 */
class E {
    val mE: String = "i am mE from ${this.javaClass.simpleName}"
}

/**
 * Example used for di by setter.
 */
class F {
    private val mF: String = "i am mF from ${this.javaClass.simpleName}"

    lateinit var g: G
        private set

    /* wishing to show setter di will not be *idiomatic* for kotlin */
    fun setG(gg: G){
      this.g = gg
    }

    fun printFromF(){
        println(mF)
    }
}

/**
 * Example used for di by setter.
 */
class G {
    private val mG: String = "i am mG from ${this.javaClass.simpleName}"

    fun printFromG(){
        println(mG)
    }
}

/**
 * Example used for law of demeter.
 */
class UnclearH {
    private lateinit var cmI: I
    constructor(unclear: Alphabet){ // <---this is too generic
        this.cmI = unclear.notI
        println("unclear and generic -> ${cmI.mI} as cmI in UnclearH")
    }
}

/**
 * Example used for law of demeter.
 */
class ClearH {
    private lateinit var cmI: I
    constructor(clear: I){ // <---this is more concrete
        this.cmI = clear
        println("clear and specific -> ${cmI.mI} as cmI in ClearH")
    }
}

/**
 * Example used for law of demeter.
 */
abstract class Alphabet {
    abstract var notI: I
}

/**
 * Example used for law of demeter.
 */
class I : Alphabet() {
    val mI: String = "i am mI from ${this.javaClass.simpleName}"
    override var notI: I = this
}