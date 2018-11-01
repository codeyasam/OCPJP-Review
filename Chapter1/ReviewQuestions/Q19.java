/* Q19: Which of the following can be inserted to override the superclass method?
*/

class LearnToWalk {
    
    public void toddle() {}
    
    class BabyRhino extends LearnToWalk {
        public void toddle() { // this could also be final
            
        }
    }
    
}