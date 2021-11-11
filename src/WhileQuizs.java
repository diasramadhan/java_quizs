public class WhileQuizs {
    /**
     * what is the output of this code ?
     *
     * apa output dari kode ini?
     */
    public static void main(String[] args) {
        var m = 100;
        while (true){
            if ( m < 10)
                break;
            m-=10;
//            System.out.println(m); -> if you want to know the loop (jika kamu ingin tau perulangannya)
        }
        System.out.println("M = " + m);
    }
}
