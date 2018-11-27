/* Introducing Concurrent Collections 
* 
* Using concurrent collections is extremely convenient in practice. It also prevents us from introducing mistakes in own custom implementation
*/

// without concurrent collections
class ZooManager {
    
    private Map<String, Object> foodData = new HashMap<String, Object>();
    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }
    
}