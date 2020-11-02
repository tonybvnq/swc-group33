public class CharCoordinates implements Container {
    public char[] charcoordinates = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    @Override
    public Iterator getIterator() {
        return new CoordinateIterator();
    }

    private class CoordinateIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < charcoordinates.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return charcoordinates[index++];
            }
            return null;
        }
    }
}
