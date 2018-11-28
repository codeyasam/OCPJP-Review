/* Introducing Concurrent Collections 
* 
* Using concurrent collections is extremely convenient in practice. It also prevents us from introducing mistakes in own custom implementation

*/

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

// without concurrent collections
class ZooManager {
    
    private Map<String, Object> foodData = new HashMap<String, Object>();
    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }
    
    public synchronized Object get(String key) {
        return foodData.get(key);    
    }
    
}

// with concurrent collections
class ZooManager2 {
    
    private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
    public void put(String key, String value) {
        foodData.put(key, value);
    }
    
    public Object get(String key) {
        return foodData.get(key);
    }
    
}
