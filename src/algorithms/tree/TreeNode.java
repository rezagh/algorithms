package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

// this is another way to define tree
public class TreeNode<T> {
    T value;
    List<TreeNode<T>> children;

    public TreeNode(T value) {
        this.value = value;
        children = new ArrayList<>();
    }
}