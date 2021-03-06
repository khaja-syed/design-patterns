package com.alg.oodesign.solution32;


public class BreakfastMenu  {
	private MenuItem[] items;
	private int size;
	private int capacity;
	
	public BreakfastMenu(int capacity) {
		this.capacity = capacity;
		items = new MenuItem[capacity];
	}
	
	public void addItem(MenuItem item) {
		if(size == capacity)
			System.out.println("You cannot add item");
		else 
			items[size++] = item;
	}
	
	public Iterator iterator() {
		return new BreakfastIterator();
	}

	class BreakfastIterator implements Iterator {
		private int current;

		@Override
		public boolean hasNext() {
			if(current < items.length) return true;
			return false;
		}

		@Override
		public MenuItem next() {
			return items[current++];
		}

		@Override
		public void reset() {
			current = 0;		
		}	
	}

}
