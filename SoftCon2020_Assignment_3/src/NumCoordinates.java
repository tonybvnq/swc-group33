public class NumCoordinates implements Container{
    public char[] numcoordinates = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @Override
    public Iterator getIterator() {
        return new NumCoordinateIterator();
    }

    private class NumCoordinateIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < numcoordinates.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return numcoordinates[index++];
            }
            return null;
        }
    }
}
