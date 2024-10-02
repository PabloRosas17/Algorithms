package `fun`.fizzy.tools.datastructures.directaccesstable

/** @desc DirectAddressTable driver is meant for practice */
@Suppress("ConvertSecondaryConstructorToPrimary")
class DirectAddressTable {

    /** @desc represents the container which holds a slot of direct memory */
    /** @analysis O(1) why? assignment */
    private val table = arrayOfNulls<Table?>(10)

    /** @desc prefill memory as empty */
    /** @analysis O(n) why? access n element to fill */
    constructor(){ for(i in table.indices){ table[i]= Table(-1,-1) } }

    /** @desc finds an element directly in the address */
    /** @analysis O(1) why? memory access */
    fun search(k: Int): Int? {
        return table[k]?.key
    }

    /** @desc adds an element directly in the address */
    /** @analysis O(1) why? memory access assignment */
    fun insert(x: Table){
        table[x.key]=x
    }

    /** @desc removes an element directly in the address */
    /** @analysis O(1) why? memory access assignment */
    fun delete(x: Table){
        table[x.key] = null
    }
}