###Binary tree

Is a hierarchal data structure in which each node has at most two children.
The child nodes are called ***left child*** and ***right child***

####Definitions 

1 - A binary tree have a maximum of a 2^l nodes at level _l_ if the level of the root is zero

2 - When each node of a binary tree has one or two children, the number of leaf nodes (node with no childrens)
is one more than the number of nodes that have two children

3 - There exists a maximum of (2ˆh -1) nodes in a binary tree if its height is h,
and the height of a leaf node is one

4 - If there exists L leafs nodes in a binary tree, then it has at least L+1 levels

5 - A binary tree of n nodes has log2(n+1) minimum number of levels minimum height

6 - The minimum and the maximum height of a binary tree having n nodes are [log2ˆn] and n, respectively

7 - A binary tree of n nodes has (n+1) null references

#### Types of Binary tree

- Full Binary Tree
- Perfect Binary Tree
- Complete Binary Tree
- Degenerate of Pathlogical Tree
- Skewed Binary Tree
- Balanced Binary Tree

#### Full binary tree
Each internal node has **one** or **two** children

![full binary search](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/full_binary_tree.png)

### Perfect binary tree
All the leaf nodes are at the same level, and each internal node has two children

![perfect binary tree](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/perfect_binary_tree-Copy-1.png)

#### Complete binary tree
All leafs are completely filled. 

![complete binary tree](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/complete_binary_tree-2.png)

#### Degenerate or Pathological tree
Each internal node has a single child

![degenerate or pathological](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/degenerate_tree-1.png)

#### Skewed binary tree
All of its internal nodes have exacle one child, and either left children or right children
dominate the tree. There is tow types of skewed binary tree: **Left Skewed and right skewed binary tree**

![skewed](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/skewed_binary_tree-1.png)

#### Balanced binary tree
Difference of height between left and right subtrees for each node it's almost one

![balenced](https://www.baeldung.com/wp-content/uploads/sites/4/2020/07/balanced_binary_tree-1.png)