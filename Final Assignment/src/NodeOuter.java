//Code for NodeOuter class pulled from Chapter 11 Practical Application then modified for final assignment


public class NodeOuter {

//Class Node with the data and the child nodes

 class Node {

  String keyEntry;
  String valueEntry;

Node leftChild;

 Node rightChild;

 

  Node (String keyEntry, String valueEntry) {

  this.keyEntry = keyEntry;
  this.valueEntry = valueEntry;

  leftChild = rightChild = null;

  }

 }

  //root node for the binary tree

 Node root;

 //Constructor method

 

 public NodeOuter(){

  root = null;

 }

 

 //Insert method for new values in the tree

 public void insert (String key, String value){

  root = insertNode(root, key, value);

 }

 

 //Insert recursive call for inserting from the root, in the right place

 public Node insertNode (Node node, String keyEntry, String valueEntry){

  if (node == null){

   node = new Node(keyEntry, valueEntry);

   return node;

  }

 

  if (keyEntry.compareTo(node.keyEntry) < 0){

   node.leftChild = insertNode(node.leftChild, keyEntry, valueEntry);

  } else if (keyEntry.compareTo(root.keyEntry) > 0){

 

  node.rightChild = insertNode(node.rightChild, keyEntry, valueEntry);

  }

 return node;

 }

  //Find method asking for the node to find

 public String find(String key){

	 Node node = findNode(root, key);
	 
	 return node.valueEntry;
  	
 }

 //Find recursive method using the root node.

 public Node findNode (Node node, String key){

  if (key.compareTo(node.keyEntry) == 0){

   return node;

  }

  if (key.compareTo(node.keyEntry) < 0){

   return findNode(node.leftChild, key);

  } else if (key.compareTo(node.keyEntry) > 0){

   return findNode(node.rightChild, key);

  }

  return null;

 }
}
 