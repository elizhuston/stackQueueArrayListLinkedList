package arrayList;

public class MyArrayList <T> {
	T[] thing;
	int size;

	public MyArrayList() {
		super();
//		T[] arr = (T[]) new Object[this.vals.length * 2];
		this.thing =(T[]) new Object[10];
		this.size = 0;
	}

	public Object getObject(int idx) throws IndexOutOfBoundsException {
		return this.thing[idx];
	}

	public void setObject(T thing, int idx) throws IndexOutOfBoundsException {
		this.thing[idx] = thing;
	}

	public int size() {
		return this.size;
	}

	public void appendObject(T thing) {

		// if necessary, double the size of Object array
		// copy the values from the existing array to the new one
		if (this.size >= this.thing.length) {
			T[] arr = (T[]) new Object[this.thing.length * 2];
			for (int i = 0; i < this.size; i++) {
				arr[i] = this.thing[i];
			}
			this.thing = arr;
		}
		this.thing[this.size] = thing;
		this.size++;
	}

	public void appendObject(T[] junk) {
		for (int i = 0; i < junk.length; i++) {

			if (this.size >= this.thing.length) {
				T[] arr = (T[]) new Object[this.thing.length * 2];
				for (int j = 0; j < this.size; j++) {
					arr[j] = this.thing[j];
				}
				this.thing = arr;
			}
			this.thing[this.size] = junk[i];
			this.size++;
		}

	}

	public void removeObject(int idx) {
		T[] newArr = (T[]) new Object[this.thing.length];
		int newArrIdx = 0;

		for (int i = 0; i < this.size; i++) {
			if (i == idx) {
				continue;
			}
			newArr[newArrIdx] = this.thing[i];
			newArrIdx++;
		}
		this.thing = newArr;
		this.size--;
	}
}
