package Iterator;

public class NameRepository implements Container {

    public String names[] = {"Robert","John","Julie","Lora"};



    @Override
    public Iterators getIterator() {
        return null;
    }

    private class NameIterator implements Iterators{

        int index;

        @Override
        public boolean hasNext() {

            if(index<names.length){
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
