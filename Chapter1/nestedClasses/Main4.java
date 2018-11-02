/* Anonymous Inner Class 
*
* a local inner class that does not have a name
*/

class AnnonInner {
    
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }  
        };
        return basePrice - sale.dollarsOff();
    }
    
}

class AnnoInner2 {
    
    interface SaleTodayOnly {
        int dollarsOff();
    }
    
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() { return 3; }  
        };
        return basePrice - sale.dollarsOff();
    }
    
}

class AnnonInner3 {
    
    interface SaleTodayOnly {
        int dollarsOff();
    }
    
    public int pay() {
        return admission(5, new SaleTodayOnly() {
           public int dollarsOff() {
               return 3;
           } 
        });
    }
    
    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}