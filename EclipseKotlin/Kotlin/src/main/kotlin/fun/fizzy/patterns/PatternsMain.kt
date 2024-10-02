package `fun`.fizzy.patterns

private val mPatternsDriver: PatternsDriver = PatternsDriver()

fun main() {
	println("* * * * * Observer pattern. * * * * *")
	val oo = ObservingObject()
	oo.addObserver(mPatternsDriver)
	oo.notifyObservers("I am a message passed through the observer and will succeed.")
	oo.removeObserver(mPatternsDriver)
	oo.notifyObservers("I am a message passed through the observer and will fail.")
}