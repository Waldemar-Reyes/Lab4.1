package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E> {

	public CombSortSorter() {
		super("     Comb Sort");
	}
	
	@Override
	protected void auxSort() {
		
		double f = 1.3;
		int size = arr.length;
		
		if (size > 0) {
			double gap = (size-1)/f;
			
			while (gap>1) {
				int i = 0;
				int j = (int) (i + Math.floor(gap));
				
				while (j != size) {
					if (cmp.compare(arr[i], arr[j]) > 0) {
						swapArrayElements(i, j);
					}
					i++;
					j++;
				}
				gap = gap / f;
			}
		}	
	}
}