public class Fish {
    private int size;
    private String name;
    public Fish(int s)
    {
        this.size = s;
        this.name = "UNKNOWN";
    }
    public void identify(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return this.name;
    }
    public int getSize()
    {
        return this.size;
    }
}
