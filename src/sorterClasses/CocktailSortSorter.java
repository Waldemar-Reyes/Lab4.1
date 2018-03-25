package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E> {

	public CocktailSortSorter() {
		super(" Cocktail Sort");
	}

	@Override
	protected void auxSort() {
		boolean swapped;
		
		do {
			swapped = false;
			for (int i=0; i<=arr.length-2; i++) {
				if (cmp.compare(arr[i], arr[i+1]) > 0) {
					swapArrayElements(i, i+1);
					swapped = true;
				}
				if (!swapped) {
					break;
				}
			}
			swapped = false;
			for (int i=arr.length-2; i>=0; i--) {
				if (cmp.compare(arr[i], arr[i+1]) > 0) {
					swapArrayElements(i, i+1);
					swapped = true;
				}
			}
		} while (swapped);
	}
}
