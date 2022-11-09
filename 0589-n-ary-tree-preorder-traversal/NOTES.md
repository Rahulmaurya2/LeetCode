class Solution {
// राशन कार्ड रजिस्ट्रेशन टिम
public List<Integer> preorder(Node root) {
//परिवार के सभी सदस्यों का नाम नोट होगा राशन कार्ड रजिस्टर मे
List<Integer> ans = new ArrayList<>();
//अगर घर में ताला है
if (root == null) return ans;
//सब से एक-एक बार मुलाकात होगी और उनका नाम रजिस्टर में नोट होगा
traversal(root,ans);
//परिवार के सभी सदस्यों का नाम
return ans;
}
public static void traversal(Node node, List<Integer> ans){
// अगर युवा है तो
if(node.children == null){
//युवा का नाम नोट किया रजिस्टर मे
ans.add(node.val) ;
//वापसी
return;
}
//नाम नोट किया रजिस्टर मे
ans.add(node.val);
//सभी बच्चों से मिलने के लिए
for (Node child: node.children){
//एक-एक करके सबसे मुलाकात होगी
traversal(child, ans);
}
}
}