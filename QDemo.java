class Queue {
    char q[];
    int putlog, getloc;

    Queue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }
    void put(char ch){
        if (putloc==q.length-1){
            System.out.printIn ("Queue is full!");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
}