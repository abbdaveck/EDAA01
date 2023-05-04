package queue_delegate;

// import queue_singlelinkedlist.FifoQueue;
import queue_delegate.FifoQueue;
import java.util.*;

public class Labb4Test {
    public static void main(String[] args){
        FifoQueue<Integer> fq1 = new FifoQueue<>();
        fq1.offer(1);
        fq1.offer(2);
        fq1.offer(3);
        fq1.offer(4);
        FifoQueue<Integer> fq2 = new FifoQueue<>();
        
        fq2.offer(5);
        fq2.offer(6);
        fq2.offer(7);
        fq2.offer(8);

        
        Iterator<Integer> it = fq1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(fq1);
        System.out.println(fq2);
        // fq1.append(fq2);
        System.out.println(fq1);
        System.out.println(fq2.size());
    }
}



//F2
//a) Sista värdet i en tom ArrayList har indexet -1 och i en tom LinkedList är indexet null
//b) QueueNode<E> n = last.next
//c) E e = last.next.element

//F3
//a) assertArrayEquals()
//b) assertFalse()



// • Skulle du lika gärna kunna använda ArrayList för att lagra elementen i FifoQueue
// i uppgift D1?
// Nej

// • Jämför de två olika sätten att implementera FifoQueue (uppgift D1 resp. uppgift D3).
// Fördelar/nackdelar?
// Fördel är att jag får en mer anpassningsbar klass där jag kan skriva metoder som append
// Nackdel är att de befintliga klasserna är vältestade, robusta och effektiva och min kod
// kanske inte kan mäta sig med den

// • Istället för att implementera en egen kö-klass skulle man helt enkelt kunna använda
// någon av kö-klasserna i java.util (LinkedList eller ArrayDeque). Ofta är det klokt
// att återanvända en befintlig implementering på detta sätt. I vilka situationer kan det
// vara olämpligt?
// Om jag vill ha specialiserade krav på min klass, det kan finnas prestandeproblem med
// vissa befintliga klasser samt att det kan finnas strikta krav på felsäkerhet som de 
// befintliga klasserna inte uppnår

// • Vid testning av dina klass FifoQueue får du grönt ljus. Kan du då vara säker på att
// din klass är felfri?
// Nej det kan jag inte vara, min kod kan vara skriven på ett sådant sätt att de klarar dessa
// specifika testerna men inte mer generella tester