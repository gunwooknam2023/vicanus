//해결하지 못했습니다

public class Question5 {
    public static void main(String[] args){
        int pond[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // 물의 깊이에 따라 숫자 증가
        int[][] result = pondDepth(pond);

        // 총 합
        int sum = sumDepth(result);

        System.out.println(sum);
    }

    public static int pondDepth(int[][] pond){

    }


    public static int sumDepth(int[][] pond) {
        int sum = 0;

        for (int i = 0; i < pond.length; i++) {
            for (int j = 0; j < pond[i].length; j++) {
                sum += pond[i][j];
            }
        }

        return sum;
    }
}

//해결하지 못했습니다