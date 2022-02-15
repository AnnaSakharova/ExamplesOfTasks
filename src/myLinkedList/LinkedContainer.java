package myLinkedList;

import java.util.Iterator;

// Чтобы итерироваться в обратном порядке нужен method descendingIterator()
// который наследуется от Dequeue который она наследует от Queue
public class LinkedContainer<E> implements Linked<E>, Iterable<E>, DescendingIterator<E> {

    // есть замкнутый связный список когда первый элемент указывает на последний а последний на первый
    // мы делаем незамкнутый, где firstNode и lastNode будут ссылаться на null.
    // когда будем вставлять на последний элемент будем вставать в lastNode, но потом
    // создадим lastNode с нулями. Тот же принцип будет для первой ноды.
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    // lastNode - раз нода последняя, текущегг элемента у нее не будет, то есть = null
    // предыдущий элемент будет firstNode
    // так как она последняя, то следующего элемента у нее не будет
    //
    // firstNode - само значение это по сути заглушка
    // предыдущего у нее нет, так как он первая
    // а следующий элемент будет указывать на последний
    LinkedContainer() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }


    private class Node<E> {
        private E currentElement;
        private Node<E> previosElement;
        private Node<E> nextElement;

        private Node(E currentElement, Node<E> previosElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.previosElement = previosElement;
            this.nextElement = nextElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setPreviosElement(Node<E> previosElement) {
            this.previosElement = previosElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getPreviosElement() {
            return previosElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<E>(null, null, next);
        next.setPreviosElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }

        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {

            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }



}
