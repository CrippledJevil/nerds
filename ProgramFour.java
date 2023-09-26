public class ProgramFour {
    public static void main(String[] args) {
        int fishNum = (new Double(Math.random()*100)).intValue();
        Fish[] school = new Fish[fishNum];
        for(int i = 0; i < fishNum; i++)
        {
            school[i] = new Fish((new Double(Math.random()*20)).intValue());
        }
        identifyTuna(school);
        for(int i = 0; i < fishNum; i++)
        {
            System.out.println(school[i].getName() + ", " + school[i].getSize());
        }
    }
    public static void identifyTuna(Fish[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getSize()>10)
            {
                arr[i].identify("Tuna");
            }
        }
    } 
}
