
class BobCat {
    public void findDen() {
        
    }
}

class BobCatMother extends BobCat {
    
    @Override
    public void findDen() { //will compile
        
    }
    
    @Override
    public void findDen(boolean b) { // will not compile, it is overloaded
        
    }
}
