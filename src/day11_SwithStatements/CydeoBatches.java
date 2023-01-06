package day11_SwithStatements;

public class CydeoBatches {
    public static void main(String[] args) {
        String batchType="EU";
        String res ="";
        switch (batchType){

            case "US morning": res="Class times are 10-5 EST. M, T, Th, F."; break;
            case "US evening": res="Class times are 7-10 EST. M, T, W, Th, S, S"; break;
            case "EU": res="Class times are  10-5 EST. M, T, W, Th, F."; break;
            default:res="Invalid Batch";

        }
        System.out.println(res);



    }
}
