package `fun`.fizzy.uml /* #12 - package */

/* import ... #13 - import */

/**  @desc uml driver is meant for exploring uml, comments in this file are only for uml */
class UmlDriver {
	private var mOrdersList: ArrayList<Order> = mutableListOf<Order>() as ArrayList<Order>
	
	fun order(){
		for(i in 0..2){
			val o = PhoneOrder(OrderItem(i))
			val m = MenuItem("MenuItem#$i")
			o.addItem(m)
			mOrdersList.add(o)
		}
		mOrdersList.forEach { order ->
			order.getOrderItemList().forEach { item ->
				println("$order , ${item.mMenuName}")
			}
		}
	}
}

abstract class Order() { /* #5 - association, Order to Menu */
	abstract var mTotalPrice: Double /* #3 - attribute */
	abstract fun addItem(item: MenuItem) /* #4 - operation */
	abstract fun removeItem(item: MenuItem)
	abstract fun getOrderItemList(): ArrayList<MenuItem>
}

abstract class Menu(){ /* #1 - class */
	abstract var mMenuName: String
}

class PhoneOrder(private val mOrderItem: OrderItem): Order(), OrderIf by mOrderItem { /* #9 - generalization, PhoneOrder to Order */
	override var mTotalPrice: Double = 0.0

	override fun addItem(item: MenuItem){
		mOrderItem.mOrderItemList.add(item)
	}
	override fun removeItem(item: MenuItem){
		mOrderItem.mOrderItemList.remove(item)
	}
	override fun getOrderItemList(): ArrayList<MenuItem>{
		return mOrderItem.mOrderItemList
	}
}

class MenuItem(var name: String): Menu() { /* #5a - aggregation, MenuItem to Menu */
	override var mMenuName: String = name
}

class OrderItem(var id: Int): OrderIf { /* #5b - composition, OrderItem to Order */
	override var mOrderItemList: ArrayList<MenuItem> = mutableListOf<MenuItem>() as ArrayList<MenuItem>
}

interface OrderIf { /* #10 - interface */
	var mOrderItemList: ArrayList<MenuItem>
}