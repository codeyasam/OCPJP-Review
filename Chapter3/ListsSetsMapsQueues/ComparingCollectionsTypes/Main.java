/* Comparing Collection Types
*
* Type          Can contain duplicate elements?        Elements ordered?         Has keys and values?         Must add/remove in specific order?
* List          Yes                                    Yes (by index)            No                           No
* Map           Yes (for values)                       No                        Yes                          No
* Queue         Yes                                    Yes (retrieved in         No                           Yes
                                                       defined order)
* Set           No                                     No                        No                           No
*/

/* Collection attributes
* Type         Java Collections Framework interface          Sorted?           Calls hashCode?                Calls compareTo? 
* ArrayList    List                                          No                No                             No
* ArrayDeque   Queue                                         No                No                             No
* HashMap      Map                                           No                Yes                            No
* HashSet      Set                                           No                Yes                            No
* Hashtable    Map                                           No                Yes                            No
* LinkedList   List, Queue                                   No                No                             No
* Stack        List                                          No                No                             No
* TreeMap      Map                                           Yes               No                             Yes
* TreeSet      Set                                           Yes               No                             Yes
* Vector       List                                          No                No                             No
*/

// All data structures allow nulls except these: 
// TreeMap: no null keys
// Hashtable: no null keys or values
// TreeSet: no null elements
// ArrayDeque: no null elements

/* Choosing the right collection type
* Which class do you choose when you want:             Answer(single best type)         Reason
* to pick the top zoo map off a stack of maps          ArrayDeque                       The description is of a last in, first out data structure, so you need a stack,
                                                                                        which is a type of Queue. (Stack would also match this description, but it shouldn't be used for new code.)
* to sell tickets to people in the order in            LinkedList                       The description is a first in first out data structure, so you need a queue. You also needed indexes, and LinkedList is the only class to match both requirements.
  which they appear in line and tell them their
  position in line 
* to write down the first names of all of the          ArrayList                        Since there are duplicates, you need a list rather than a set. You will be accessing the list more ofthen than updatin it, since three year old ask the same question
  elephants so that you can tell them to your                                           over and over, making an ArrayLIst better than a LinkedList. Vector and Stack arent used in new code.   
  friends three year old every time she asks.
  (The elephants do not have unique first names.)
* to list the unique animals that you want to see      HashSet                          They keyword in the description is unique. When you see unique. think set. Since there were no requirements to have a sorted order or to remember the insertion order, you use the most efficient set. 
  at the zoo today 
* to list the unique animals that you want to see      TreeSet                          Since it says unique, you need a set. This time, you need to sort, so you cannot use HashSet. 
  at the zoo today in alphabetical order 
* to lookup animals based on a unique identifier       HashMap                          Looking up by key should make you think of a map. Since you have no ordering or sorting requirements, you should use the most basic map. 
*/