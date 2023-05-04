package bst;

public class TreeApplication {
    public static void main(String[] args){
        BSTVisualizer vis = new BSTVisualizer("Test", 200, 200);
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>((e1, e2) -> (e1).compareTo(e2));
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(2);
        tree.add(9);
        tree.add(6);
        tree.add(5);
        tree.rebuild();
        vis.drawTree(tree);
    }
}

// a) Vad skrivs ut ut om trädets element skrivs ut i inorder? 
// Svar: 10 20 30 47
// b) Vilken höjd har trädet? 
// Svar: 3
// c) Vilken höjd får trädet om 42 sätts in?
// Svar: 4

// Om trädet är tomt är höjden -1
// annars är höjden 1 + den längsta vägen från roten ner till en nod utan "barn"
// b) Sök i dokumentationen av klassen Math på nätet. Med vilken metod kan man få det
// största värdet av två heltal? Svar: Java.lang.Math.max()

//  F3:
// int mid = (first+last)/2

// I vissa av de uppgifter du löst (t ex height och add) finns det en publik metod som
// anropar motsvarande rekursiva metod. Varför behövs bägge metoderna?
//  Eftersom dem är rekursiva metoder behöver dem parametrar som skickas med varje 
//  inrop och vi vill inte att användare ska behöva bråka med dem

// I samband med ombyggnaden av trädet används en lista av typen ArrayList för att
// mellanlagra elementen. Skulle man lika gärna kunna använda en LinkedList?
//  Nej det skulle vi inte kunna, då LinkedList har en bestämd ordning likt en ArrayList och vi vill kunna hämta värden på exakta index