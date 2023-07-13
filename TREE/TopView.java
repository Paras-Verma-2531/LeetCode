package TREE;
import java.util.*;
public class TopView {
    public ArrayList <Integer> topView(TreeNode root) {
        // Use level Order traversal :: if horizontal dis already present don't add node of that dis
        Queue <Pair> queue = new ArrayDeque <>();//since we need element with horizontal dis,root therefore create a new class
        Map <Integer, Integer> map = new TreeMap <>();
        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            //topView
            if (!map.containsKey(pair.hd)) {
                map.put(pair.hd, pair.node.val);
            }
            //bottomView
            //map.put(pair.hd, pair.node.val);
            if (pair.node.left != null) queue.offer(new Pair(pair.hd - 1, pair.node.left));
            if (pair.node.right != null) queue.offer(new Pair(pair.hd + 1, pair.node.right));
        }
        ArrayList <Integer> ans = new ArrayList <>();
        for (int key : map.keySet()) {
            ans.add(map.get(key));
        }return ans;
    }
}

