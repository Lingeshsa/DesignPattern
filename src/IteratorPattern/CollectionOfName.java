package IteratorPattern;

public class CollectionOfName implements Container {
	public String name[]= {"Sakthi vel","Vinn","Lingesh","Ravi"};

	@Override
	public Iterator getIerator() {
		
		return new CollectionOfNameIterate() ;
	}

	

	private class CollectionOfNameIterate implements Iterator {
		 int i;

		@Override
		public boolean hasNext() {
			if(i<name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return name[i++];
			}
			return null;
		}

		 
	}
}


