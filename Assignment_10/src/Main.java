
}ublic class main_thread {
    public static void main(String args[]){
        ThreadDemo td1= new ThreadDemo(("Nandini "));
        td1.start();
        ThreadDemo td2 = new ThreadDemo("Gupta");
        td2.start();
    }
}
