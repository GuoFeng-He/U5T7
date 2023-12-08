public class Nums {
    private int int1;
    private int int2;
    private int numGeneratedSingle;
    private static int numGeneratedAll = 0;


    public Nums(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
        numGeneratedSingle = 0;
    }

    public int randBetween(){
        numGeneratedAll++;
        numGeneratedSingle++;
        return (int)(Math.random() * (int2 - int1 + 1)) + int1;
    }

    public int getRandomNumsGenerated(){
        return numGeneratedSingle;
    }

    public static int getTotalRandomNumsGenerated(){
        return numGeneratedAll;
    }
}
