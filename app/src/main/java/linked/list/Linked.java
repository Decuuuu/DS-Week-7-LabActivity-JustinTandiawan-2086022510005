package linked.list;

class LinkedList {
    LinkedNode head;

    public LinkedList() {
        head = null;
    }


    public void tambahDepan(int data) {
        LinkedNode newNode = new LinkedNode(data);
        newNode.next = head;
        head = newNode;
    }


    public void cetak() {
        LinkedNode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public void tambahBelakang(int data) {
        LinkedNode newNode = new LinkedNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        LinkedNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }


    public boolean cari(int key) {
        LinkedNode current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }


    public void hapus(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        LinkedNode current = head;

        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
        }
}
}
