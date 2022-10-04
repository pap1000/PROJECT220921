public class ScoreAverage {
    public static void main(String[] args) {
        //2차원 배열을 선언, 각 1차원 배열은 학년별 평점이고 1차원 배열 내의 값은 각 학기별 평점임
        double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2} };
        double sum=0;

        //학년, 학기에 따라 반복하여 평점을 합산
        for(int i=0; i < score.length; i++)
            for(int k=0; k < score[i].length; k++)
                sum += score[i][k];

        System.out.println("4년 전체 평점 평균은 " + sum/8);
    }
}