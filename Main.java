class Main {
    int id;
    String name;
    public void getData(){
        System.out.println("id of the student is : " + id);
        System.out.println("name of the student is ; "+ name);
    }
    public static void main(String[] args) {
        System.out.println("custom class....!");
        Main suraj = new Main();
        suraj.id = 12;
        suraj.name = "surya";
        suraj.getData();
    }
}
