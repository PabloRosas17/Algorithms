package `fun`.fizzy.tools.datastructures.linkedlist

/** @desc define as an alternative with a more appropriate semantics */
typealias Node = LinkedListNode

/** @desc LinkedList driver is meant for practice */
class LinkedList {

    /** @desc root node of the linked list, by default it is null */
    /** @analysis O(1) why? assignment */
    private var root: LinkedListNode? = null

    /** @desc size of the linked list, by default is empty */
    /** @analysis O(1) why? assignment */
    private var size = 0

    /** @desc add an element into the linked list */
    /** @analysis O(1) why? assignment comparison addition */
    fun insert(key: Int){
        val temp = Node(null,key)
        if(root == null){
            root = temp
        } else {
            temp.next = root
            root = temp
        }
        size++
        println("successfully inserted element $key and size is now ${this.size()} .")
    }

    /** @desc remove an element from the linked list */
    /** @analysis O(n) why? iterate over N nodes */
    fun delete(key: Int){
        if(root == null) return
        if(size == 1){
            root = null
            size = 0
            println("successfully deleted element $key and size is now ${this.size()} .")
            this.show()
            return
        }
        val reset = root
        var temp = root
        var after: Node? = null
        var before: Node? = null
        while (temp != null){
            before = temp
            after = temp.next?.next
            temp = temp.next
            if(temp?.data == key){
                before.next = after
                temp = null
                size--
                println("successfully deleted element $key and size is now ${this.size()} .")
                this.show()
                return
            }
        }
        println("unsuccessful delete element $key and size is ${this.size()}.")
    }

    /** @desc detect the element in the linked list */
    /** @analysis O(n) why? iterate over N nodes */
    fun search(key: Int){
        if(isEmpty()){ return }
        var temp = root
        while (temp != null){
            if(temp.data == key){
                println("element $key is in the linked list .")
                this.show()
                return
            }
            temp = temp.next
        }
        println("element $key is not in the linked list.")
    }

    /** @desc organize the elements in the linked list using bubble sort */
    /** @analysis O(n^2) why? iterate over N nodes M nodes, where M=N */
    fun sort(){
        if(isEmpty()){ return }
        val reset = root
        var temp = root
        var a = temp
        var b = temp?.next
        print("linked list before bubble sorting: ")
        this.show()
        for(i in size downTo 0){
            for(j in 0..i){
                if (a != null && b != null) {
                    if(a.data > b.data){
                        swap(a,b)
                        temp = a
                        a = a.next
                        b = b.next
                    }
                }
                temp = temp?.next
            }
            temp = reset
            a = temp
            b = a?.next
        }
        print("linked list after bubble sorting: ")
        this.show()
    }

    /** @desc inverts the elements in the linked list */
    /** @analysis O(n) why? iterate over N nodes */
    fun reverse(){
        var previous: Node? = null
        var current: Node? = null
        var next: Node? = null

        this.show()
        current = root
        while (current != null){
            next = current.next
            current.next = previous
            previous = current
            current = next
        }
        root = previous
        this.show()
    }

    /** @desc exchange the data of element m and element n in the linked list */
    /** @analysis O(1) why? assignment */
    private fun swap(m: Node, n: Node){
        val temp = m.data
        m.data = n.data
        n.data = temp
    }

    /** @desc display the linked list */
    /** @analysis O(n) why? iterate over N nodes */
    private fun show(){
        var temp = root
        print("NULL -> ")
        while (temp != null){
            print("${temp.data} -> ")
            temp = temp.next
        }
        println("NULL")
    }

    /** @desc number of elements in the linked list */
    /** @analysis O(1) why? assignment */
    private fun size(): Int{
        return this.size
    }

    /** @desc top of the list */
    /** @analysis O(n) why? iterate over N nodes inside isEmpty() show() */
    fun front(){
        if(isEmpty()){ return }
        println("front: ${root?.data}")
        this.show()
    }

    /** @desc bottom of the list */
    /** @analysis O(n) why? iterate over N nodes while traversing the list and inside isEmpty() show() */
    fun back(){
        if(isEmpty()){ return }
        val reset = root
        while (root?.next != null){
            root = root?.next
        }
        val temp = root?.data
        root = reset
        println("back: ${root?.data}")
        this.show()
    }

    /** @desc center of the list */
    /** @analysis O(n) why? iterate over N nodes while traversing the list and inside isEmpty() show() */
    fun middle(){
        if(isEmpty()){ return }
        val reset = root
        val middle = size/2
        var counter = 0
        while (root?.next != null && counter != middle){
            root = root?.next
            counter++
        }
        val temp = root?.data
        root = reset
        println("middle: $temp")
        this.show()
    }

    /** @desc determine if there is something or nothing in the linked list */
    /** @analysis O(1) why? comparison */
    private fun isEmpty(): Boolean{
        return if(root == null){
            println("root was null, empty list.")
            true
        } else {
            false
        }
    }
}