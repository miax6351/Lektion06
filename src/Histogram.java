public class Histogram {

    public static void main(String[] args) {

    int[] numbers = new int[100];
    int[] stars = new int[10];

    for (int  i = 0; i < numbers.length; i++) {
        numbers[i] = (int) ((Math.random()*100)+1);

        if (numbers[i] < 11){
            stars[0]++;
        }
        else if (10 < numbers[i] && numbers[i] < 21){
            stars[1]++;
        }

        else if (21 < numbers[i] && numbers[i] < 31){
            stars[2]++;
        }

        else if (31 < numbers[i] && numbers[i] < 41){
            stars[3]++;
        }

        else if (41 < numbers[i] && numbers[i] < 51){
            stars[4]++;
        }

        else if (51 < numbers[i] && numbers[i] < 61){
            stars[5]++;
        }

        else if (61 < numbers[i] && numbers[i] < 71){
            stars[6]++;
        }

        else if (71 < numbers[i] && numbers[i] < 81){
            stars[7]++;
        }
        else if (81 < numbers[i] && numbers[i] < 91){
            stars[8]++;
        }
        else if (91 < numbers[i] && numbers[i] < 100){
            stars[9]++;
        }

    }

        int value = 1;
        for (int t = 0; t < 10; t++){
            //oneliner if statement, som tjekker om value er hhv. 1 og 100
            // "?" tjekker, og den efterfølgende statement viser 'if' / hvad den skal gøre
            // og efter ":" else
            System.out.print((value == 1) ? value + " " : value);
            System.out.print(((value+9) > 1 && (value + 9) < 100) ? " - " + (value + 9) + "  " : " - " + (value+9) + " ");
            System.out.print((value == 100) ? "" : " ");

            for (int star = 0; star < stars[t]; star++){
                System.out.print("*");
            }
            System.out.println();
            value += 10;
        }







    }
}
