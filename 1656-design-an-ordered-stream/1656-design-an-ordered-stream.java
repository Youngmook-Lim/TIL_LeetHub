import java.util.*;

class OrderedStream {
    
    String[] streamArr;
    int idx;

    public OrderedStream(int n) {
        streamArr = new String[n];
        idx = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        streamArr[idKey - 1] = value;
        List<String> list = new ArrayList<>();
        while (idx < streamArr.length && streamArr[idx] != null) {
            list.add(streamArr[idx++]);
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */