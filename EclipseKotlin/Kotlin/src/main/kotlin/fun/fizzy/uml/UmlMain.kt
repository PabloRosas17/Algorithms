package `fun`.fizzy.uml

private val mUmlDriver: UmlDriver = UmlDriver()

fun main() {
	println(" * * * * * \n I'm going to show you about uml, the beautiful language of software engineering. \n * * * * *")
	val URL = "https://docs.microsoft.com/en-us/visualstudio/modeling/uml-class-diagrams-reference?view=vs-2015&redirectedfrom=MSDN"
	println("Show me how to make a small business that has a menu, can take orders at the store, and over the phone.")
	println("You can find the diagram for this at $URL")
	mUmlDriver.order()
}