public class IntHashTable {

    // Node for the linked list in each table field (separate chaining).
    private static class Node {

        int Id;
        String name;
        double grade;
        Node next;




        Node(int id, String name, double grade) {
            this.Id = id;
            this.name=name;
            this.grade=grade;
            next = null;
        }
    }

    private Node[] table;   // array of NODEs


    public IntHashTable(int tableSize) {
        table = new Node[tableSize];
    }


    //Very simple hash function here
    private int hash(int id) {
        int temp = Math.abs(id);
        int index = temp % table.length;
        return index;
    }


    public void set(int id, String name, double grade) {
        int index = hash(id);
        int i = 0;
        while(i == index){
            Node newnode = new Node(id,name,grade);

        }
    }


    public String get(int id) {






    }

    /*
     Utility method: print the full content of the hash table.
     This is useful to show how separate chaining works.
     */
    public void printTable() {
        System.out.println("=== Hash Table Nodes ===");
        for (int i = 0; i < table.length; i++) {
            System.out.print("Table Node " + i + ": ");

            Node current = table[i];
            if (current == null) {
                System.out.println("empty");
            } else {
                while (current != null) {
                    System.out.print("[ID=" + current.Id +
                            ", Name=" + current.name +
                            ", Grade=" + current.grade + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
        System.out.println("==========================");
    }

    /*
     Exercise :
     Compute the average grade of all students stored in the hash table.
    */
    public double getAverageGrade() {







    }

}

