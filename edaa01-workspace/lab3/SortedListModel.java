package textproc;

import java.util.Comparator;
import java.util.List;

import javax.swing.AbstractListModel;

public class SortedListModel<E> extends AbstractListModel<E> {
	private List<E> list;
	
	public SortedListModel(List<E> list) {
        this.list = list;
    }
	
	public void sort(Comparator<E> comp) {
		list.sort(comp);
		fireContentsChanged(this, 0, list.size());
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public E getElementAt(int index) {
		return list.get(index);
	}
}


//F2:
//entrySet()

//F3
//List<Map.Entry<String, Integer>> list = ...; // listan skapas
//list.sort((e1, e2) -> e1.getValue - e2.getValue());

//F4
//a) addActionListener()
//b) getText()
//c) add()
//d) setSelectedIndices()

