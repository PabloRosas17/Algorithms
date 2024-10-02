package `fun`.fizzy.tools.datastructures.bst

/** @desc define as an alternative with a more appropriate semantics */
typealias Node = BinarySearchTreeNode

/** @desc BinarySearchTree driver is meant for practice */
@Suppress("LiftReturnOrAssignment")
/**
 * @suppress when a return is set as an assignment
 * , it is automatically flagged
 * , but this jeopardizes the logic
 * , plus the readability becomes less
 * , so, suppress.
 */
class BinarySearchTree {

    /** @desc root node of the binary search tree, by default it is null */
    /** @analysis O(1) why? assignment */
    private var root: BinarySearchTreeNode? = null

    /** @desc is the tree empty */
    /** @analysis O(1) why? comparison */
    private fun isEmpty(): Boolean { return root==null }

    /** @desc add an element to the tree */
    /** @analysis O(log(n)) why? inner addNode dominates */
    fun insert(data: Int){ root = addNode(data,root) }
    /** @desc recursively add an element to the tree */
    /** @analysis O(log(n)) why? N nodes visited will be the height of the tree */
    private fun addNode(data: Int, node: Node?): Node? {
        if(node == null){
            root = Node( null, null, data)
            return this.root
        }
        if(data < node.data!!){ node.left = addNode(data, node.left) }
        if(data > node.data!!){ node.right = addNode(data, node.right) }
        return node
    }

    /** @desc remove an element from the tree */
    /** @analysis O(log(n)) why? inner removeNode dominates */
    fun remove(data: Int){ removeNode(data,root) }
    /** @desc recursively remove an element to the tree */
    /** @analysis O(log(n)) why? N nodes visited will be the height of the tree */
    private fun removeNode(data: Int, node: Node?): Node?{
        //found the tree was empty
        if(node == null) return null
        //find the left as data is less than the current node data
        if(data < node.data!!){ node.left = removeNode(data, node.left) }
        //find the right as data is greater than the current node data
        else if(data > node.data!!){ node.right = removeNode(data, node.right) }
        //found the node we want to remove as data is equal to the current node data
        else{
            //node has zero children
            if(isLeaf(node)){
                node.data = null
                return null
            }
            //node has one child on the right
            else if (node.left == null) return node.right
            //node has one child on the left
            else if (node.right == null) return node.left
            //node has two children one on the left one on the right
            else{
                val temp = min(node)
                node.data = temp?.data
                if(node.data != null){ node.right = removeNode(node.data!!,node.right) }
            }
        }
        return node
    }
    /** @desc is an element a leaf in the tree */
    /** @analysis O(1) why? comparison */
    private fun isLeaf(node: Node?): Boolean {
        return node != null && node.left == null && node.right == null
    }

    /** @desc remove all elements from the tree */
    /** @analysis O(?) why? inner clear dominates */
    fun empty(){ clear(root) }
    /** @desc recursively remove all elements from the tree */
    /** @analysis O(n) why? visit each node at least once which is N steps */
    private fun clear(node: Node?): Node?{
        if(node == null) return null
        if (node.left != null){
            node.left = null
            clear(node)
        }
        if (node.right != null){
            node.right = null
            clear(node)
        }
        node.data = null
        return node
    }

    /** @desc organize using tree sort */
    /** @analysis O(n) why? visit N elements */
    fun sort() { inOrder(root) }

    /** @desc locate a node */
    /** @analysis O(log(n)) why? inner find dominates */
    fun findNode(data: Int){ println("find: $data is ${find(data,root)?.data}") }
    /** @desc recursively traverse the tree to locate a node */
    /** @analysis O(log(n)) why? N nodes visited will be the height of the tree */
    private fun find(data: Int, node: Node?): Node?{
        if(node == null){ return null }
        else if(data < node.data!!){ return find(data, node.left) }
        else if(data > node.data!!){ return find(data, node.right) }
        else { return node }
    }

    /** @desc locates the minimum in the tree */
    /** @analysis O(log(n)) why? inner min dominates */
    fun findMinNode(){ println("minimum: ${min(root)?.data}") }
    /** @desc recursively traverse the tree to find the minimum */
    /** @analysis O(log(n)) why? N nodes visited will be the height of the tree */
    private fun min(node: Node?): Node? {
        return if(node == null) null
        else if(node.left == null) node
        else min(node.left)
    }

    /** @desc locates the maximum in the tree */
    /** @analysis O(log(n)) why? inner max dominates */
    fun findMaxNode(){ println("maximum: ${max(root)?.data}") }
    /** @desc recursively traverse the tree to find the maximum */
    /** @analysis O(log(n)) why? N nodes visited will be the height of the tree */
    private fun max(node: Node?): Node? {
        return if(node == null) null
        else if(node.right == null) node
        else max(node.right)
    }

    /** @desc display the tree in inorder */
    /** @analysis O(n) why? inner inorder dominates */
    fun showInOrder(){
        inOrder(root)
        print('\n')
    }
    /** @desc recursively traverse the tree by the order of inorder */
    /** @analysis O(n) why? visit N elements */
    private fun inOrder(node: Node?){
        if(node == null){ return }
        inOrder(node.left)
        print("${node.data} ")
        inOrder(node.right)
    }

    /** @desc display the tree in preorder */
    /** @analysis O(n) why? inner preorder dominates */
    fun showPreOrder(){
        preOrder(root)
        print('\n')
    }
    /** @desc recursively traverse the tree by the order of preorder */
    /** @analysis O(n) why? visit N elements */
    private fun preOrder(node: Node?){
        if(node == null){ return }
        print("${node.data} ")
        preOrder(node.left)
        preOrder(node.right)
    }

    /** @desc display the tree in postorder */
    /** @analysis O(n) why? inner postorder dominates */
    fun showPostOrder(){
        postOrder(root)
        print('\n')
    }
    /** @desc recursively traverse the tree by the order of postorder */
    /** @analysis O(n) why? visit N elements */
    private fun postOrder(node: Node?){
        if(node == null){ return }
        postOrder(node.left)
        postOrder(node.right)
        print("${node.data} ")
    }
}