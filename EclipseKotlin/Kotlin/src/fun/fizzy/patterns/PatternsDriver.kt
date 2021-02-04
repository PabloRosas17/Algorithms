package `fun`.fizzy.patterns

/** @desc patterns driver is meant for exploring patterns */
class PatternsDriver: MaObserver {
	/* Action performed by the observer.*/
	override fun update(mamsg : String) {
		println(mamsg)
	}
}

/**
 * Observer.
 */
interface MaObserver {
	/* Action performed by the observer.*/
	fun update(mamsg : String)
}

/**
 * ObserverObject.
 */
class ObservingObject {
	/* List that contains the observers.*/
	private val maListOfObservers: MutableList<MaObserver> = mutableListOf<MaObserver>()

	/* Method used to add an observer to the observers.*/
	fun addObserver(observer: MaObserver) {
		this.maListOfObservers.add(observer)
	}

	/* Method used to remove an observer from the observers.*/
	fun removeObserver(observer: MaObserver){
		this.maListOfObservers.remove(observer)
	}

	/* Method used to notify an observer.*/
	fun notifyObservers(mamsg : String){
		this.maListOfObservers.forEach {
			it -> it.update(mamsg)
		}
	}
}