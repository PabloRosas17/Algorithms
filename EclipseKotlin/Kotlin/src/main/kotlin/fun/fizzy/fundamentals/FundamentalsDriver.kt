package `fun`.fizzy.fundamentals

import kotlin.random.Random

/** @desc fundamentals driver is meant for exploring on fundamentals in programming
 * , for exploring and practicing programming riddles
 * , for exploring kotlin grammar of the language */
class FundamentalsDriver: FundamentalsAbstract(),
    FundamentalsInterface {

    /* kotlin grammar */
    val mGrammar: FundamentalsGrammar =
        FundamentalsGrammar()

    /* kotlin expressions */
    val mExpressions: FundamentalsExpressions =
        FundamentalsExpressions()

    /* kotlin idioms */
    val mIdioms: FundamentalsIdioms =
        FundamentalsIdioms()

    /* kotlin polymorphism */
    fun showPolymorphism() {
        val a: FundamentalsPolymorphism = this
        val b: FundamentalsPolymorphism =
            FundamentalsDerived()
        println("showPolymorphism()")
        a.base()
        b.base()
    }

    /* kotlin encapsulation */
    fun showEncapsulation(): String {
        val fe = FundamentalsEncapsulation()
        return "showEncapsulation() ${fe.showPrivate() + " " + fe.showPublic() + " " + fe.showProtected()}"
    }

    /* kotlin inheritance */
    fun showInheritance() {
        super.base()
    }

    /* kotlin derived inheritance */
    fun showDerivedInheritance() {
        FundamentalsDerived().derived()
    }

    /* kotlin abstract function override */
    override fun showAbstract() {
        println("showAbstract()")
        super.base()
    }

    /* kotlin abstract property override */
    override var mAbstractTemp: String = "default mAbstractTemp"
        get() = "showGetter: $field"
        set(value) { println("showSetter: $value") }

    /* kotlin interface function override */
    override fun showInterface(): String {
        mInterfaceTemp = "InterfaceTemp "
        return "showInterface() $mInterfaceTemp"
    }

    /* kotlin interface property override */
    override var mInterfaceTemp: String = "default mInterfaceTemp"
        get() = "showGetter: $field"
        set(value) { println("showSetter: $value") }
}

/* Interface */
interface FundamentalsInterface {
    var mInterfaceTemp: String
    fun showInterface(): String
}

/* Encapsulation */
class FundamentalsEncapsulation {
    /* kotlin private property */
    private var mPrivate: String = "mPrivate"
    fun showPrivate(): String {
        return this.mPrivate
    }

    /* kotlin public property */
    public var mPublic: String = "mPublic"
    fun showPublic(): String {
        return this.mPublic
    }

    /* kotlin protected property */
    protected var mProtected: String = "mProtected"
    fun showProtected(): String {
        return this.mProtected
    }
}

/* Polymorphism */
open class FundamentalsPolymorphism {
    fun base() { println("i am ${this.javaClass.superclass}") }
    inner class FundamentalsBase {
        fun base() { println("i am ${this.javaClass.superclass}") }
    }
}

/* Abstract */
abstract class FundamentalsAbstract : FundamentalsDerived() {
    abstract var mAbstractTemp: String
    abstract fun showAbstract()
}

/* Inheritance */
open class FundamentalsDerived : FundamentalsPolymorphism() {
    /* derived function calls from super class */
    fun derived() {
        super.base()
        super.FundamentalsBase().base()
        println("i am ${this.javaClass.canonicalName}")
    }
}

/* Grammar */
class FundamentalsGrammar {
    /* kotlin lateinit property */
    private lateinit var mLate: String
    private fun showLate() {
        this.mLate = "mLate"
        println(mLate)
    }

    /* kotlin lazy property */
    private val mLazy:String by lazy<String> { "mLazy" }
    private fun showLazy() {
        println(mLazy)
    }

    /* kotlin lateinit and lazy */
    fun showLateAndLazy() {
        showLate()
        showLazy()
    }

    /* kotlin enum iterating */
    fun showEnum() {
        for (i in 0..ColorsEnum.values().size-1){
            print("Color:${ColorsEnum.values()[i]} ")
        }
        print("\n")
    }

    /* kotlin return label */
    fun showReturnLabel() {
        for(i in 0..100) {
            if(i == 10){
                print("\n") //pay close attention to what this does, putting it after the for statement won't work
                return //"local return to the caller of the lambda i.e. lift"
            }
            print("i:$i ")
        }
    }
}

/* Expressions */
class FundamentalsExpressions : FundamentalSealedClass() {
    /* kotlin sealed */
    fun showSealed(){
        println(super.variable)
        super.function()
    }

    /* Kotlin conditional as an expression */
    fun showConditionalExpression(){
        val random = Random.nextInt(0, 11)

        if (random == 0 || random == 10) {
            println("random is at extreme: $random")
        } else {
            println("random is in between: $random")
        }
    }

    /* kotlin looping */
    fun showLooping(){
        val items = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
        for(item in items.indices){
            println("item.indices: $item")
        }
        var index = 0
        while(index < items.size){
            println("nth index:$index item:${items[index++]}")
        }
        for(item in items){
            println("item: $item")
            when (item) {
                "one" -> println("found one, odd")
                "three" -> println("found three, odd")
                "five" -> println("found five, odd")
                "seven" -> println("found seven, odd")
                "nine" -> println("found nine, odd")
            }
            when {
                item in "two" -> println("found two, even")
                item in "four" -> println("found four, even")
                item in "six" -> println("found six, even")
                item in "eight" -> println("found eight, even")
            }
        }
    }

    /* kotlin ranges */
    fun showRanges(){
        val map = mapOf(Pair(0,1),Pair(1,2),Pair(2,3),Pair(3,4),Pair(5,6),Pair(6,7),Pair(7,8),Pair(8,9),Pair(9,10))
        for(i in map.size downTo 0 step 2){
            println("key:${map[i]},value:${map.getValue(i)}")
        }
    }

    /* kotlin null */
    private var n: String? = null
    fun showNull(){
        if(n == null){
            println("showNull(): n is null")
        }
        this.n = "assign n so it will not be null anymore."
        if(n == null) println("showNull(): $n, is null, impossible") else println("showNull(): $n, is not null")
    }

    /* kotlin type checks */
    fun showTypeChecks(){
        val data = arrayOf("'0'",0,"'1'",1
            ,"'0.0'",0.0,"'1.1'",1.1
            ,"'false'",false,"'true'",true
            , Byte, FundamentalsExpressions()
        )
        data.forEach { it ->
            when(it){
                is String -> println("$it is type String")
                is Int -> println("$it is type Int")
                is Boolean -> println("$it is type Boolean")
                else -> println("is unknown type")
            }
        }
    }
}

/* Idioms */
class FundamentalsIdioms {
    /* Singleton */
    object Singleton {
        const val name: String = "name"
        var age: Int = 0
    }

    /* kotlin singleton */
    fun showSingleton(){
        println("Singleton.name:${Singleton.name},Singleton.age:${Singleton.age}")
    }

    /* DTO */
    data class DataClass(val name: String = "name", var age: Int = 0)

    /* kotlin dto,(pojo/poco) */
    fun showDataClass(){
        println("DataClass().name:${DataClass().name},DataClass().age:${DataClass().age}")
    }

    /* kotlin apply filter */
    fun showLetApplyWithFilter(){
        val s = "empty1".let{ s_it ->
            if(s_it.contains("1")) s_it.replace('1','0') else s_it.replace("m","M")
        }
        println("let,replace(): $s")

        val l = s.apply {
            val temp = this.toList()
            println("apply,toList(): ${temp.javaClass}")
        }

        val d = s.filter { d_it ->
            d_it.isDigit()
        }
        println("filter,isDigit(): $d")

        val r = with(s){
            capitalized()
        }
        println("capitalize(): $r")
    }

    /* kotlin Elvis Operator */
    fun showElvisOperator(){
        for (i in 0..10) {
            val random = Random.nextInt(0,10)
            val temp = if(random == 0 || random == 1) null else random
            val print: Int = temp ?: -1
            println(print)
        }
    }
}

/**
 *  @desc Inheritance Restriction, Sealed Class
 *  @limits subclassed only from inside the same package of declaration
 */
sealed class FundamentalSealedClass {
    var variable:String = "sealed class variable"
    fun function() { println("sealed class function") }
}

/**
 * @desc extension to [capitalize] deprecated. retain functionality
 */
fun String.capitalized(): String {
    return this.replaceFirstChar { item ->
        if (item.isLowerCase())
            item.titlecase(java.util.Locale.getDefault())
        else item.toString()
    }
}